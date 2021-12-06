
-- subconsulta escalar

select * 
from HR.employees
where salary < (select avg(salary) from HR.employees);


/*
Empleados que tienen el menor salario en el departamento 80
*/

select * 
from HR.employees e
WHERE e.department_id = 20
and e.salary = (select min(salary) from HR.employees where department_id = 20);


select * 
from HR.employees e
join (select min(salary) salary from HR.employees where department_id = 20) t
on e.salary = t.salary
WHERE e.department_id = 20;



-- Versión WITH

WITH
v1 as (
   select min(salary) salary from HR.employees where department_id = 20
)
select e.*
from HR.employees e 
join v1 on e.salary = v1.salary
where e.department_id = 20;



-- Ejemplo multiples filas

select last_name, first_name, department_id
from hr.employees
where department_id in ( select department_id
from hr.employees
where first_name = 'John' );


WITH
V1 AS (
   select department_id
   from hr.employees
   where first_name = 'John'
)
select last_name, first_name, e.department_id
from hr.employees e
JOIN V1 on e.department_id = v1.department_id;



/*
Empleado con el salario maximo por departamento.
*/

-- Solucion 1

select department_id, last_name, salary
from hr.employees e1
where salary = ( select max(salary)
from hr.employees e2
where e1.department_id = e2.department_id );


-- Solucion 2

select e.department_id, last_name, e.salary
from hr.employees e
join ( select department_id, max(salary) salary
       from hr.employees e2
       group by department_id ) t
on e.department_id = t.department_id and e.salary = t.salary;

-- Solucion 3

select department_id, last_name, salary
from hr.employees
where (department_id, salary) in ( 
                     select department_id, max(salary) salary
                     from hr.employees e2
                     group by department_id );
                     
-- solucion 4   

with 
v1 as (
   select department_id, max(salary) salary
    from hr.employees e2
    group by department_id
)
select e.department_id, last_name, e.salary
from hr.employees e
join v1 on e.department_id = v1.department_id and e.salary = v1.salary;
                     
      
      
                     
                     