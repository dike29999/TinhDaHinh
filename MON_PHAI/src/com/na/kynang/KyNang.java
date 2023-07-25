package com.na.kynang;

//Xay lop Ky Nang cha

public class KyNang {
	
//	Khai bao thuoc tinh
	protected String tenKyNang, thuocTinh, moTa;
	protected double satThuong;
	
//	Phuong thuc nhap TT Ky Nang
	public void nhapKyNang(String tenKyNang, String thuocTinh, String moTa,double satThuong) {
		this.tenKyNang=tenKyNang;
		this.thuocTinh=thuocTinh;
		this.moTa=moTa;
		this.satThuong=satThuong;
	}
	
//	Cac phuong thuc tra ve du lieu
	public String getTenKyNang() {
		return tenKyNang;
	}
	public String getThuocTinh() {
		return thuocTinh;
	}
	public String getMoTa() {
		return moTa;
	}
	public double getSatThuong() {
		return satThuong;
	}
	
//	Phuong thuc in TT Ky Nang
	public void inTTKyNang() {
		System.out.println("Ten Ky Nang: "+tenKyNang);
		System.out.println("Thuoc Tinh: "+thuocTinh);
		System.out.println("Mo Ta: "+moTa);
		System.out.println("Sat Thuong: "+satThuong);

	}

}
