
DROP DATABASE IF EXISTS Testing_System_Assignment_2;
CREATE DATABASE IF NOT EXISTS Testing_System_Assignment_2;
USE Testing_System_Assignment_2;

-- Department
DROP TABLE IF EXISTS Department;
CREATE TABLE IF NOT EXISTS Department (
	DepartmentID INT NOT NULL AUTO_INCREMENT,
    DepartmentName VARCHAR(255),
    PRIMARY KEY(DepartmentID)
);

-- Position
DROP TABLE IF EXISTS `Position`;
CREATE TABLE IF NOT EXISTS `Position` (
	PositionID INT NOT NULL AUTO_INCREMENT,
    PositionName ENUM('Dev','Test','Scrum Master','PM') NOT NULL,
    PRIMARY KEY(PositionID)
);

-- Account
DROP TABLE IF EXISTS `Account`;
CREATE TABLE IF NOT EXISTS `Account` (
	AccountID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Email VARCHAR(255) NOT NULL,
    UserName VARCHAR(255),
    FullName VARCHAR(255),
    DepartmentID INT NOT NULL,
    PositionID INT NOT NULL,
    CreateDate TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
    FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID)
);

-- Group
DROP TABLE IF EXISTS `Group`;
CREATE TABLE IF NOT EXISTS `Group` (
	GroupID INT NOT NULL AUTO_INCREMENT,
    GroupName VARCHAR(255),
    CreatorID INT NOT NULL,
    CreateDate TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(GroupID),
    FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

-- GroupAccount
DROP TABLE IF EXISTS GroupAccount;
CREATE TABLE IF NOT EXISTS GroupAccount (
	GroupID INT NOT NULL,
    AccountID INT NOT NULL,
    JoinDate DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID),
    FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID)
);

-- TypeQuestion
DROP TABLE IF EXISTS TypeQuestion;
CREATE TABLE IF NOT EXISTS TypeQuestion (
	TypeID INT NOT NULL AUTO_INCREMENT,
    TypeName ENUM('Essay','Multiple-Choice') NOT NULL,
    PRIMARY KEY(TypeID)
);

-- CategoryQuestion 
DROP TABLE IF EXISTS  CategoryQuestion;
CREATE TABLE IF NOT EXISTS CategoryQuestion (
	CategoryID INT NOT NULL AUTO_INCREMENT,
    CategoryName VARCHAR(255),
    PRIMARY KEY(CategoryID)
);

/*Câu 1+2*/

-- Question
DROP TABLE IF EXISTS Question;
CREATE TABLE IF NOT EXISTS Question (
	QuestionID INT NOT NULL AUTO_INCREMENT,
    Content TEXT,
    CategoryID INT NOT NULL,
    TypeID INT NOT NULL,
    CreatorID INT NOT NULL,
    CreateDate DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(QuestionID),
    FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID),
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY (CreatorID) REFERENCES `Account`(AccountID)
);

-- Answer
DROP TABLE IF EXISTS Answer;
CREATE TABLE IF NOT EXISTS Answer (
	AnswerID INT NOT NULL AUTO_INCREMENT,
    Content TEXT,
    QuestionID INT NOT NULL,
    isCorrect BOOLEAN,
    PRIMARY KEY(AnswerID),
    FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);
	
-- Exam
DROP TABLE IF EXISTS Exam;
CREATE TABLE IF NOT EXISTS Exam (
	ExamID INT NOT NULL AUTO_INCREMENT,
    `Code` VARCHAR(20),
    Title VARCHAR(100),
    CategoryID INT NOT NULL,
    Duration INT,
    CreatorID INT NOT NULL,
    CreateDate TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY(ExamID),
    FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID)
);

-- ExamQuestion
DROP TABLE IF EXISTS ExamQuestion;
CREATE TABLE IF NOT EXISTS ExamQuestion (
	ExamID INT NOT NULL,
    QuestionID INT NOT NULL,
    FOREIGN KEY (ExamID) REFERENCES Exam(ExamID),
    FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

/* Câu 3*/
-- department
INSERT INTO department (DepartmentName) VALUES ('Marketing'),('Sale'),('Bảo vệ'),('Nhân sự'),('Kỹ thuật');

-- position
INSERT INTO position (PositionName) VALUES ('Dev'),('Test'),('Scrum Master'),('PM');

-- account
INSERT INTO `account` (Email, UserName, FullName, DepartmentID, PositionID) 
VALUES ('dong1@gmail.com','dong1', 'dong', 16, 1),
	('dong2@gmail.com','dong2', 'dong', 17, 2),
    ('dong3@gmail.com','dong3', 'dong2', 18, 3),
    ('dong4@gmail.com','dong4', 'dong3', 19, 4),
    ('dong5@gmail.com','dong5', 'dong4', 20, 1);
 
 -- group
INSERT INTO `group` (GroupName, CreatorID)
 VALUES ('Dong1',1),
	('Dong2',2),
    ('Dong3',3),
    ('Dong4',4),
    ('Dong5',5);

-- groupaccount
INSERT INTO groupaccount (GroupID, AccountID)
 VALUES ('1',1),
	('2',2),
	('3',3),
	('4',4),
	('5',5);
  
-- typequestion
INSERT INTO typequestion(TypeName) VALUES ('Essay'),('Multiple-Choice');

-- categoryquestion
INSERT INTO categoryquestion(CategoryName) VALUES ('Java'),('.NET'),('SQL'),('Postman'),('Ruby');

-- question
INSERT INTO question(Content, CategoryID, TypeID, CreatorID) 
VALUES ('Đề thi 1',1, 1, 1),
		('Đề thi 2', 2, 2, 2),
		('Đề thi 3', 3, 1, 3),
		('Đề thi 4', 4, 2, 4),
		('Đề thi 5', 5, 1, 5);
       
-- answer
INSERT INTO answer(Content, QuestionID, isCorrect)
 VALUES ('a',1, true),
	('b',2, false),
	('c',3, true),
    ('d',4, false),
    ('e',5, true);
 
-- exam
INSERT INTO exam(`Code`, Title, CategoryID, Duration, CreatorID) 
VALUES ('Đề thi 1', 'đề thi 1', 1, 100, 1),
		('Đề thi 2', 'đề thi 2', 2, 102, 2),
        ('Đề thi 3', 'đề thi 3', 3, 103, 3),
        ('Đề thi 4', 'đề thi 4', 4, 104, 4),
        ('Đề thi 5', 'đề thi 5', 5, 105, 5);

-- examquestion
INSERT INTO examquestion (ExamID, QuestionID)
 VALUES ('1',1),
	('2',2),
	('3',3),
	('4',4),
	('5',5);