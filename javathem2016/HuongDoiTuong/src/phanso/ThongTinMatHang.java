package phanso;

import java.util.Scanner;

public class ThongTinMatHang {
	//access modifier:
	//private, public , protected;
	private String MatHang;
	private int donGia;
	private int soLuongTon;

	public String getMat(){
		return this.MatHang;
	}
	
	public void setMatHang(String MatHang){
		this.MatHang=MatHang;
	}
	
	public int getDon(){
		return this.donGia;
	}
	
	public void setDon(int donGia){
		this.donGia= donGia;
	}
	
	public int getSoLuong(){
		return this.soLuongTon;
	}
	
	public void setSoLuong(int soLuongTon){
		this.soLuongTon=soLuongTon;
	}
	
	public ThongTinMatHang(){
		this.donGia=1;
		this.MatHang="a";
		this.soLuongTon=3;
		
		
	}
	public void nhap() {
		Scanner reader = new Scanner(System.in);
		System.out.println("ten mat hang");
		this.MatHang = reader.nextLine();
		System.out.println("don gia");
		this.donGia = Integer.parseInt(reader.nextLine());
		System.out.println("so luong ton");
		this.soLuongTon = Integer.parseInt(reader.nextLine());

	}

	public void xuat() {
		System.out.print("Ten mat hang: "+this.MatHang );
		System.out.println();
		System.out.print("Don gia: "+this.donGia);
		System.out.println();
		System.out.print("So luong ton: "+this.soLuongTon);
	}
}
