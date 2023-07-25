package com.na.kynang;

//Xay lop ky nang ngoai con ke thua lop cha
public class KyNangNgoaiCong extends KyNang {
	
//	Khai bao thuoc tinh
	private String congLuc,danhLienHoan;
	
//	Nhap tt cong luc - ngoai Cong
	public void congLuc() {
		String ngoaiCong="Ngoai Cong";
		this.congLuc=ngoaiCong;
	};
	public String getCongLuc() {
		return congLuc;
	}
//	Phuong thuc danh lien hoan cua ngoai cong
	public void danhLienHoan() {
		this.danhLienHoan="Danh Lien Hoan";
	}

//	InTT Ky Nang
	@Override
	public void inTTKyNang() {
		super.inTTKyNang();
		System.out.println(congLuc);
		System.out.println(danhLienHoan);

	}
	

}
