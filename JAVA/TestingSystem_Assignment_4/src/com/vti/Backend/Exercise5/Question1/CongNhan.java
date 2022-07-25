package com.vti.Backend.Exercise5.Question1;

import java.util.Scanner;

public class CongNhan extends CanBo {

	private int bac;

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	public void hienTT() {
		System.out.println("= = = = Công nhân = = = =");
		super.hienTT();
		System.out.println("Bậc: "+this.bac);
	}
	
	public void nhapTT() {
		Scanner so = new Scanner(System.in);
		System.out.println("= = = = Công nhân = = = =");
		super.nhapTT();
		System.out.println("Nhập bậc: ");
		this.setBac(so.nextInt());
	}
	
	public static void main(String[] args) {
		CongNhan cn = new CongNhan();
		cn.nhapTT();
		cn.hienTT();
	}
}
