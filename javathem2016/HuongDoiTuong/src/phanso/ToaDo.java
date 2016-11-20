package phanso;

import java.util.Scanner;

public class ToaDo {
	private int x;
	private int y;

	public void nhapToaDo() {
		Scanner reader = new Scanner(System.in);
		System.out.print("nhap hoanh do :");
		this.x = reader.nextInt();
		System.out.print("nhap tung do :");
		this.y = reader.nextInt();
	}
	
	public ToaDo(){
		this.x=3;
		this.y=5;
	}
	
	public ToaDo(int x,int y){
		this.x=x;
		this.y=y;
		
	}

	public int getx() {
		return this.x;
	}

	public void setx(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void xuatToaDo() {
		System.out.println("(" + this.x + "," + this.y + ")");
	}
	
	public double khoangCachDiem(ToaDo a){
		double c=(double) Math.sqrt((this.x-a.x)*(this.x-a.x)+(this.y-a.y)*(this.y-a.y));
		return c;
	}
}


