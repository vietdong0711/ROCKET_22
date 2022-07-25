package entity;

import exception.HinhHocException;

public class HinhHoc {

	public static int countH=0;
	
	public HinhHoc() throws Exception {
		++countH;
		if (countH>Configs.SO_LUONG_HINH_TOI_DA) {
			throw new HinhHocException();
		}
		
	}
	
	public void tinhChuVi() {

	}

	public void tinhDienTich() {

	}
}
