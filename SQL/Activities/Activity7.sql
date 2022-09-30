SELECT SUM(purchase_amount) AS total from orders;

SELECT AVG(purchase_amount) AS average from orders;

SELECT MAX(purchase_amount) AS maximum from orders;

SELECT MIN(purchase_amount) AS minimum from orders;

SELECT COUNT(DISTINCT(salesman_id)) AS noOfSalesman from orders;