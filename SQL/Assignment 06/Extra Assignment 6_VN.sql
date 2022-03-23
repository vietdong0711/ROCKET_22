create database project_Manger; 

use project_Manger;


-- a
drop table if exists employee;
create table employee(
	EmployeeID int not null primary key auto_increment,
    EmployeeLastName varchar(255) not null,
    EmployeeFistName varchar(255) not null,
    EmployeeHireDate date,
    EmployeeStatus text,
    SupervisiorID int,
    SocialSecurityNumber int,
    foreign key(SupervisiorID) references employee(EmployeeID)
);

drop table if exists project;
create table project(
	ProjectID int not null primary key auto_increment,
    ManagerID int not null unique,
    ProjectName varchar(255),
    ProjectStartDate date,
    ProjectDescription text,
    ProjectDetail text,
    ProjectCompleteDone date,
	foreign key (ManagerID) references employee(EmployeeID)
);

drop table if exists work_done;
create table work_done(
	WorkDoneID int not null primary key auto_increment,
    EmployeeID int not null,
    ModuleID int not null,
    WorkDoneDate date,
	WorkDoneDescription text,
    WorkDoneStatus text,
    foreign key(EmployeeID) references employee(EmployeeID)
);

drop table if exists project_modules;
create table project_modules(
	ModuleID int not null primary key auto_increment,
    ProjectID int not null,
    EmployeeID int not null,
    ProjectModulesDate date,
    ProjectModulesCompledOn date,
    ProjectModulesDescription text,
    foreign key(ProjectID) references project(ProjectID),
    foreign key(EmployeeID) references employee(EmployeeID)
);


insert into employee (EmployeeLastName, EmployeeFistName, EmployeeHireDate, EmployeeStatus, SupervisiorID, SocialSecurityNumber)
	values('Nguyễn', 'Đồng', '2021/01/01', 'ok', 1, 123), 
    ('Trần', 'Hằng', '2021/10/11', 'ok', 1, 456), 
    ('Lê', 'Nam', '2022/01/01', 'ok', 1, 142);
    
insert into project (ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompleteDone)
	values(1, 'Đồng', '2022/01/01', 'ok', '', null), 
    (2, 'Hằng', '2022/02/02', 'ok', '',null), 
    (3, 'Nam', '2022/03/03', 'ok','',null);
    
insert into work_done (EmployeeID, ModuleID, WorkDoneDate, WorkDoneDescription, WorkDoneStatus)
	values(1, 1, '2022/03/04', 'ok', ''), 
    (2, 2, '2022/02/04', 'ok', ''), 
    (3, 3, '2022/03/05', 'ok','');
    
insert into project_modules (ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesCompledOn, ProjectModulesDescription)
	values(1, 1, '2022/03/04', '2022/03/05', ''), 
    (2, 2, '2022/02/04', '2022/02/05', ''), 
    (3, 3, '2022/03/05', '2022/03/06','');
    
-- b
drop procedure if exists removeEx1;
delimiter &&
create procedure removeEx1()
begin
	declare x int;
    declare y int;
	select count(*) as x from project where ProjectCompleteDone != null and ProjectCompleteDone < date_sub(now(), interval 3 month);
    select count(*) as y from project_modules m join project p on m.ProjectID = p.ProjectID where  p.ProjectCompleteDone != null and p.ProjectCompleteDone < date_sub(now(), interval 3 month);
    delete from project where ProjectCompleteDone != null and ProjectCompleteDone < date_sub(now(), interval 3 month);
    signal sqlstate '12345' set message_text = 'aaa';

end&&
delimiter ;
call removeEx1();
-- c
drop procedure if exists Ex6CountModule;
delimiter &&
create procedure Ex6CountModule()
begin
	select count(*) from project_modules where ProjectModulesCompledOn is null;
    
end&&
delimiter ;
call Ex6CountModule();

-- d
drop procedure if exists Ex6d;
delimiter &&
create procedure Ex6d()
begin
	select e.* from work_done w join employee e on w.EmployeeID = e.EmployeeID where e.EmployeeID = e.SupervisiorID;
    
end&&
delimiter ;
call Ex6d();


