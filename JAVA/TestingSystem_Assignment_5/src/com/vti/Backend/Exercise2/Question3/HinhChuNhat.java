package com.vti.Backend.Exercise2.Question3;

public class HinhChuNhat {

	private float chieuDai;
	private float chieuRong;

	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public float tinhDienTich() {
		return chieuDai * chieuRong;
	}
	
	public float tinhChuVi() {
		return (chieuDai + chieuRong)*2;
	}
}
