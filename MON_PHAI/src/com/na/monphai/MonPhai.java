package com.na.monphai;
import com.na.kynang.*;

public abstract class MonPhai {
	protected String tenMonPhai,tenTruongMon,noiO,monquy,moTa;
	protected KyNang kyNang;

	public void nhapTTMonPhai(String tenMonPhai,String tenTruongMon,KyNang kyNang, String noiO, String monquy, String moTa) {
		this.tenMonPhai=tenMonPhai;
		this.tenTruongMon=tenTruongMon;
		this.kyNang=kyNang;
		this.noiO=noiO;
		this.monquy=monquy;
		this.moTa=moTa;
	}
	public String getTenMonPhai() {
		return tenMonPhai;
	}

	public void inTTMonPhai() {
		System.out.println("Mon Phai: "+tenMonPhai);
		System.out.println("Truong Mon: "+tenTruongMon);
		kyNang.inTTKyNang();
		System.out.println("Noi O: "+noiO);
		System.out.println("Mon Quy: "+monquy);
		System.out.println("Mo Ta "+moTa);
	}
 public void SoTai(MonPhai monPhaiST) {
	 double a=this.kyNang.getSatThuong();
	 double b=monPhaiST.kyNang.getSatThuong();
	 System.out.println(a);
	 System.out.println(b);
	 if(a>b) {
		 System.out.println("Mon phai "+this.tenMonPhai+" chien thang");
	 }else {
		 if(a==b) {
			 System.out.println("Hoa");
		 }
		 else  {
			 System.out.println("Mon phai "+monPhaiST.tenMonPhai+" chien thang");
		 }
	 }
	};
}
