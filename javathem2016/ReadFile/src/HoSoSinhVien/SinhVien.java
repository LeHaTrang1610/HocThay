package HoSoSinhVien;

import java.util.Scanner;

public class SinhVien {
	protected String maso;
	protected String hoten;
	protected int namsinh;
	protected String dienthoai;

	public SinhVien(String maso, String hoten, int namsinh,String dienthoai) {
		this.maso= maso;
		this.hoten =hoten;
		this.namsinh = namsinh;
		this.dienthoai=dienthoai;
	}
	public SinhVien() {
	}


	public String getMaso() {
		return maso;
	}

	public void setMaso(String maso) {
		this.maso = maso;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public String getDienthoai() {
		return dienthoai;
	}

	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}
	
	
	public void nhap(){
		Scanner reader= new Scanner(System.in);
		System.out.println(" nhap massv:");
		 this.maso = reader.nextLine();
		System.out.println(" nhap hoten:");
		this.hoten = reader.nextLine();
		System.out.println(" nhap namsinh:");
		this.namsinh = Integer.parseInt(reader.nextLine());
		System.out.println(" nhap so dien thoai:");
		this.dienthoai = reader.nextLine();
	}
	
	public void xuat() {
		System.out.println(maso);
		System.out.println(hoten);
		System.out.println(namsinh);
		System.out.println(dienthoai);

	}

	
}
