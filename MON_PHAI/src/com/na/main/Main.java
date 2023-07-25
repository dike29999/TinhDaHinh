package com.na.main;
import com.na.kynang.*;
import com.na.monphai.*;
public class Main {

	public static void main(String[] args) {
		KyNangNoiCong ThienDiaVoCuc = new KyNangNoiCong();
		ThienDiaVoCuc.nhapKyNang("Thien Dia Vo Cuc", "Quyen Phap", "Tạo 2 ", 10);
		VoDang VoDang = new VoDang();
		VoDang.nhapTTMonPhai("Vo Dang", "Trương Tam Phong", ThienDiaVoCuc, "lol","lol", "");
		VoDang.giangDao();
		
		KyNangNoiCong lol = new KyNangNoiCong();
		lol.nhapKyNang("lol", "Quyen Phap", "Tạo 2 lần sát thương lên mục tiêu trong phạm vi nhỏ", 9);
		lol.congLuc();
		lol.vanCong();
		CaiBang CaiBang = new CaiBang();
		CaiBang.nhapTTMonPhai("Cai Bang", "Trương Tam Phong", lol, "núi",null,null);
		CaiBang.AnXin();
		CaiBang.SoTai(VoDang);
	}

}
