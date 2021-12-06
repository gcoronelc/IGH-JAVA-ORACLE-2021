
-- VENTAS

INSERT INTO VENTA VALUES(1,'Gustavo',1001,sysdate,0);
INSERT INTO VENTA VALUES(2,'Gustavo',1002,sysdate+2,0);
INSERT INTO VENTA VALUES(3,'Gustavo',1003,sysdate+4,0);
INSERT INTO VENTA VALUES(4,'Gustavo',1004,sysdate+4,0);
INSERT INTO VENTA VALUES(5,'Gustavo',1001,sysdate+10,0);
INSERT INTO VENTA VALUES(6,'Gustavo',1002,sysdate+20,0);
commit;

select * from venta;

-- Detalles de las ventas

insert into detalle values(1,1,1001,0,3,0);
insert into detalle values(2,1,1002,0,4,0);
insert into detalle values(3,1,1005,0,6,0);
commit;

insert into detalle values(4,2,1003,0,2,0);
insert into detalle values(5,2,1004,0,1,0);
insert into detalle values(6,2,1005,0,4,0);
commit;

insert into detalle values(7,3,1002,0,3,0);
insert into detalle values(8,3,1005,0,1,0);
insert into detalle values(9,3,1007,0,2,0);
commit;


insert into detalle values(10,4,1001,0,2,0);
insert into detalle values(11,4,1003,0,4,0);
insert into detalle values(12,4,1006,0,5,0);
commit;


insert into detalle values(13,5,1002,0,3,0);
insert into detalle values(14,5,1004,0,5,0);
insert into detalle values(15,5,1007,0,2,0);
commit;


insert into detalle values(16,6,1003,0,1,0);
insert into detalle values(17,6,1002,0,4,0);
insert into detalle values(18,6,1005,0,8,0);
commit;


-- Precio

update detalle
set precio = (select precio from producto where producto.idprod = detalle.idprod);
commit;

-- subtotal
update detalle
set subtotal = cant * precio;
commit;

-- venta.importe
update venta
set importe = (select sum(subtotal) from detalle where detalle.idventa=venta.idventa);
commit;












