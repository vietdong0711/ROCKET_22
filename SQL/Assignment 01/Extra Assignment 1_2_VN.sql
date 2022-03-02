/* Exercise 1 */
/*Question 1*/
create database fresher_training_management;
use fresher_training_management;

create table Trainee (
	TraineeID int not null auto_increment primary key,
    Full_Name varchar(50),
    Birth_Date date,
    Gender enum('male','female','unknown'),
    ET_IQ int check(ET_IQ>=0 and ET_IQ<=20),
    ET_Gmath int check(ET_Gmath>=0 and ET_Gmath<=20),
    ET_English int check(ET_English>=0 and ET_English<=50),
    Training_Class varchar(20),
    Evaluation_Notes text
);

/*Question 2*/
alter table Trainee add column 	VTI_Account varchar(30) not null unique after Full_Name;


/* Exercise 2: Data Types */
create database Exercise2;
use Exercise2;

create table Ex2(
	ID int not null auto_increment primary key,
    Name varchar(100),
    Code varchar(5),
    ModifiedDate timestamp default current_timestamp
);


/* Exercise 3: Data Types 2 */
create database Exercise3;
use Exercise3;

create table Ex3(
	ID int not null auto_increment primary key,
    Name varchar(100),
    BirthDate date,
    Gender enum('0','1','NULL'),
    isDeletedFlag bit
);

