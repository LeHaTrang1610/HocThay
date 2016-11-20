package phanso;

import java.util.Scanner;

public class TamGiac {
 private ToaDo A;
 private ToaDo B;
 private ToaDo C;
 
 public TamGiac(){
	 this.A= new ToaDo();
	 this.B=new ToaDo();
	 this.C=new ToaDo();
 }
 
 public ToaDo getA(){
	 return this.A;
 }
 
 public void setA(ToaDo A){
	 this.A.setx(A.getx());
	 this.A.setY(A.getY());
 }
 
 public ToaDo getB(){
	 return this.B;
 }
 
 public void setB(ToaDo B){
	 this.B.setx(B.getx());
	this.B.setY(B.getY());
 }
 
 public ToaDo getC(){
	 return this.C;
 }
 
 public void setC(ToaDo C){
	 this.C.setx(C.getx());
	 this.C.setY(C.getY());
 }
 
 public void nhap(){
	 Scanner reader= new Scanner(System.in);
	 System.out.print("nhap toa do dinh thu nhat: ");
	 this.A.nhapToaDo();
	 System.out.print(" Nhap toa do dinh thu hai:");
	 this.B.nhapToaDo();
	 System.out.print("Nhap toa do dinh thu ba :");
	 this.C.nhapToaDo();
	 
 }
 
 public void xuat(){
	 System.out.println("Dinh thu nhat");
	 A.xuatToaDo();
	 System.out.println("Dinh thu hai");
	 B.xuatToaDo();
	 System.out.println("Dinh thu ba");
	 C.xuatToaDo();
 }
 
 public double ChuViTamGiac(){
	 double a = this.A.khoangCachDiem(this.B);
	 double b= this.B.khoangCachDiem(this.C);
	 double c= this.C.khoangCachDiem(this.A);
	 double p=a+b+c;
	 return p;
	 
	 }
 public double DienTichTamGiac(){
	 double a = this.A.khoangCachDiem(this.B);
	 double b= this.B.khoangCachDiem(this.C);
	 double c= this.C.khoangCachDiem(this.A);
	 double p=a+b+c;
	 double nuaChuVi= p/2;
	 double S= Math.sqrt(nuaChuVi*(nuaChuVi-a)*(nuaChuVi-b)*(nuaChuVi-c));
	 return S;
 }
 
}
