package phanso;

import java.util.Scanner;

public class ThongTinTinh {
	private int maTinh;
	private String tenTinh;
	private int danSo;
	private double dienTich;

	
	public int getMaTinh(){
		return this.maTinh;
	}
	
	public void setMaTinh(int maTinh){
		this.maTinh=maTinh;
	}
	
	public String getTenTinh(){
		return this.tenTinh;
	}
	
	public void setTenTinh(String tenTinh){
		this.tenTinh=tenTinh;
	}
	
	
	public int getDanso(){
		return this.danSo;
		
	}
	
	public ThongTinTinh(){
		this.danSo=1;
		this.dienTich=10;
		this.maTinh=123;
		this.tenTinh="hcm";
	}
	public void nhap() {
		Scanner reader = new Scanner(System.in);
		System.out.print("nhap ma tinh : ");
		this.maTinh = Integer.parseInt(reader.nextLine());
		System.out.print("nhap ten tinh : ");
		this.tenTinh = reader.nextLine();
		System.out.print("nhap dan so : ");
		this.danSo = Integer.parseInt(reader.nextLine());
		System.out.print("nhap  dien tich: ");
		this.dienTich = Double.parseDouble(reader.nextLine());
	}

	public void xuat() {
		System.out.println("ma tinh: "+this.maTinh);
		System.out.println("ten tinh: "+this.tenTinh);
		System.out.println("dan so : "+this.danSo);
		System.out.println("dien tich : "+this.dienTich);
	}
}
