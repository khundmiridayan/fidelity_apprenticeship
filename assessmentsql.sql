CREATE TABLE Worker (
  WORKER_ID INT PRIMARY KEY,
  FIRST_NAME VARCHAR(255),
  LAST_NAME VARCHAR(255),
  SALARY INT,
  JOINING_DATE DATE,
  DEPARTMENT VARCHAR(255)
);

CREATE TABLE Title (
  WORKER_REF_ID INT,
  WORKER_TITLE VARCHAR(255),
  AFFECTED_FROM DATE,
  FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

CREATE TABLE Bonus (
  WORKER_REF_ID INT,
  BONUS_AMOUNT INT,
  BONUS_DATE DATE,
  FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);

INSERT INTO Worker (WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
  (1, 'John', 'Abraham', 100000, '2023-03-15', 'Sales'),
  (2, 'Micheal', 'Clarke', 80000, '2023-03-16', 'Marketing'),
  (3, 'Ricky', 'Ponting', 90000, '2023-03-17', 'Finance'),
  (4, 'Adam', 'Gilchrist', 60000, '2023-03-18', 'HR'),
  (5, 'Brett', 'Lee', 50000, '2023-03-19', 'IT'),
  (6, 'Shane', 'Watson', 120000, '2023-03-20', 'Operations'),
  (7, 'Andrew', 'Symonds', 110000, '2023-03-21', 'Sales'),
  (8, 'Glenn', 'McGrath', 70000, '2023-03-22', 'Marketing'),
  (9, 'Matthew', 'Hayden', 100000, '2023-03-23', 'Finance'),
  (10 , 'John', 'Abraham', 100000, '2023-03-15', 'Sales');

INSERT INTO Title (WORKER_REF_ID, WORKER_TITLE, AFFECTED_FROM) VALUES
  (1, 'Manager', '2023-03-15'),
  (2, 'Lead', '2023-03-16'),
  (3, 'Manager', '2023-03-17'),
  (4, 'Team Lead', '2023-03-18'),
  (5, 'Developer', '2023-03-19'),
  (6, 'Manager', '2023-03-20'),
  (7, 'Lead', '2023-03-21'),
  (8, 'Team Lead', '2023-03-22'),
  (9, 'Developer', '2023-03-23'),
  (1, 'Manager', '2023-03-15');

INSERT INTO Bonus (WORKER_REF_ID, BONUS_AMOUNT, BONUS_DATE) VALUES
  (1, 5000, '2023-03-15'),
  (2, 3000, '2023-03-16'),
  (3, 4000, '2023-03-17'),
  (4, 2000, '2023-03-18'),
  (5, 1000, '2023-03-19'),
  (6, 6000, '2023-03-20'),
  (7, 5000, '2023-03-21'),
  (8, 4000, '2023-03-22'),
  (9, 3000, '2023-03-23'),
  (1, 5000, '2023-03-15');
  
  SELECT w.FIRST_NAME,w.SALARY,t.WORKER_TITLE 
  FROM Worker w
  JOIN Title t ON w.WORKER_ID = t.WORKER_REF_ID;
  
  CREATE OR REPLACE FUNCTION worker_count_by_nth_highest_salary(n INT)
  RETURNS INT AS $$
  DECLARE
  worker_count INT;
  BEGIN
  WITH nth_highest AS(
	SELECT DISTINCT salary
	FROM worker 
	ORDER BY salary DESC
	LIMIT n
	OFFSET n-1)
  SELECT COUNT(*) INTO worker_count
  FROM worker 
  WHERE salary = (SELECT MAX(salary) FROM nth_highest);
  RETURN worker_count;		
		END;
		$$ LANGUAGE plpgsql;

SELECT worker_count_by_nth_highest_salary(5);
  