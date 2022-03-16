use testing_system_assignment;

-- 1
drop procedure if exists findAccountByDepartname;
delimiter &&
create procedure findAccountByDepartname(IN dName varchar(225))
begin
	select a.*, d.DepartmentName
	from `account` a join department d on a.DepartmentID = d.DepartmentID
	where d.DepartmentName = dName;
end&&
delimiter ;

-- 2
drop procedure if exists countAccountInGroup;
delimiter &&
create procedure countAccountInGroup()
begin
	select g.GroupName, count(*) as so_luong
	from groupaccount ga join `group` g on ga.GroupID = g.GroupID
	group by ga.GroupID;
end &&
delimiter ;

call countAccountInGroup();

-- 3
drop procedure if exists countQuestionInMonth;
delimiter &&
create procedure countQuestionInMonth()
begin
	select t.TypeName, count(*) as so_luong
	from question q join typequestion t on q.TypeID = t.TypeID
    where EXTRACT(YEAR_MONTH FROM q.CreateDate) = 202203
	group by q.TypeID;
end &&
delimiter ;

call countQuestionInMonth();

-- 4
drop procedure if exists findTypeID;
delimiter &&
create procedure findTypeID()
begin
	select TypeID, count(*) as so_luong
	from question 
	group by TypeID
    having count(*) = (select count(*) as so_luong
	from question 
	group by TypeID 
    limit 1);
end &&
delimiter ;

call findTypeID();

-- 5
drop procedure if exists findTypeName;
delimiter &&
create procedure findTypeName()
begin
	select t.TypeName, count(*) as so_luong
	from question q join typequestion t on q.TypeID = t.TypeID
	group by q.TypeID
    having count(*) = (select count(*) as so_luong
	from question q join typequestion t on q.TypeID = t.TypeID
	group by q.TypeID 
    limit 1);
end &&
delimiter ;

call findTypeName();

-- 6
drop procedure if exists findGroupNameAndUsername;
delimiter &&
create procedure findGroupNameAndUsername(in ten varchar(225))
begin
	select g.GroupName
	from `group` g 
    where g.GroupName like concat('%',ten,'%')
    union
    select a.Username
	from account a
    where a.Username like concat('%',ten,'%');
end &&
delimiter ;

call findGroupNameAndUsername('a');

-- 7
drop procedure if exists createAccount;
delimiter &&
create procedure createAccount(in ten varchar(225), in email varchar(225))
begin
	insert into account (Email, UserName, FullName, DepartmentID, PositionID)
    values(email, substring_index(email,'@',1), ten, (select PositionID from position where PositionName='Dev'), 1);
end &&
delimiter ;

call createAccount('dong1', 'dongdon1g@gmail.com');

-- 8
drop procedure if exists findContentMax;
delimiter &&
create procedure findContentMax(in typeName enum('Essay','Multiple-Choice'))
begin
	select q.Content
    from question q join typequestion t on q.TypeID = t.TypeID
    where t.TypeName = typeName and q.QuestionID in (select q.QuestionID from question q join typequestion t on q.TypeID = t.TypeID where t.TypeName = typeName and length(q.Content) = (select max(length(q.Content)) from question q join typequestion t on q.TypeID = t.TypeID where t.TypeName = typeName ));   
end &&
delimiter ;

call findContentMax('Essay');

-- 9 
drop procedure if exists deleteExamByID;
delimiter &&
create procedure deleteExamByID(in id int)
begin
	delete from exam where ExamID = id;
end &&
delimiter ;

call deleteExamByID(2);

-- 10
drop procedure if exists deleteExamBefor3Year;
delimiter &&
create procedure deleteExamBefor3Year()
begin
	declare soluong int default 0;
    declare soluong1 int default 0;
    declare i int default 1;
    declare id int;
    select count(ExamID) into soluong from exam where year(now()) - year(CreateDate) >3 ;
	select count(*) into soluong1 from examquestion eq join exam e on eq.ExamID = e.ExamID where year(now()) - year(e.CreateDate) >3 ;
    while(i<= soluong) do
		select ExamID into id from exam where year(now()) - year(CreateDate) >3 limit 1;
        call deleteExamByID(id);
        set i = i+1;
	end while; 
    select concat('ở bảng exam xóa ',soluong,' hàng. ở bảng examquestion xóa', soluong1, ' hàng. Tổng xóa ', soluong+ soluong1, ' hàng' ) as thongbao;
    
