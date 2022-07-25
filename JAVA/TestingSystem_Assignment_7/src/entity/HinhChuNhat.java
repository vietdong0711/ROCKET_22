package entity;

import exception.HinhHocException;

public class HinhChuNhat extends HinhHoc {

	private int cDai;
	private int cRong;
	public static int count1 = 0;

	public HinhChuNhat(int cDai, int cRong) throws Exception {
		++count1;
		if (count1+HinhHoc.countH>Configs.SO_LUONG_HINH_TOI_DA) {
			throw new HinhHocException();
		}
		this.cDai = cDai;
		this.cRong = cRong;
	}

	public int getcDai() {
		return cDai;
	}

	public void setcDai(int cDai) {
		this.cDai = cDai;
	}

	public int getcRong() {
		return cRong;
	}

	public void setcRong(int cRong) {
		this.cRong = cRong;
	}

	@Override
	public void tinhChuVi() {
		System.out.println("Chu vi hình chữ nhật là: " + (cDai + cRong) * 2);
	}

	@Override
	public void tinhDienTich() {
		System.out.println("Diện tích hình chữ nhật là: " + cDai * cRong);
	}
}
