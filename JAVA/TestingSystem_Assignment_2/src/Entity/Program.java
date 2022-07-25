package Entity;

import java.util.Date;

import Entity.TypeQuestion.TypeName;

public class Program {

	public static void main(String[] args) {
		
			//Tạo department
			Department department1 = new Department();
			department1.DepartmentID = 1;
			department1.DepartmentName = "A1";
			
			Department department2 = new Department();
			department2.DepartmentID = 2;
			department2.DepartmentName = "A2";
			
			Department department3 = new Department();
			department3.DepartmentID = 3;
			department3.DepartmentName = "A3";
			
			//Tạo position
			Position ps1 = new Position();
			ps1.positionID = 1;
			ps1.positionName= PostionName.Dev;
			
			Position ps2 = new Position();
			ps2.positionID = 2;
			ps2.positionName=PostionName.PM;
			
			Position ps3 = new Position();
			ps3.positionID = 3;
			ps3.positionName= PostionName.Scrum_Master;
			
			//Tạo account
			Account acc0 = new Account(4, "nguyenvietdong9e@gmail.com", "nvdong", "nvdong", department1, ps1);
			
			Account acc1 = new Account();
			acc1.accountID = 1;
			acc1.fullName="Nguyễn Văn 1";
			acc1.emai = "1@gmail.com";
			acc1.username = "nv1";
			acc1.department = department1;
			acc1.position = ps1;
			acc1.createDate = new Date(2022, 01, 01);
			
			Account acc2 = new Account();
			acc2.accountID = 2;
			acc2.fullName="Nguyễn Văn 2";
			acc2.emai = "2@gmail.com";
			acc2.username = "nv2";
			acc2.department = department2;
			acc2.position = ps2;
			acc2.createDate = new Date(2022, 01, 01);
			
			Account acc3 = new Account();
			acc3.accountID = 3 ;
			acc3.fullName="Nguyễn Văn 3";
			acc3.emai = "3@gmail.com";
			acc3.username = "nv3";
			acc3.department = department3;
			acc3.position = ps3;
			acc3.createDate = new Date(2022, 01, 01);

			//Tạo group
			Group gr1 = new Group();
			gr1.groupID = 1;
			gr1.groupName = "G1";
			gr1.createDate = new Date(2022, 01, 01);
			gr1.creator = acc1;
			Account[] a1 = {acc1 };
			gr1.accounts = a1;
			
			Group gr2 = new Group();
			gr2.groupID = 2;
			gr2.groupName = "G2";
			gr2.createDate = new Date(2022, 01, 01);
			gr2.creator = acc2;
			Account[] a2 = {acc1 };
			gr1.accounts = a2;
			
			Group gr3 = new Group();
			gr3.groupID = 3;
			gr3.groupName = "G3";
			gr3.createDate = new Date(2022, 01, 01);
			gr3.creator = acc3;
			Account[] a3 = {acc1 };
			gr1.accounts = a3;
			
			//Tạo category
			CategoryQuestion c1 = new CategoryQuestion();
			c1.categoryID = 1;
			c1.categoryName = "C1";
			
			CategoryQuestion c2 = new CategoryQuestion();
			c2.categoryID = 2;
			c2.categoryName = "C2";
			
			CategoryQuestion c3 = new CategoryQuestion();
			c3.categoryID = 3;
			c3.categoryName = "C3";
			
			//Tạp type
			TypeQuestion t1 = new TypeQuestion();
			t1.typeID = 1;
			t1.typeName = TypeName.Essay;
			
			TypeQuestion t2 = new TypeQuestion();
			t2.typeID = 2;
			t2.typeName = TypeName.Multiple_Choice;
			
			TypeQuestion t3 = new TypeQuestion();
			t3.typeID = 3;
			t3.typeName = TypeName.Essay;
			
			//Tạo question
			Question q1 = new Question();
			q1.questionID = 1;
			q1.content = "Q1";
			q1.category = c1;
			q1.type = t1;
			q1.creator = acc1;
			q1.createDate = new Date(2022, 01, 01);
			
			Question q2 = new Question();
			q2.questionID = 2;
			q2.content = "Q2";
			q2.category = c2;
			q2.type = t2;
			q2.creator = acc2;
			q2.createDate = new Date(2022, 01, 01);
			
			Question q3 = new Question();
			q3.questionID = 3;
			q3.content = "Q3";
			q3.category = c3;
			q3.type = t3;
			q3.creator = acc3;
			q3.createDate = new Date(2022, 01, 01);
			
			
			//Tạo answer
			Answer as1= new Answer();
			as1.answerID = 1;
			as1.content= "A";
			as1.question = q1;
			as1.iscorrect =true;
			
			Answer as2= new Answer();
			as2.answerID = 2;
			as2.content= "B";
			as2.question = q2;
			as2.iscorrect =false;
			
			Answer as3= new Answer();
			as3.answerID = 3;
			as3.content= "B";
			as3.question = q3;
			as3.iscorrect =true;
			
			//Tạo exam
			Exam ex1 = new Exam();
			ex1.examID = 1;
			ex1.code = "A";
			ex1.title = "ABC";
			ex1.category = c1;
			ex1.duration= 100;
			ex1.creator = acc1;
			ex1.createDate = new Date(2022, 01, 01);
		
			Exam ex2 = new Exam();
			ex2.examID = 2;
			ex2.code = "A";
			ex2.title = "ABC";
			ex2.category = c2;
			ex2.duration= 100;
			ex2.creator = acc2;
			ex2.createDate = new Date(2022, 01, 01);
			
			Exam ex3 = new Exam();
			ex3.examID = 3;
			ex3.code = "A";
			ex3.title = "ABC";
			ex3.category = c3;
			ex3.duration= 100;
			ex3.creator = acc3;
			ex3.createDate = new Date(2022, 01, 01);
		
			
			//in ra 1 phòng ban
			System.out.println("In ra 1 phòng ban bất kì:");
			System.out.println("ID phòng ban:"+department1.DepartmentID);
			System.out.println("Tên phòng ban:"+department1.DepartmentName);
	}

}
