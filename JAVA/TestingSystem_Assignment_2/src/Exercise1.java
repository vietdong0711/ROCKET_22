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

public class Exercise1 {
	public static void main(String[] args) {
		// Tạo department
		Department department1 = new Department();
		department1.DepartmentID = 1;
		department1.DepartmentName = "A1";

		Department department2 = new Department();
		department2.DepartmentID = 2;
		department2.DepartmentName = "A2";

		Department department3 = new Department();
		department3.DepartmentID = 3;
		department3.DepartmentName = "A3";

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

		Account[] accs = { acc1, acc2, acc3 };
		// Question1
		System.out.println("Question 1:");
		if (accs[1].getDepartment() == null) {
			System.out.println("This employee does not have a department!");
		} else {
			System.out.println("Department of this employee is " + accs[1].department.getDepartmentName());
		}

		// Question 2:
		System.out.println("Question 2:");
		if (accs[1].getGroups().length == 0) {
			System.out.println("This employee does not group!");
		} else if (accs[1].getGroups().length == 1) {
			Group[] a = accs[1].getGroups();
			System.out.println("Group of this employee is " + a[0].getGroupName());
		} else if (accs[1].getGroups().length == 2) {
			Group[] a = accs[1].getGroups();
			System.out.println("Group of this employee is " + a[0].getGroupName() + ", " + a[1].getGroupName());
		} else if (accs[1].getGroups().length == 3) {
			System.out.println("This employee is important!");
		} else if (accs[1].getGroups().length >= 4) {
			System.out.println(" This employee aeger to talk, joins many group!");
		}

		// Question 3
		System.out
				.println("Question 3\n" + accs[1].getDepartment() == null ? "This employee does not have a department!"
						: "Department of this employee is " + accs[1].department.getDepartmentName());

		// Question 4
		System.out.println("Question 4:");
		System.out.println(accs[0].getPosition().getPositionName().equals(PostionName.Dev) ? "This is developer"
				: "This is not devloper");

		// Question 5:
		Group[] grs = { gr1, gr2, gr3 };
		System.out.println("Question 5:");
		switch (grs[0].getAccounts().length) {
		case 1:
			System.out.println("This group has 1 account");
			break;
		case 2:
			System.out.println("This group has 2 account");
			break;
		case 3:
			System.out.println("This group has 3 account");
			break;
		default:
			System.out.println("This group has many account");
			break;
		}

		// Question 6:
		Group[] a = accs[1].getGroups();
		System.out.println("Question 6:");
		switch (accs[1].getGroups().length) {
		case 0:
			System.out.println("This employee does not group!");
			break;
		case 1:
			System.out.println("Group of this employee is " + a[0].getGroupName());
			break;
		case 2:
			System.out.println("Group of this employee is " + a[0].getGroupName() + ", " + a[1].getGroupName());
			break;
		case 3:
			System.out.println("This employee is important!");
			break;
		default:
			System.out.println(" This employee aeger to talk, joins many group!");
			break;
		}

		// Question 7:
		System.out.println("Question 7:");
		switch (accs[0].getPosition().getPositionName()) {
		case Dev:
			System.out.println("This is developer!");
			break;

		default:
			System.out.println("This is not devloper!");
			break;
		}

		// Question 8:
		System.out.println("Question 8:");
		for (Account ac : accs) {
			System.out.println("Email: " + ac.getEmai() + ", FullName: " + ac.getFullName() + ", DepartmentName: "
					+ ac.getDepartment().getDepartmentName());
		}

		// Question 9
		System.out.println("Question 9:");
		Department[] de = { department1, department2, department3 };
		for (Department department : de) {
			System.out.println("DepartmentID: " + department.getDepartmentID() + ", DepartmentName: "
					+ department.getDepartmentName());
		}

		// Question 10
		System.out.println("Question 10:");
		for (int i = 0; i < accs.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + accs[i].getEmai() + "\nFullName: " + accs[i].getFullName() + "\nPhòng ban: "
					+ accs[i].getDepartment().getDepartmentName());
			System.out.println();
		}

