package phanso;

import java.util.Scanner;

public class DuongTron {

	private ToaDo I;//khai bao toa do;
	private double R;
	
	public DuongTron(){
		this.I = new ToaDo();
		this.R=6;
	}
	
	public DuongTron(double R, ToaDo I){
		this.R=R;
		this.I=I;
	}
	
	public ToaDo getI(){
		return this.I;
	}
	
	public void setI(ToaDo I){
		this.I.setx(I.getx());
		this.I.setY(I.getY());
		
		
	}
	
	public double getR(){
		return this.R;
	}
	
	public void setR(double banKinh){
		this.R=banKinh;
	}
	
	public void nhap(){
		Scanner reader= new Scanner(System.in);
		System.out.println("nhap tam duong tron: ");
		this.I.nhapToaDo();
		System.out.println("nhap ban kinh duong tron ");
		this.R=Double.parseDouble(reader.nextLine());
	}
	
	public void xuat(){
		System.out.print("Tam: ");
		this.I.xuatToaDo();
		System.out.println("ban kinh: "+this.R);
	}
	
	
	
}
