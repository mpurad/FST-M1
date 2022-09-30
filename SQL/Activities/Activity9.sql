SELECT s.salesman_name AS Salesman, c.customer_name AS Customer FROM salesman s INNER JOIN customers c ON s.salesman_id = c.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a 
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300 
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, b.salesman_name, b.commission FROM customers a
INNER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE b.commission > 12;

SELECT o.order_no, o.order_date, o.purchase_amount, c.customer_name, s.salesman_name, s.commission FROM orders o
INNER JOIN customers c ON o.customer_id = c.customer_id
INNER JOIN salesman s ON o.salesman_id = s.salesman_id;