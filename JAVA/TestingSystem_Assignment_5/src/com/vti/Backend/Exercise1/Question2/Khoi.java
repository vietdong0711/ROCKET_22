package com.vti.Backend.Exercise1.Question2;

public class Khoi {

	private String tenKhoi;
	private String mon;

	public Khoi(String tenKhoi) {
		this.tenKhoi = tenKhoi;
	}

	public String getTenKhoi() {
		return tenKhoi;
	}

	public void setTenKhoi(String tenKhoi) {
		this.tenKhoi = tenKhoi;
	}

	public String getMon() {
		switch (this.tenKhoi) {
		case "A":
			this.mon = "Toán, Lý, Hóa";
			break;

		case "B":
			this.mon = "Toán, Hóa, Sinh";
			break;
		case "C":
			this.mon = "Văn, Sử, Địa";
			break;
		}
		return this.mon;
	}

}
