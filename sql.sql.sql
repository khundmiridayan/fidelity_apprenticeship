
INSERT INTO tblCustomers (CustomerName, ContactName, Country)
VALUES ('John Doe', 'John', 'USA'), ('Jane Smith', 'Jane', 'Canada');


INSERT INTO tblSupplier (SupplierName, ContactName, Country)
VALUES ('Fresh Produce Co.', 'Alice Green', 'Mexico');


INSERT INTO tblShippers (CompanyName, Phone)
VALUES ('Fast Delivery', '555-1234');


INSERT INTO tblProducts (ProductName, SupplierID, UnitPrice)
VALUES ('Apples', 1, 1.50);


INSERT INTO tblOrders (CustomerID, OrderDate, ShippedDate, ShipperID)
VALUES (1, '2023-10-01', '2023-10-05', 1);


INSERT INTO tblOrderDetails (OrderID, ProductID, Quantity, UnitPrice)
VALUES (1, 1, 5, 1.50);