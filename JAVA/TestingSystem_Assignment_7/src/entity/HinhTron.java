package entity;

import exception.HinhHocException;

public class HinhTron extends HinhHoc {

	
	private int banKinh;
	public static int count=0;


	public HinhTron(int banKinh) throws Exception {
		++count;
		if (count+HinhHoc.countH>Configs.SO_LUONG_HINH_TOI_DA) {
			throw new HinhHocException();
		}
		this.banKinh = banKinh;
	}

	public int getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(int banKinh) {
		this.banKinh = banKinh;
	}
	
	@Override
	public void tinhChuVi() {
		System.out.println("Chu vi hình tròn là:"+ 2*Configs.PI*banKinh );
	}
	
	@Override
	public void tinhDienTich() {
		System.out.println("Diện tích hình tròn là:"+ Configs.PI*banKinh*banKinh );
	}

}
