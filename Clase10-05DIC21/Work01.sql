/*
Ejemplo 1
Combinar 2 tablas
*/

select regions.region_id, region_name, country_name
from hr.regions, hr.countries
where regions.region_id = countries.region_id;


select regions.region_id, region_name, country_name
from hr.regions
join hr.countries
on regions.region_id = countries.region_id;




/*
Ejemplo 2
-------------------------------------------------
*/

-- Caso 1
select locations.location_id, city, department_name
from hr.locations, hr.departments
where (locations.location_id = departments.location_id)
and (locations.country_id != 'US');

-- Caso 2
select locations.location_id, city, department_name
from hr.locations
join hr.departments on (locations.location_id = departments.location_id)
where (locations.country_id != 'US');


-- Caso 3: Natural JOIN
-----------------------------------------------
select location_id, city, department_name
from hr.locations natural join hr.departments
where (country_id != 'US');


-- Caso 4: USING
------------------------------------------------------------------
select location_id, city, department_name
from hr.locations join hr.departments using (location_id)
where (country_id != 'US');



/*
JOIN - ON
--------------------------------------------------
*/
select region_name, country_name, city
from hr.regions r
join hr.countries c on (r.region_id=c.region_id)
join hr.locations l on (c.country_id=l.country_id)
where c.country_id = 'US';


/*
Cuidado con los JOIN
Desarrollar una consulta que muestre la siquiente información
por empleado.

NOMBRE EMPLEADO    CANT. VENTAS   IMPORTE TOTAL   CANT. PRODUCTOS  
----------------------------------------------------------------------
.......
----------------------------------------------------------------------

*/

SELECT 
   e.nombre, e.apellido,
   COUNT(DISTINCT V.IDVENTA) "CANT. VENTAS",
   SUM(d.subtotal) "IMPORTE TOTAL",
   SUM(d.cant) "CANT. PRODUCTOS"
FROM VENTAS.EMPLEADO E
JOIN VENTAS.venta V ON e.idemp = v.idemp
JOIN VENTAS.detalle D ON v.idventa = d.idventa
GROUP BY e.nombre, e.apellido;

SELECT * 
FROM VENTAS.venta V
JOIN VENTAS.DETALLE D ON v.idventa = d.idventa;


/*
PRODUCTO CARTESIANO
-----------------------------------------------------------------------
*/

select region_name, country_name
from HR.regions, HR.countries;

select region_name, country_name
from HR.regions CROSS JOIN HR.countries;




-- LEFT JOIN

select *
from hr.countries c left join hr.locations l 
on (c.country_id= l.country_id)
where (c.country_name like 'A%');

-- Solo en oracle
select c.country_name, l.city
from hr.countries c, hr.locations l
where ( c.country_id = l.country_id (+) )
and ( c.country_name like 'A%' );


-- RIGHT
select *
from hr.locations l  RIGHT join hr.countries c
on (c.country_id= l.country_id)
where (c.country_name like 'A%');


select * from HR.employees;


-- SELD-JOINS

select e.last_name Employee, m.last_name Manager
from HR.employees e inner join HR.employees m
on m.employee_id = e.manager_id;


-- Nonequality Joins

SELECT * FROM SCOTT.salgrade;

select ename, sal, grade
from scott.emp, scott.salgrade
where sal between losal and hisal;


-- Operadores de Conjuntos
/*
   <consulta 1>
   <operador 1>
   <consulta 2>
   <operador 2>
   <consulta 3>
   <operador 3>
   <consulta 4>

Todas las consultas deben tener la misma cantidad 
de columnas y ser compatibes respectivamente.

El ORDER BY solo se puede aplicar a la ultima consulta.
   
*/

select last_name, hire_date
from hr.employees
where department_id = 90
UNION 
select last_name, hire_date
from hr.employees
where last_name like 'K%';

select last_name, hire_date
from hr.employees
where department_id = 90
UNION ALL
select last_name, hire_date
from hr.employees
where last_name like 'K%';


select last_name, hire_date
from hr.employees
where department_id = 90
MINUS
select last_name, hire_date
from hr.employees
where last_name like 'K%';

select last_name, hire_date
from hr.employees
where department_id = 90
INTERSECT
select last_name, hire_date
from hr.employees
where last_name like 'K%';









