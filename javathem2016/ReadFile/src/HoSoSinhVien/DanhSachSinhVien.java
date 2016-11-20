package HoSoSinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class DanhSachSinhVien {
	public List<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();
	
	public void nhap(){
		Scanner reader = new Scanner(System.in);
		System.out.println("nhap so luong sinh vien");
		int soLuong = reader.nextInt();
		for( int i=0;i<soLuong;i++){
			SinhVien tt= new SinhVien();
			tt.nhap();
			danhSachSinhVien.add(tt);
		}
	}
	
	public void xuat() {
		for (int i = 0; i < danhSachSinhVien.size(); i++) {
			danhSachSinhVien.get(i).xuat();
		}
	}
	
	public static void main(String[] args) {
		DanhSachSinhVien ds= new DanhSachSinhVien();
		ds.nhap();
		ds.xuat();
	}

}
