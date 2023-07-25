package com.na.kynang;

public class KyNangNoiCong extends KyNang {
	private String congLuc,vanCong;
	public void congLuc() {
		String noiCong="Noi Cong";
		this.congLuc=noiCong;
	};
	public String getCongLuc() {
		return congLuc;
	}
	public void vanCong() {
		this.vanCong="Van Cong";
	}
	public String getVanCong() {
		return vanCong;
	}
	@Override
	public void inTTKyNang() {
		super.inTTKyNang();
		System.out.println(congLuc);
		System.out.println(vanCong);

	}
	
}
