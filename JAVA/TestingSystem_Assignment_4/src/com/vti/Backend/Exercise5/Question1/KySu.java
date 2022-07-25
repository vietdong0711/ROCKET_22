package com.vti.Backend.Exercise5.Question1;

import java.util.Scanner;

public class KySu extends CanBo {

	private String nganhDaoTao;

	public String getNganhDaoTao() {
		return nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
	public void hienTT() {
		System.out.println("= = = = Kỹ Sư = = = =");
		super.hienTT();
		System.out.println("Ngành đào tạo: "+this.nganhDaoTao);
	}
	
	public void nhapTT() {
		Scanner so = new Scanner(System.in);
		System.out.println("= = = = Kỹ sư = = = =");
		super.nhapTT();
		System.out.println("Nhập ngành đào tạo: ");
		this.setNganhDaoTao(so.nextLine());
	}
	
}
