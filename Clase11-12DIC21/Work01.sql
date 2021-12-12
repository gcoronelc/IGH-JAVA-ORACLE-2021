/*
Los departamentos que tiene empleados.
*/


select * from RECURSOS.departamento;


-- SOL 1
select * 
from RECURSOS.departamento
where iddepartamento in (select iddepartamento from RECURSOS.empleado);


-- SOL 2
select distinct d.* 
from RECURSOS.departamento d 
join recursos.empleado e on d.iddepartamento = e.iddepartamento;


-- SOL 3
select * from RECURSOS.departamento d
where exists (select iddepartamento from RECURSOS.empleado e where e.iddepartamento=d.iddepartamento);


-- Estando en SCOTT

-- TRUNCATE TABLE

select * from dept;
select * from emp;

drop table copia_emp purge;

create table copia_emp
as select * from emp;

DELETE FROM dept;

TRUNCATE TABLE dept;



-- Estando en ventas

grant references on producto to scott;


-- Estando en SCOTT
-- Scott necesita un privilegio para referenciar a la tabla producto

create table scott.venta(
  idventa number(10,0) primary key,
  idproducto number(10,0) not null,
  importe number(12,2) not null,
  constraint fk_venta_producto 
  foreign key(idproducto) references ventas.producto
);


insert into scott.venta values(1,1002,1000);

select * from scott.venta;



