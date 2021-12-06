
select * from SCOTT.emp;

select * from EUREKA.empleado;

select * from hr.jobs;

select * from RECURSOS.cargo;

select job_title, min_salary from hr.jobs;

select job_title as Titulo, min_salary as "Salario Mínimo"
from hr.jobs;

select job_title as Titulo, min_salary as SalarioMínimo
from hr.jobs;

select distinct department_id from HR.employees;

select 6+7 suma from dual;

select * from dual;


-- Ejercicio 1
-- juan padilla 9:28

Select idempleado,nombre,apellido,email from RECURSOS.empleado;

-- Ejercicio 2
-- Nancy Vega Ramos 9:31
select ALU_id, ALU_nombre,ALU_direccion, ALU_email from EDUCA.alumno;


-- Ejercicio 3
-- juan padilla 9:33
select cur_id,cur_nombre,cur_precio,cur_profesor from EDUCA.curso;



-- Ejercicio 4
-- Nancy Vega Ramos 9:34
select iddepartamento, idubicacion from RECURSOS.departamento;

-- Nancy Vega Ramos 9:35
select iddepartamento, nombre from RECURSOS.departamento;

-- Ejercicio 5
-- Jim Paul Chahuayo 9:35
SELECT CUR_NOMBRE, CUR_VACANTES, CUR_PRECIO FROM EDUCA.curso;


select * from HR.employees;

select 
   employee_id, last_name || ', ' || first_name nombre,
   salary, salary*0.20 incremento, salary*1.2 nuevosalario 
from HR.employees;


select cur_id, cur_nombre, cur_precio, cur_vacantes, cur_precio*cur_vacantes "Posible Ingreso"
from EDUCA.curso;


-- Ejercicio 6

-- Hernando Torre Camones 9:56
select COUNT(*) from EDUCA.curso ;

select CUR_MATRICULADOS/CUR_VACANTES*100 from Educa.curso;

-- juan padilla9:57
select cur_id, cur_nombre ,cur_matriculados, (cur_matriculados*100)/24 porcentaje 
from educa.curso;

-- juan padilla9:58
select cur_id, cur_nombre ,cur_matriculados, round((cur_matriculados*100)/cur_vacantes,2) porcentaje 
from educa.curso;


-- Ejercicio 7
-- Nancy Vega Ramos 9:59

select Nombre||' '||Apellido as "Nombre y apellidos" from RECURSOS.empleado;


-- Cualquier operación con NULL, el resultado es NULL.

select 6 + null suma from dual;



-- NVL 

SELECT 6 + NULL suma from dual;


select nvl(12,20) valor from dual;

select nvl(null,20) valor from dual;


select nvl2(12,20,30) valor from dual;

select nvl2(null,20,30) valor from dual;

select coalesce(43,56,23,65,78,12) valor from dual;

select coalesce(null,56,23,null,78,12) valor from dual;



select coalesce(null,null,23,null,78,12) valor from dual;

select initcap( first_name || ' ' || last_name)
from hr.employees
where department_id = 50;



select * from HR.employees
where salary < 2500;



-- OPERADORES DE COMPARACIÓN

-- Ejercicio 3
-- Jim Paul Chahuayo10:43
SELECT * FROM EDUCA.curso
WHERE CUR_MATRICULADOS =0;


-- Paula Balbin Vega10:44
-- 4. 
select * from VENTAS.producto
where precio > 50;

-- Daniel Neyra10:45
-- 5. 
select * from RECURSOS.empleado
where sueldo > 3000;


-- Jim Paul Chahuayo10:45
-- 5: 
SELECT APELLIDO,NOMBRE,SUELDO FROM RECURSOS.empleado
WHERE SUELDO >3000;


-- juan padilla10:46
select * from RECURSOS.empleado
where sueldo>3000;

-- juan padilla10:49
-- 2
select * from RECURSOS.empleado
where iddepartamento=101;


select *
from RECURSOS.empleado
where EXTRACT(year from fecingreso) = 2000
and EXTRACT(month from fecingreso) in (4,5,6);

--- Jim Paul Chahuayo 10:56
-- 01:   
SELECT a.IDEMPLEADO,a.APELLIDO,a.NOMBRE, d.NOMBRE
FROM recursos.empleado a, recursos.departamento d
WHERE a.IDDEPARTAMENTO = d.IDDEPARTAMENTO and d.IDDEPARTAMENTO = 101;


-- Nancy Vega Ramos 10:56
-- 02
select scott.emp.ename as nombre from SCOTT.EMP
where scott.emp.deptno=10
UNION
select recursos.empleado.nombre as nombre from RECURSOS.empleado 
where recursos.empleado.iddepartamento=101;

-- operadores logicos
-- OR AND NOT


SELECT * FROM HR.employees
WHERE department_id = 20  OR   department_id = 30; 



-- Paula Balbin Vega11:02
-- 1. 
SELECT * FROM RECURSOS.EMPLEADO
WHERE SUELDO >= 3500.00 and sueldo <= 10000.00;


