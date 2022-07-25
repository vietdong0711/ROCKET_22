package com.vti.Backend.Exercise6.Question1;

import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.NVList;

public class VietnamesePhone extends Phone {

	private ArrayList<Contacts> contacts = new ArrayList<>();

	@Override
	public void insertContacts(String name, String phone) {
		Contacts ct = new Contacts();
		ct.setName(name);
		ct.setNumber(phone);
		contacts.add(ct);
	}

	@Override
	public void removeContact(String name) {
		for (Contacts ct : contacts) {
			if (ct.getName().equals(name)) {
				contacts.remove(ct);
			}
		}
	}

	@Override
	public void updateContact(String name, String newPhone) {
		for (Contacts ct : contacts) {
			if (ct.getName().equals(name)) {
				ct.setNumber(newPhone);
			}
		}

	}

	@Override
	public void searchContact(String name) {
		for (Contacts ct : contacts) {
			if (ct.getName().equals(name)) {
				System.out.println("Name: " + ct.getName() + ", Phone: " + ct.getNumber());
			}
		}

	}

	public void show() {
		for (Contacts ct : contacts) {
			System.out.println(ct.toString());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scc = new Scanner(System.in);
		VietnamesePhone vn = new VietnamesePhone();

		while (true) {

			System.out.println("Chọn phương thức: 1.Thêm   2.Xóa   3.Sửa    4.Search    5.Show");
			int a = scc.nextInt();
			switch (a) {
			case 1:
				System.out.println("Nhập tên:");
				String name = sc.nextLine();
				System.out.println("Nhập phone");
				String phone = sc.nextLine();
				vn.insertContacts(name, phone);
				break;
			case 2:
				System.out.println("Nhập tên cần xóa:");
				String namerv = sc.nextLine();
				vn.removeContact(namerv);
				break;
			case 3:
				System.out.println("Nhập tên cần sửa:");
				String nameu = sc.nextLine();
				System.out.println("Nhập phone sửa:");
				String phoneu = sc.nextLine();
				vn.updateContact(nameu, phoneu);
				break;
			case 4:
				System.out.println("Nhập tên cần tìm:");
				String names = sc.nextLine();
				vn.searchContact(names);
				break;

			case 5:
				vn.show();
				break;

			default:
				System.out.println("Nhập sai");
				break;
			}
		}
	}

}
