

SELECT AVG(MAT_NOTA) 
FROM EDUCA.matricula
WHERE CUR_ID=1;




SELECT COUNT(*) FROM HR.employees;

SELECT COUNT(employee_id) FROM HR.employees;

SELECT COUNT(DISTINCT department_id) FROM HR.employees;

SELECT COUNT(commission_pct) FROM HR.employees;

SELECT COUNT(1) FROM HR.employees;




select
   department_id as Departamento,
   count(1) as Empleados
from HR.employees
group by department_id;


select
   department_id as Departamento,
   count(1) as Empleados
from HR.employees
group by department_id
HAVING count(1)=1;


-- 1
-- Nancy Vega Ramos13:31
select sum((sueldo+nvl(comision,0))) as "Importe total de planilla" 
from recursos.empleado
where iddepartamento='103';


-- 2
-- Nancy Vega Ramos13:38
select max(sueldo) as "Sueldo max", min(sueldo) as "Sueldo min" 
from recursos.empleado
where iddepartamento='103';



-- 14
/*
De cada curso se necesita saber la cantidad de alumnos matriculados 
y el importe que se tiene proyectado recaudar por los alumnos 
matriculados. Esquema: EDUCA.
*/


select 
   cur_id,
   count(1) matriculados,
   sum(mat_precio) importe
from EDUCA.matricula
group by cur_id;


-- 17
/*
Desarrolle una consulta que permita conocer quienes son los clientes 
que tienen solo una cuenta: Esquema: EUREKA.
*/


select 
   chr_cliecodigo,
   count(1) cuentas
from EUREKA.cuenta
group by chr_cliecodigo
having count(1) = 1;

