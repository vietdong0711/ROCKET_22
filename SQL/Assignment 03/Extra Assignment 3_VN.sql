SELECT * FROM fresher_training_management.trainee;

use fresher_training_management;

-- Q1 
INSERT INTO trainee (Full_Name, VTI_Account, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class, Evaluation_Notes)
VALUES ('Nguyễn Viết Đồng', 'vdong', '1999/11/07', 'male', 20, 20, 50, '001', 'good'),
		('Nguyễn Văn Nam', 'vnam', '2000/11/07', 'unknown', 19, 18, 17, '002', 'not good'),
        ('Nguyễn Thị Hằng', 'thang', '2000/10/18', 'female', 20, 20, 50, '001', 'good'),
        ('Trần Hiếu', 'thieu', '1999/07/07', 'male', 12, 10, 45, '003', 'good'),
        ('Phạm Văn Danh', 'vdanh', '1999/01/06', 'male', 2, 5, 34, '002', 'not good'),
        ('Phạm Thu Thủy', 'tthuy', '2001/03/19', 'female', 18, 14, 46, '003', 'good'),
        ('Nguyễn Thị Sinh', 'tsinh', '2000/09/07', 'female', 20, 20, 50, '001', 'good'),
        ('Nguyễn Văn Tuấn', 'vtuan', '1999/06/03', 'male', 17, 7, 50, '002', 'not good'),
        ('Lý Thị Thắm', 'ttham', '1999/08/07', 'female', 16, 17, 33, '001', 'good'),
        ('Ngô Thị Lâm', 'tlam', '2000/07/08', 'female', 10, 10, 25, '001', 'not good');
-- Q2
SELECT *
FROM trainee 
ORDER BY MONTH(Birth_Date) ASC;
-- Q3
SELECT * 
FROM trainee 
WHERE LENGTH(Full_Name) = (SELECT MAX(LENGTH(Full_Name)) FROM trainee);
-- Q4
SELECT *
FROM trainee 
WHERE ET_IQ+ET_Gmath>=29 AND ET_IQ>=8 AND ET_Gmath>=8 AND ET_English >=18;
-- Q5 
DELETE 
FROM trainee 
WHERE TraineeID = 3;
-- Q6
UPDATE trainee
SET Training_Class = "2"
WHERE TraineeID=5;

