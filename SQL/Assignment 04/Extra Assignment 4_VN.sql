DROP DATABASE IF EXISTS Ex4;
CREATE DATABASE Ex4;
USE Ex4;

-- 1
DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
	Department_Number INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	Department_Name VARCHAR(225)
);

DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE Employee_Table(
	Employee_Number INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	Employee_Name VARCHAR(225),
    Department_Number INT,
    FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number)
);

DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table(
	Skill_code VARCHAR(20),
	`Date Registered` DATE,
    Employee_Number INT,
    FOREIGN KEY (Employee_Number) REFERENCES Employee_Table(Employee_Number)
);

-- 2
	-- Department
    INSERT INTO Department (Department_Name) VALUES ("Nhân sự"),
								("Kế toán"),
                                ("Tuyển dụng"),
                                ("Sale"),
                                ("Quản lí"),
                                ("Bảo vệ"),
                                ("Hỗ trợ"),
                                ("Giám đốc"),
                                ("Livestream"),
                                ("Vui chơi");
    
    -- Employee_Table
	INSERT INTO Employee_Table (Employee_Name, Department_Number) VALUES ("Nguyễn Viết Đồng", 1),
																		("Trần Văn Đạt", 3),
                                                                        ("Phạm Văn Nam", 2),
                                                                        ("Trần Thị Lan", 6),
                                                                        ("Nguyễn Thị HƯơng", 1),
                                                                        ("Trần Thị Hằng", 4),
                                                                        ("Lê Văn Minh", 8),
                                                                        ("Trần Bá Tâm", 1),
                                                                        ("Nguyễn Minh Phú", 2),
                                                                        ("Nguyễn Thị Liên", 5);
    
    -- Employee_Skill_Table
    INSERT INTO Employee_Skill_Table (Employee_Number, Skill_Code, `Date Registered`) VALUES (1,"Java", "2020/10/10"),
																							(2,"SQL", "2021/10/10"),
                                                                                            (3,"C++", "2010/10/10"),
                                                                                            (4,"Java", "2016/10/10"),
                                                                                            (5,"C++", "2018/10/10"),
                                                                                            (1,"SQL", "2013/10/10"),
                                                                                            (3,"C++", "2017/10/10"),
                                                                                            (7,"Java", "2019/10/10"),
                                                                                            (8,"C++", "2021/10/10"),
                                                                                            (9,"SQL", "2014/10/10");
    
-- 3
SELECT et.Employee_Name
FROM Employee_Table et JOIN Employee_Skill_Table est ON et.Employee_Number = est.Employee_Number AND Skill_code ="Java";

-- 4
SELECT e.Department_Namer
FROM Employee_Table e JOIN  Department d ON e.Department_Number = d.Department_Number
GROUP BY e.Department_Number 
HAVING COUNT(e.Department_Number) >3;

-- 5
SELECT  d.Department_Name,e.Employee_Name
FROM Employee_Table e JOIN  Department d ON e.Department_Number = d.Department_Number
GROUP BY e.Department_Number,e. Employee_Number
ORDER BY e.Department_Number ASC;
    
-- 6 
SELECT  et.Employee_Name,  COUNT(et.Employee_Number) AS so_skill
FROM Employee_Table et LEFT JOIN  Employee_Skill_Table est ON et.Employee_Number = est.Employee_Number
WHERE Skill_code IS NOT NULL
GROUP BY et.Employee_Number
HAVING COUNT(et.Employee_Number)>1
    
    
    
    
    
    
																		