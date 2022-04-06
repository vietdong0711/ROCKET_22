import java.util.Date;

import Entity.Account;
import Entity.Answer;
import Entity.CategoryQuestion;
import Entity.Department;
import Entity.Exam;
import Entity.Group;
import Entity.Position;
import Entity.PostionName;
import Entity.Question;
import Entity.TypeQuestion;
import Entity.TypeQuestion.TypeName;

public class Exercise5 {
	
	public void question1(Department a) {
		System.out.println("Question 1:");
		System.out.println(a.toString());
		System.out.println("============");
	}
	
	public void question2(Department[] a) {
		System.out.println("Question 2:");
		for (Department department : a) {
			System.out.println(department.toString());
		}
		System.out.println("============");
	}
	
	public void question3(Department a) {
		System.out.println("Question 3:");
		System.out.println("Địa chỉ là: "+a.getAddress());
		System.out.println("============");
	}
	
	public void question4(Department a) {
		System.out.println("Question 4:");
		if (a.getDepartmentName().equals("Phòng A")) {
			System.out.println("Tên phòng này là phòng A!");
		}else {
			System.out.println("Tên phòng này không phải là phòng A!");
		}
		System.out.println("============");
	}
	
	public void question5(Department a, Department b) {
		System.out.println("Question 5:");
		if (a.getDepartmentName().equals(b.getDepartmentName())) {
			System.out.println("Hai phòng ban này bằng nhau!");
		}else {
			System.out.println("Hai phòng ban này không bằng nhau!");
		}
		System.out.println("============");
	}
	
	public void question6(Department[] a) {
		System.out.println("Question 6:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i].getDepartmentName().compareTo(a[j].getDepartmentName())>0) {
					Department tg= a[i];
					a[i] = a[j];
					a[j]=tg;
				}
			}
		}
		for (Department department : a) {
			System.out.println(department.toString());
		}
		System.out.println("============");
	}
	
	public static void main(String[] args) {
		// Tạo department
				Department department1 = new Department();
				department1.DepartmentID = 1;
				department1.DepartmentName = "A1";
				department1.setAddress("ÁAAAAAAAAA");

				Department department2 = new Department();
				department2.DepartmentID = 2;
				department2.DepartmentName = "B";

				Department department3 = new Department();
				department3.DepartmentID = 3;
				department3.DepartmentName = "C";
				Department[] departments = {department1, department2, department3};

				// Tạo position
				Position ps1 = new Position();
				ps1.positionID = 1;
				ps1.positionName = PostionName.Dev;

				Position ps2 = new Position();
				ps2.positionID = 2;
				ps2.positionName = PostionName.Test;

				Position ps3 = new Position();
				ps3.positionID = 3;
				ps3.positionName = PostionName.PM;

				// Tạo group
				Group gr1 = new Group();
				gr1.groupID = 1;
				gr1.groupName = "G1";
				gr1.createDate = new Date(2022, 01, 01);
				Account[] ab = {};
				gr1.accounts = ab;

				Group gr2 = new Group();
				gr2.groupID = 2;
				gr2.groupName = "G2";
				gr2.createDate = new Date(2022, 01, 01);

				Group gr3 = new Group();
				gr3.groupID = 3;
				gr3.groupName = "G3";
				gr3.createDate = new Date(2022, 01, 01);

				// Tạo account
				Account acc1 = new Account();
				acc1.accountID = 1;
				acc1.fullName = "Nguyễn Văn 1";
				acc1.emai = "1@gmail.com";
				acc1.username = "nv1";
				acc1.department = department1;
				acc1.position = ps1;
				acc1.createDate = new Date(2022, 01, 01);
				Group[] groups1 = {};
				acc1.groups = groups1;

				Account acc2 = new Account();
				acc2.accountID = 2;
				acc2.fullName = "Nguyễn Văn 2";
				acc2.emai = "2@gmail.com";
				acc2.username = "nv2";
				acc2.department = department2;
				acc2.position = ps2;
				acc2.createDate = new Date(2022, 01, 01);
				Group[] groups = { gr1 };
				acc2.groups = groups;

				Account acc3 = new Account();
				acc3.accountID = 3;
				acc3.fullName = "Nguyễn Văn 3";
				acc3.emai = "3@gmail.com";
				acc3.username = "nv3";
				acc3.department = department3;
				acc3.position = ps3;
				acc3.createDate = new Date(2022, 01, 01);
				Group[] g1 = { gr1, gr2, gr3 };
				acc3.groups = g1;

				// Tạo category
				CategoryQuestion c1 = new CategoryQuestion();
				c1.categoryID = 1;
				c1.categoryName = "C1";

				CategoryQuestion c2 = new CategoryQuestion();
				c2.categoryID = 2;
				c2.categoryName = "C2";

				CategoryQuestion c3 = new CategoryQuestion();
				c3.categoryID = 3;
				c3.categoryName = "C3";

				// Tạp type
				TypeQuestion t1 = new TypeQuestion();
				t1.typeID = 1;
				t1.typeName = TypeName.Essay;

				TypeQuestion t2 = new TypeQuestion();
				t2.typeID = 2;
				t2.typeName = TypeName.Multiple_Choice;

				TypeQuestion t3 = new TypeQuestion();
				t3.typeID = 3;
				t3.typeName = TypeName.Essay;

				// Tạo question
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

				// Tạo answer
				Answer as1 = new Answer();
				as1.answerID = 1;
				as1.content = "A";
				as1.question = q1;
				as1.iscorrect = true;

				Answer as2 = new Answer();
				as2.answerID = 2;
				as2.content = "B";
				as2.question = q2;
				as2.iscorrect = false;

				Answer as3 = new Answer();
				as3.answerID = 3;
				as3.content = "B";
				as3.question = q3;
				as3.iscorrect = true;

				// Tạo exam
				Exam ex1 = new Exam();
				ex1.examID = 1;
				ex1.code = "A";
				ex1.title = "ABC";
				ex1.category = c1;
				ex1.duration = 100;
				ex1.creator = acc1;
				ex1.createDate = new Date(2022, 01, 01);

				Exam ex2 = new Exam();
				ex2.examID = 2;
				ex2.code = "A";
				ex2.title = "ABC";
				ex2.category = c2;
				ex2.duration = 100;
				ex2.creator = acc2;
				ex2.createDate = new Date(2022, 01, 01);

				Exam ex3 = new Exam();
				ex3.examID = 3;
				ex3.code = "A";
				ex3.title = "ABC";
				ex3.category = c3;
				ex3.duration = 100;
				ex3.creator = acc3;
				ex3.createDate = new Date(2022, 01, 01);
				
				
				Exercise5 e = new Exercise5();
				e.question1(department1);
				e.question2(departments);
				e.question3(department1);
				e.question4(department1);
				e.question5(department1, department2);
				e.question6(departments);
	}
}
