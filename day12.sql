CREATE TABLE customers (
  customer_id VARCHAR(10) PRIMARY KEY,
  customer_name VARCHAR(20),
  address VARCHAR(20),
  phone_no BIGINT,
  email_id VARCHAR(20)
);

CREATE TABLE delivery_partners (
  partner_id VARCHAR(10) PRIMARY KEY,
  partner_name VARCHAR(20),
  phone_no BIGINT,
  rating INT
);

CREATE TABLE hotel_details (
  hotel_id VARCHAR(10) PRIMARY KEY,
  hotel_name VARCHAR(20),
  hotel_type VARCHAR(20),
  rating INT
);

CREATE TABLE orders (
  order_id VARCHAR(10) PRIMARY KEY,
  customer_id VARCHAR(10),
  hotel_id VARCHAR(10),
  partner_id VARCHAR(10),
  order_date DATE,
  order_amount INT,
  FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
  FOREIGN KEY (hotel_id) REFERENCES hotel_details(hotel_id),
  FOREIGN KEY (partner_id) REFERENCES delivery_partners(partner_id)
);

INSERT INTO customers (customer_id, customer_name, address, phone_no, email_id) VALUES
('1', 'John Doe', '123 Main St', 1234567890, 'john@gmail.com'),
('2', 'Jane Doe', '456 Elm St', 9876543210, 'jane@gmail.com'),
('3', 'Mike Smith', '789 Oak St', 5551234567, 'mike@gmail.com'),
('4', 'Sarah Jones', '1011 Pine St', 5555551212, 'sarah@gmail.com');

INSERT INTO delivery_partners (partner_id, partner_name, phone_no, rating) VALUES
('1', 'Partner 1', 1234567890, 4),
('2', 'Partner 2', 9876543210, 5),
('3', 'Partner 3', 5551234567, 3),
('4', 'Partner 4', 5555551212, 4);

INSERT INTO hotel_details (hotel_id, hotel_name, hotel_type, rating) VALUES
('1', 'Hotel A', 'Luxury', 4),
('2', 'Hotel B', 'Budget', 3),
('3', 'Hotel C', 'Boutique', 5),
('4', 'Hotel D', 'Motel', 2);

INSERT INTO orders (order_id, customer_id, hotel_id, partner_id, order_date, order_amount) VALUES
('1', '1', '1', '1', '2023-03-08', 100),
('2', '2', '2', '2', '2023-03-09', 50),
('3', '3', '3', '3', '2023-03-10', 150),
('4', '4', '4', '4', '2023-03-11',200);

SELECT partner_id,partner_name,phone_no
FROM delivery_partners
WHERE rating BETWEEN 3 AND 5
ORDER BY partner_id;

UPDATE Customers
SET Phone_no = 9876543210
WHERE customer_id = '2'; 

SELECT customer_id,customer_name,address,phone_no
FROM Customers
WHERE email_id LIKE '%@gmail.com'
ORDER BY customer_id;

ALTER TABLE customers
MODIFY customer_id INT;

ALTER TABLE hotel_details
RENAME COLUMN rating TO hotel_rating

SELECT hotel_name, hotel_type
FROM hotel_details
ORDER BY hotel_name DESC;

SELECT 
    hotel_details.hotel_id,
    hotel_details.hotel_name,
    COUNT(orders.hotel_id) AS NO_OF_ORDERS
FROM
    hotel_details
JOIN
    orders ON hotel_details.hotel_id = orders.hotel_id
GROUP BY 
    hotel_details.hotel_id,
    hotel_details.hotel_name
HAVING 
    COUNT(orders.hotel_id) > 5
ORDER BY 
    hotel_details.hotel_id;

SELECT hd.hotel_id, hd.hotel_name, hd.hotel_type
FROM hotel_details hd
LEFT JOIN orders o ON hd.hotel_id = o.hotel_id
WHERE o.order_date NOT BETWEEN '2023-03-01' AND '2023-03-31'
GROUP BY hd.hotel_id, hd.hotel_name, hd.hotel_type
HAVING COUNT(DISTINCT o.order_id) = 0
ORDER BY hd.hotel_id ASC;

SELECT
    o.order_id,
    c.customer_name,
    h.hotel_name,
    o.order_amount
FROM
    orders o
JOIN
    customers c ON o.customer_id = c.customer_id
JOIN
    hotel_details h ON o.hotel_id = h.hotel_id
ORDER BY
    o.order_id ASC;

CREATE TABLE pizza(pizza_id INT, pizza_type VARCHAR(50),amount DECIMAL(10,2));

INSERT INTO pizza (pizza_id, pizza_type, amount)
VALUES
  (1, 'Small', 10.99),
  (2, 'Medium', 14.99),
  (3, 'Large', 19.99),
  (4, 'Extra Large', 24.99),
  (5, 'Extra Large', 29.99),
  (6, 'Medium', 14.99),
  (7, 'Small', 10.99),
  (8, 'Large', 19.99),
  (9, 'Extra Large', 34.99),
  (10, 'Large', 19.99);

  UPDATE pizza 
  Set amount =amount *0.97
  WHERE pizza_type = 'Extra Large';
 