-- Nancy Vega Ramos11:06
-- prb 3
select scott.emp.ename as nombre from SCOTT.EMP
where scott.emp.ename LIKE '_a%' or scott.emp.ename LIKE '_o%'
UNION
select recursos.empleado.nombre as nombre from RECURSOS.empleado 
where recursos.empleado.nombre LIKE '_a%' or recursos.empleado.nombre LIKE '_o%';

-- Paula Balbin Vega11:06
-- 2. 
SELECT * FROM RECURSOS.empleado
WHERE IDDEPARTAMENTO = 101 AND SUELDO > 10000.00;

-- juan padilla11:07
select * from RECURSOS.empleado
where iddepartamento=103 OR iddepartamento=106;

-- problema 5. 
select * from RECURSOS.empleado
where iddepartamento=103 OR iddepartamento=106;

-- Nancy Vega Ramos11:10
select scott.emp.ename as nombre from SCOTT.EMP
where lower(scott.emp.ename) LIKE '_a%' or lower(scott.emp.ename) LIKE '_o%'
UNION
select recursos.empleado.nombre as nombre from RECURSOS.empleado 
where recursos.empleado.nombre LIKE '_a%' or recursos.empleado.nombre LIKE '_o%';


-- LIKE
-- Comodines: _ y %

select * from HR.employees
where first_name like 'S%';


-- BETWEEN
-- Compara que un valor se encuentra dentro o fuera de un rango.
-- col1 [not] between valor1 and valor2

select * from HR.employees
where salary not between 3000 and 5000;

-- IN 
-- Compara que una columna se encuentre o no dentro de un conjunto
-- col1 [NOT] IN (valor1, valor2, etc)


select * from HR.employees
where department_id not in (60,30);

-- IS NULL
-- Verifica si una columna es o no null.
-- col1 IS [NOT] NULL

select * from HR.employees
where commission_pct is not null;


-- Paula Balbin Vega11:27
-- 8. 
select * from recursos.empleado
where nombre like '%o';


-- Nancy Vega Ramos11:27
-- 10. 
select scott.emp.ename as nombre,scott.emp.sal as sueldo from SCOTT.EMP
where scott.emp.sal BETWEEN 3000 and 10000
UNION
select recursos.empleado.nombre as nombre, recursos.empleado.sueldo as sueldo  from RECURSOS.empleado 
where recursos.empleado.sueldo BETWEEN 3000 and 10000;


-- Jim Paul Chahuayo11:29
-- 12:
SELECT a.IDEMPLEADO,a.APELLIDO,a.NOMBRE, d.NOMBRE,a.COMISION
FROM recursos.empleado a, recursos.departamento d
WHERE a.IDDEPARTAMENTO = d.IDDEPARTAMENTO 
AND d.IDDEPARTAMENTO = 103
AND a.COMISION IS NULL;

-- Paula Balbin Vega11:31
-- 7. 
select * from recursos.empleado
where nombre like '%e_';

-- Paula Balbin Vega11:34
-- 9. 
select * from recursos.empleado
where apellido like '_a%' or apellido like '_o%';
Hernando Torre Camones11:34

-- 8.- 
select * from RECURSOS.empleado 
where NOMBRE like('%o');

-- Jim Paul Chahuayo11:34
-- 11: 
SELECT a.IDEMPLEADO,a.APELLIDO,a.NOMBRE, d.NOMBRE
FROM recursos.empleado a, recursos.departamento d
WHERE a.IDDEPARTAMENTO = d.IDDEPARTAMENTO 
AND d.IDDEPARTAMENTO IN(101,106,103);

-- Nancy Vega Ramos11:35
-- 11. 
select scott.emp.ename as nombre, scott.emp.deptno as Dpto from SCOTT.EMP
where scott.emp.deptno in (10,20,30)
UNION
select recursos.empleado.nombre as nombre, recursos.empleado.iddepartamento as Dpto from RECURSOS.empleado 
where recursos.empleado.iddepartamento in (101,103,106);


select * from HR.employees
where substr(first_name,1,1) between 'D' and 'J'
order by 2;


-- Fecha inicio: 07/06/2002
-- Fecha fin:    10/03/2005

select * from HR.employees
where hire_date between TO_DATE('07/06/2002','DD/MM/YYYY') and TO_DATE('10/03/2005','DD/MM/YYYY')
order by hire_date;


select * from HR.employees
where hire_date >= TO_DATE('07/06/2002','DD/MM/YYYY')
and hire_date < TO_DATE('10/03/2005','DD/MM/YYYY') + 1
order by hire_date;



-- TO_CHAR
-- TO_DATE

-- 21
-- Nancy Vega Ramos12:49

select * from EDUCA.matricula
WHERE to_char(EDUCA.matricula.mat_fecha, 'MM')=to_char(sysdate, 'MM');



-- Jim Paul Chahuayo12:52
-- 20: 
SELECT IDEMPLEADO,APELLIDO,NOMBRE, EXTRACT(month FROM FECINGRESO) "Mes"
FROM RECURSOS.empleado
WHERE EXTRACT(month FROM FECINGRESO) = 1;
  
  
  
  