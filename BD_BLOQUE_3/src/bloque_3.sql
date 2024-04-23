-- 1- Total de empleados en la empresa

SELECT count(*) FROM empleado;

-- 2- Total de clientes de cada uno de los países

SELECT count(*) as total, pais  FROM cliente c group by pais;

-- 3- Mostrar la media del importe de pagos de un año indicado (pedir año por teclado)

SELECT AVG(total) FROM pago WHERE YEAR(fecha_pago) = 2007;

-- 4- Mostrar la cantidad de pedidos para cada uno de los estados

SELECT COUNT(*) AS total, estado  FROM pedido GROUP BY estado ;

-- 5- Mostrar el importe más alto y más bajo de los productos (solo el importe máximo y mínimo, no hace falta nombre. Todo con una sola consulta)

SELECT MAX(precio_venta) AS maximo, MIN(precio_venta) as minimo FROM producto;

-- 6- Cantidad total de clientes

SELECT count(*) FROM cliente;

-- 7- Cantidad total de clientes de una determinada ciudad (pedir ciudad por teclado)

SELECT count(*) FROM cliente WHERE  ciudad = 'madrid';

-- 8- Mostrar todos los representantes con su cantidad de clientes

SELECT CONCAT(e.nombre," ",e.apellido1," ",e.apellido2) as representante, COUNT(c.codigo_cliente) as cantidad_clientes
FROM empleado e INNER JOIN cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas
WHERE e.puesto = 'Representante Ventas' group by e.codigo_empleado;

-- 9- Mostrar cantidad de clientes sin representante de ventas

SELECT COUNT(c.codigo_cliente) as cantidad_clientes_sin_representante
FROM empleado e INNER JOIN cliente c ON e.codigo_empleado = c.codigo_empleado_rep_ventas
WHERE e.puesto != 'Representante Ventas';

-- 10- Mostrar  nombre completo de clientes y las fechas de su primer y último pago realizado

SELECT c.nombre_cliente, MAX(p.fecha_pago) as ultima, MIN(p.fecha_pago) as primera 
FROM cliente c INNER JOIN pago p ON c.codigo_cliente = p.codigo_cliente
GROUP BY p.codigo_cliente;

-- 11- Cantidad de productos diferentes en cada uno de los pedidos (mostrar también la información del pedido)

SELECT p.fecha_pedido, p.estado, COUNT(dp.codigo_producto) AS productos
FROM pedido p INNER JOIN detalle_pedido dp ON p.codigo_pedido  = dp.codigo_pedido  
GROUP BY p.codigo_pedido ;

-- 12- Mostrar información de cada pedido junto con el importe total (sumar importes de cada uno de los productos del pedido)

SELECT p.fecha_pedido, p.estado, SUM(dp.cantidad*dp.precio_unidad) as total
FROM pedido p INNER JOIN detalle_pedido dp ON p.codigo_pedido  = dp.codigo_pedido  
GROUP BY p.codigo_pedido;

-- 13- Los 20 productos más vendidos (mostrar el total de unidades vendidas y los resultados ordenados de mayor a menor unidades vendidas)

SELECT p.nombre as nombre, SUM(dp.cantidad) as total 
FROM producto p INNER JOIN detalle_pedido dp ON p.codigo_producto = dp.codigo_producto 
GROUP BY p.codigo_producto ORDER by total desc limit 20;

-- 14- Facturación total de la empresa (mostrar la base imponible, el IVA y el total facturado. La base imponible se calcula sumando el coste 
-- del producto por el número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base imponible, y el total la suma de los dos campos anteriores)

SELECT p.nombre as nombre, SUM(dp.cantidad) as total 
FROM producto p INNER JOIN detalle_pedido dp ON p.codigo_producto = dp.codigo_producto 
GROUP BY p.codigo_producto ORDER by total desc limit 20;

-- 15- Ventas totales de los productos que facturen más de cierta cantidad (pedir cantidad por teclado. Se mostrará el nombre, unidades vendidas, 
-- total facturado y total facturado con impuestos (21% IVA))


-- 16- Suma total de todos los pagos realizados agrupados por año.

SELECT YEAR(fecha_pago) as year, SUM(total) FROM pago p GROUP BY YEAR(p.fecha_pago);