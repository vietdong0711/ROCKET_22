package com.vti.Backend.Exercise1.Question2;

public class ThiSinh {

	private String soBaoDanh;
	private String hoTen;
	private String diaChi;
	private String mucUuTien;
	private Khoi khoi;

	public ThiSinh() {

	}
	
	

	public ThiSinh(String soBaoDanh, String hoTen, String diaChi, String mucUuTien, Khoi khoi) {
		super();
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.mucUuTien = mucUuTien;
		this.khoi = khoi;
	}



	public String getSoBaoDanh() {
		return soBaoDanh;
	}

	public void setSoBaoDanh(String soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getMucUuTien() {
		return mucUuTien;
	}

	public void setMucUuTien(String mucUuTien) {
		this.mucUuTien = mucUuTien;
	}

	public Khoi getKhoi() {
		return khoi;
	}

	public void setKhoi(Khoi khoi) {
		this.khoi = khoi;
	}

	@Override
	public String toString() {
		return "ThiSinh [soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien="
				+ mucUuTien + ", khoi=" + khoi.getTenKhoi() + "]";
	}

}
