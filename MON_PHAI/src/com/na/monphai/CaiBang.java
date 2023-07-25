package com.na.monphai;
import com.na.kynang.*;
public class CaiBang extends MonPhai implements BoHanhViMonPhai {
	
	public String ndChieuThuc;
	public void AnXin() {
		this.ndChieuThuc="An Xin";
	}
	@Override
	public void inTTMonPhai() {
		super.inTTMonPhai();
		System.out.println(ndChieuThuc);
	}
	@Override
	public void luyenCong(String vuKhi, KyNang kyNang) {
		this.kyNang=kyNang;
		System.out.println("Vu Khi Mon Phai: "+vuKhi);
		System.out.println("Luyen Ky Nang: "+kyNang.getTenKyNang());
		kyNang.nhapKyNang(this.kyNang.getTenKyNang(), this.kyNang.getThuocTinh(), this.kyNang.getMoTa(), this.kyNang.getSatThuong()+1);
		this.kyNang=kyNang;
		System.out.println("Luyen Thanh Cong");
		System.out.println("Sat thuong Ky Nang: "+kyNang.getSatThuong());
	}
	@Override
	public void anUong(String doAn,String thoiGian, String diaDiem) {
		System.out.println("An Uong");
	}
}
