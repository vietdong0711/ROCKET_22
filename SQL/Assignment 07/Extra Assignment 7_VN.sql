use project_manger;

-- exercise1
drop trigger if exists exercise1 ;
delimiter &&
create trigger exercise1
before insert on project_modules
for each row
begin
	declare psd date;
    declare pco date;
    select ProjectStartDate into psd from project p where p.ProjectID = new.ProjectID;
    select ProjectCompleteDone into pco from project p where p.ProjectID = new.ProjectID;
	if(new.ProjectModulesDate < psd or new.ProjectModulesCompledOn >pco) then
		signal sqlstate '12345'
        set message_text  = 'Can create this module';
    end if;
end &&
delimiter ;

INSERT INTO project_modules (`ProjectID`, `EmployeeID`, `ProjectModulesDate`, `ProjectModulesCompledOn`) VALUES ('1', '1', '2021-12-30', '2022-04-01');

-- exercise2
use fresher_training_management;
drop view if exists exercise7_2;
create view exercise7_2 as(
SELECT *
FROM trainee 
WHERE ET_IQ+ET_Gmath>=29 AND ET_IQ>=8 AND ET_Gmath>=8 AND ET_English >=18
);





