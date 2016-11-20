package phanso;

import java.util.Scanner;

public class NgayThangNam {
	private int ngay;
	private int thang;
	private int nam;

	
	public int getNgay(){
		return this.ngay;
	}
	public void setNgay(int ngay){
		this.ngay= ngay;
	}
	
	public int getThang(){
		return this.thang;
	}
	public void setThang(int thang){
		this.thang=thang;
	}
	
	public int getNam(){
		return nam;
	}
	public void setNam(int nam){
		this.nam=nam;
	}
	
	public NgayThangNam(){
		this.ngay=1;
		this.thang=1;
		this.nam=1;
	}
	public void nhapNgayThangNam() {
		Scanner reader = new Scanner(System.in);
		System.out.print("nhap ngay : ");
		this.ngay = reader.nextInt();
		System.out.print("nhap thang : ");
		this.thang = reader.nextInt();
		System.out.print("nhap nam : ");
		this.nam = reader.nextInt();
	}

	public void xuat() {
		System.out.println(this.ngay + "/" + this.thang + "/" + this.nam);
	}

}