		// Question 11
		System.out.println("Question 11:");
		for (int i = 0; i < de.length; i++) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + de[i].getDepartmentID() + "\nName: " + de[i].getDepartmentName());
			System.out.println();
		}

		// Question 12:
		System.out.println("Question 12:");
		for (int i = 0; i < de.length; i++) {
			if (i >= 2) {
				break;
			}
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + de[i].getDepartmentID() + "\nName: " + de[i].getDepartmentName());
			System.out.println();
		}

		// Question 13
		System.out.println("Question 13:");
		for (int i = 0; i < accs.length; i++) {
			if (i != 1) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
				System.out.println("Email: " + accs[i].getEmai() + "\nFullName: " + accs[i].getFullName()
						+ "\nPhòng ban: " + accs[i].getDepartment().getDepartmentName());
				System.out.println();
			}
		}

		//Question 14
		System.out.println("Question 14:");
		for (int i = 0; i < accs.length; i++) {
			if (accs[i].getAccountID()<4) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
				System.out.println("Email: " + accs[i].getEmai() + "\nFullName: " + accs[i].getFullName()
						+ "\nPhòng ban: " + accs[i].getDepartment().getDepartmentName());
				System.out.println();
			}
		}
		
		//Question 15
		System.out.println("Question 15:");
		for (int i = 0; i <= 20; i+=2) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		//Question 16
		System.out.println("Question 16:");
		System.out.println("==============");
		System.out.println("==Ques 10:");
		int i=0;
		while (i<accs.length) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + accs[i].getEmai() + "\nFullName: " + accs[i].getFullName() + "\nPhòng ban: "
					+ accs[i].getDepartment().getDepartmentName());
			System.out.println();
			i++;
		}
		
		System.out.println("==Ques 11:");
		i=0;
		while (i<de.length) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + de[i].getDepartmentID() + "\nName: " + de[i].getDepartmentName());
			System.out.println();
			i++;
		}
		
		System.out.println("==Ques 12:");
		i=0;
		while (i<de.length) {
			if (i >= 2) {
				break;
			}
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + de[i].getDepartmentID() + "\nName: " + de[i].getDepartmentName());
			System.out.println();
			i++;
		}
		
		
		System.out.println("==Ques 13:");
		i=0;
		while (i<accs.length) {		
			if (i != 1) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
				System.out.println("Email: " + accs[i].getEmai() + "\nFullName: " + accs[i].getFullName()
						+ "\nPhòng ban: " + accs[i].getDepartment().getDepartmentName());
				System.out.println();
			}
			i++;
		}
		
		System.out.println("==Ques 14:");
		i=0;
		while (i<accs.length) {		
			if (accs[i].getAccountID()<4) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
				System.out.println("Email: " + accs[i].getEmai() + "\nFullName: " + accs[i].getFullName()
						+ "\nPhòng ban: " + accs[i].getDepartment().getDepartmentName());
				System.out.println();
			}
			i++;
		}
		
		System.out.println("==Ques 15:");
		i=0;
		while (i<=20) {
			System.out.print(i+ " ");
			i+=2;
		}
		System.out.println();
		
		
		//Question 17
		System.out.println("Question 17:");
		System.out.println("=============");
		System.out.println("==Ques 10:");
		i=0;
		do {
			System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + accs[i].getEmai() + "\nFullName: " + accs[i].getFullName() + "\nPhòng ban: "
					+ accs[i].getDepartment().getDepartmentName());
			System.out.println();
			i++;
		} while (i<accs.length);
		
		System.out.println("==Ques 11:");
		i=0;
		do {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + de[i].getDepartmentID() + "\nName: " + de[i].getDepartmentName());
			System.out.println();
			i++;
		} while (i<de.length);
		
		
		System.out.println("==Ques 12:");
		i=0;
		do {
			if (i >= 2) {
				break;
			}
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("ID: " + de[i].getDepartmentID() + "\nName: " + de[i].getDepartmentName());
			System.out.println();
			i++;
		} while (i<de.length);
		
		
		
		System.out.println("==Ques 13:");
		i=0;
		do {
			if (i != 1) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
				System.out.println("Email: " + accs[i].getEmai() + "\nFullName: " + accs[i].getFullName()
						+ "\nPhòng ban: " + accs[i].getDepartment().getDepartmentName());
				System.out.println();
			}
			i++;
		} while (i<accs.length);
		
		
		System.out.println("==Ques 14:");
		i=0;
		do {
			if (accs[i].getAccountID()<4) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
				System.out.println("Email: " + accs[i].getEmai() + "\nFullName: " + accs[i].getFullName()
						+ "\nPhòng ban: " + accs[i].getDepartment().getDepartmentName());
				System.out.println();
			}
			i++;
		} while (i<accs.length);
		
		
		System.out.println("==Ques 15:");
		i=0;
		do {
			System.out.print(i+ " ");
			i+=2;
		} while (i<=20);
		System.out.println();
		
		
		
		
		
	}
}