end &&

delimiter ;

call deleteExamBefor3Year();

-- 11
drop procedure if exists deleteDepartment;
delimiter &&
create procedure deleteDepartment(in dName varchar(255))
begin
    update account a set  a.DepartmentID = 11 where a.DepartmentID = (select DepartmentID from department where DepartmentName = dName);
    delete from department where DepartmentName = dName;
end &&
delimiter ;

call deleteDepartment('Kỹ thuật');

-- 12

DROP PROCEDURE IF EXISTS sp_CountQuesInMonth;
DELIMITER $$
CREATE PROCEDURE sp_CountQuesInMonth()
BEGIN
WITH CTE_12Months AS (
SELECT 1 AS MONTH
UNION SELECT 2 AS MONTH
UNION SELECT 3 AS MONTH
UNION SELECT 4 AS MONTH
UNION SELECT 5 AS MONTH
UNION SELECT 6 AS MONTH
UNION SELECT 7 AS MONTH
UNION SELECT 8 AS MONTH
UNION SELECT 9 AS MONTH
UNION SELECT 10 AS MONTH
UNION SELECT 11 AS MONTH
UNION SELECT 12 AS MONTH
)
SELECT M.MONTH, count(month(Q.CreateDate)) AS SL FROM CTE_12Months M
LEFT JOIN (SELECT * FROM question Q1 WHERE year(Q1.CreateDate) = year(now()) ) Q
ON M.MONTH = month(Q.CreateDate)
GROUP BY M.MONTH;
END$$
DELIMITER ;
Call sp_CountQuesInMonth();

-- 13

DROP PROCEDURE IF EXISTS sp_CountQuesBefore6Month;
DELIMITER $$
CREATE PROCEDURE sp_CountQuesBefore6Month()
BEGIN
WITH CTE_Talbe_6MonthBefore AS (

SELECT MONTH(DATE_SUB(NOW(), INTERVAL 5 MONTH)) AS MONTH,

YEAR(DATE_SUB(NOW(), INTERVAL 5 MONTH)) AS `YEAR`

UNION
SELECT MONTH(DATE_SUB(NOW(), INTERVAL 4 MONTH)) AS MONTH,

YEAR(DATE_SUB(NOW(), INTERVAL 4 MONTH)) AS `YEAR`

UNION
SELECT MONTH(DATE_SUB(NOW(), INTERVAL 3 MONTH)) AS MONTH,

YEAR(DATE_SUB(NOW(), INTERVAL 3 MONTH)) AS `YEAR`

UNION
SELECT MONTH(DATE_SUB(NOW(), INTERVAL 2 MONTH)) AS MONTH,

YEAR(DATE_SUB(NOW(), INTERVAL 2 MONTH)) AS `YEAR`
UNION
SELECT MONTH(DATE_SUB(NOW(), INTERVAL 1 MONTH)) AS MONTH,

YEAR(DATE_SUB(NOW(), INTERVAL 1 MONTH)) AS `YEAR`

UNION
SELECT MONTH(NOW()) AS MONTH, YEAR(NOW()) AS `YEAR`

)

SELECT M.MONTH,M.YEAR, CASE

WHEN COUNT(QuestionID) = 0 THEN 'không có câu hỏi nào trong

tháng'
ELSE COUNT(QuestionID)
END AS SL
FROM CTE_Talbe_6MonthBefore M
LEFT JOIN (SELECT * FROM question where CreateDate >= DATE_SUB(NOW(),

INTERVAL 6 MONTH) AND CreateDate <= now()) AS Sub_Question ON M.MONTH =
MONTH(CreateDate)

GROUP BY M.MONTH
ORDER BY M.MONTH ASC;

END$$
DELIMITER ;

CALL sp_CountQuesBefore6Month;










