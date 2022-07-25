package exception;

import entity.Configs;

public class HinhHocException extends Exception {
	
	public HinhHocException() {
		super("Số lượng hình đã vượt quá "+Configs.SO_LUONG_HINH_TOI_DA);
	}
}