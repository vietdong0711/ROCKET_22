use testing_system_assignment;

-- 1
delimiter &&
create trigger notCreateGroup1Year
before insert on `Group`
for each row
begin
	if(new.CreateDate < date_sub(now(), interval 1 year)) then 
		signal sqlstate '12345'
        set message_text  = 'Can create this group';
	end if;
end &&
delimiter ;

insert into `Group` (GroupName, CreatorID, CreateDate) values ('a', 1, '2021-01-01');

-- 2
drop trigger if exists notCreateUserIntoDepartment;
delimiter &&
create trigger notCreateUserIntoDepartment
before insert on account
for each row
begin
	declare deID int; 
    select DepartmentID into deID from department where DepartmentName = 'Sale' limit 1;
	if(new.DepartmentID = deID) then 
		signal sqlstate '12345'
        set message_text  = 'Department "Sale" cannot add more user';
	end if;
end &&
delimiter ;

insert into account (Email, UserName, FullName, DepartmentID, PositionID) values ('dong@gmail.com', 'dongdz', 'Nguyễn Viết Đồng', 2, 1);

-- 3
drop trigger if exists testAmountGroup;
delimiter &&
create trigger testAmountGroup
before insert on groupaccount
for each row
begin
	declare sl int; 
    select count(*) into sl from groupaccount ga  where ga.GroupID = new.GroupID;
	if(sl>=5) then 
		signal sqlstate '12345'
        set message_text  = 'Group is full';
	end if;
end &&
delimiter ;

insert into groupaccount (GroupID, AccountID) values (4,3),(4,11);

-- 4
drop trigger if exists testAmountQuestionInExam;
delimiter &&
create trigger testAmountQuestionInExam
before insert on examquestion
for each row
begin
	declare sl int; 
    select count(*) into sl from examquestion eq  where eq.ExamID = new.ExamID;
	if(sl>=10) then 
		signal sqlstate '12345'
        set message_text  = 'Question in Exam is full';
	end if;
end &&
delimiter ;

-- 5
drop trigger if exists deleteAccountByEmail;
delimiter &&
create trigger deleteAccountByEmail
before delete on Account
for each row
begin
	if(old.Email = 'admin@gmail.com') then 
		signal sqlstate '12345'
        set message_text  = 'Can not delete account admin';
	end if;
end &&
delimiter ;

delete from account a where a.Email = 'admin@gmail.com';

-- 6
drop trigger if exists defaulDepartment;
delimiter &&
create trigger defaulDepartment
before insert on account
for each row
begin
	declare id int;
	select DepartmentID into id from department d where d.DepartmentName = 'waiting Department' limit 1;
	if(new.DepartmentID is null) then 
		SET new.DepartmentID = id;
	end if;
end &&
delimiter ;

insert into account (Email, UserName, FullName,  PositionID) values ('dong@gmail.com', 'dongdz', 'Nguyễn Viết Đồng', 1);

-- 7 
drop trigger if exists setMaxAnswer;
delimiter &&
create trigger setMaxAnswer
before insert on answer
for each row
begin
	declare sl int;
    declare sltl int;
	select count(new.QuestionID) into sl from answer a where a.QuestionID = new.QuestionID;
    select count(*) into sltl from answer a where a.QuestionID = new.QuestionID and a.isCorrect = 1;
	if(sl>=4 or sltl>=2) then 
				signal sqlstate '12345'
        set message_text  = 'Can not insert data';
	end if;
end &&
delimiter ;

insert into answer (Content, QuestionID, isCorrect) values ('AAA', 1, 1);

-- 8
drop trigger if exists setGender;
delimiter &&
create trigger setGender
before insert on account
for each row
begin
	if new.Gender='nam' then 
		SET new.Gender = 'M';
	elseif new.Gender = 'nữ' then
		SET new.Gender = 'F';
	elseif new.Gender = 'chưa xác định' then
		SET new.Gender = 'U';
	end if ;
end &&
delimiter ;

-- 9
drop trigger if exists deleteExam;
delimiter &&
create trigger deleteExam
before delete on Exam
for each row
begin
	if(date_sub(now(), interval 2 day) > old.CreateDate) then 
		signal sqlstate '12345'
        set message_text  = 'Can not delete exam';
	end if;
end &&
delimiter ;

delete from Exam where ExamID = 9;

-- 10
drop trigger if exists deleteQuestion;
delimiter &&
create trigger deleteQuestion
before delete on Question
for each row
begin
	if(old.QuestionID in (select QuestionID from examquestion group by QuestionID)) then 
		signal sqlstate '12345'
        set message_text  = 'Can not delete this question ';
	end if;
end &&
delimiter ;

delete from question where QuestionID = 3;

drop trigger if exists updateQuestion;
delimiter &&
create trigger updateQuestion
before update on Question
for each row
begin
	if(old.QuestionID in (select QuestionID from examquestion group by QuestionID)) then 
		signal sqlstate '12345'
        set message_text  = 'Can not update this question ';
	end if;
end &&
delimiter ;

update question set Content = 'Test' where QuestionID = 3;

-- 12
select * from exam ;
select e.ExamID, e.Code, e.Title, Case when e.Duration <=30 then 'Short time'
								when e.Duration <=60 then 'Medium time'
                                else 'Long time' end as time, e.CreateDate, e.Duration
                                from exam e;

-- 13
select ga.GroupID, g.GroupName, count(ga.AccountID) as soluong, Case when count(ga.AccountID) <=5 then 'few'
								when count(ga.AccountID)<=20 then 'normal'
                                else 'Higher' end as the_number_user_amount 
                                from groupaccount ga join `group` g on ga.GroupID = g.GroupID group by ga.GroupID;

-- 14
select d.DepartmentID, d.DepartmentName, Case when count(a.AccountID) <> 0  then count(a.AccountID)
                                else 'Không có User' end as the_number_user_amount  
                                from  Department d left join Account a   on d.DepartmentID = a.DepartmentID group by d.DepartmentID







