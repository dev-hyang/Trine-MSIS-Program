```sql
CREATE TABLE EMPLOYEE_UC 
(
Ssn VARCHAR(5) NOT NULL PRIMARY KEY,
Fname VARCHAR(15) NOT NULL,
Minit VARCHAR(15) NOT NULL,
Lname VARCHAR(15) NOT NULL,
Bdate Date,
Address VARCHAR(30),
Gender CHAR,
Salary DECIMAL(10, 2),
Age INT
);


CREATE TABLE DEPARTMENT_UC
(Dptname VARCHAR(15),
Dptnmbr INT NOT NULL PRIMARY KEY,
Mgr_ssn CHAR(9),
Mgr_start_date DATE,
Mgr_last_date DATE,
Ssn VARCHAR(5) FOREIGN KEY REFERENCES EMPLOYEE_UC(Ssn) ON UPDATE CASCADE
);

ALTER TABLE EMPLOYEE_UC 
ADD CHECK (Age>=18);

-- SELECT Pnumber, Dnum, Lname, Address, Bdate
-- FROM PROJECT proj
-- JOIN EMPLOYEE_DEPARTMENT dept on proj.Dnum = dept.Dnumber
-- JOIN EMPLOYEE_REC emp on dept.Mgr_ssn = emp.Ssn
-- WHERE Dnum = Dnumber, Mgr_ssn = Ssn and Plocation = 'Stafford';

SELECT Pnumber, Dnum, Lname, Address, Bdate
FROM PROJECT, EMPLOYEE_DEPARTMENT, EMPLOYEE_REC
WHERE Dnum = Dnumber and Mgr_ssn = Ssn and Plocation = 'Stafford';

-- SELECT Fname, Lname, Address 
-- FROM EMPLOYEE_REC E, EMPLOYEE_DEPARTMENT D
-- WHERE D.Dname = 'Research' and D.Dnumber = E.Dno;

SELECT Fname, Lname, Address 
FROM EMPLOYEE_REC E, EMPLOYEE_DEPARTMENT D
WHERE D.Dname = 'Research' and D.Dnumber = E.Dno;

-- 10 Description is incorrect with conflicts

-- 14 the part of data is missing
INSERT INTO EMPLOYEE_REC (Fname, Minit, Lname, Ssn, Bdate, Address, Sex, Salary, Super_ssn, Dno)
VALUES ('Richard', 'K', 'Marini', '653298653', '1962-12-30', '98 Oak Forest, Katy, TX', 'M', 37000, '653298653', 4);


--15
INSERT INTO WORKS_ON_INFO (Emp_name, Proj_name, Hours_per_week)
SELECT E.Lname, P.Pname, W.Hours
FROM PROJECT P, WORKS_ON W, EMPLOYEE_REC E
WHERE P.Pnumber = W.Pno AND W.Essn = E.Ssn;

--16
DELETE * FROM EMPLOYEE_REC WHERE Lname = 'Wallace';
DELETE FROM EMPLOYEE_REC WHERE Lname = 'Wallace';

--17
UPDATE PROJECT
SET Plocation = 'Bellaire', Dnum = 5
WHERE Pnumber = 10;
```
