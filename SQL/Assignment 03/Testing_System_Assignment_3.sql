USE Testing_System_Assignment;

-- 1
-- làm ở bài 2 rồi---

-- 2
SELECT DepartmentName
 FROM department;
-- 3
SELECT DepartmentID
 FROM department 
 WHERE DepartmentName LIKE "Sale";
-- 4
SELECT *, length(FullName) 
FROM `account` 
WHERE length(FullName) = (SELECT max(length(FullName)) FROM `account`);
-- 5 
SELECT *, length(FullName) 
FROM `account` 
WHERE length(FullName) = (SELECT max(length(FullName)) FROM `account`) AND PositionID=3 ;

-- 6
SELECT GroupName 
FROM `group` 
WHERE CreateDate < 2019/12/20;
-- 7 
SELECT QuestionID,count(QuestionID) AS so_cau_tra_loi 
FROM answer 
GROUP BY QuestionID 
HAVING COUNT(QuestionID)>=4;
-- 8
SELECT `code` 
FROM exam 
WHERE Duration>=60 AND CreateDate <2019/12/20;
-- 9
SELECT * 
FROM `group` 
ORDER BY CreateDate 
DESC LIMIT 5;
-- 10
SELECT COUNT(*) 
FROM department 
WHERE DepartmentID=2;
-- 11
SELECT * 
FROM `account` 
WHERE SUBSTRING_INDEX(FullName,' ',-1) LIKE "D%" AND SUBSTRING_INDEX(FullName,' ',-1) LIKE "%g";
-- 12 
DELETE  
FROM examquestion
WHERE ExamID IN (SELECT ExamID FROM `Exam` WHERE CreateDate < '2019/12/20');
DELETE 
FROM `Exam` 
WHERE CreateDate < '2019/12/20';
-- 13
DELETE 
FROM examquestion
WHERE QuestionID IN (SELECT QuestionID FROM question WHERE Content LIKE "Câu hỏi%");
DELETE 
FROM question 
WHERE Content LIKE "Câu hỏi%";
-- 14 
UPDATE `account` 
SET FullName = 'Nguyễn Bá Lộc', Email='loc.nguyenba@vti.com.vn'
WHERE AccountID =5;
-- 15
UPDATE groupaccount 
SET GroupID= 4
WHERE AccountID=5;