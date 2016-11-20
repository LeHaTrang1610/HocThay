package vatNuoi;

import java.util.Scanner;

public class Meo extends VatNuoi implements InterFace {
	private String loaiMeo;

	public Meo(String ten, double tuoi, double canNang, String loaiMeo) {
		super(ten, tuoi, canNang);
		this.loaiMeo = loaiMeo;

	}
	
	public Meo(){
		
	}

	public String getLoaiMeo() {
		return loaiMeo;
	}

	public void setLoaiMeo(String loaiMeo) {
		this.loaiMeo = loaiMeo;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println(" nhap ten:");
		ten = reader.nextLine();
		System.out.println(" nhap tuoi:");
		tuoi = Double.parseDouble(reader.nextLine());
		System.out.println(" nhap can nang:");
		canNang = Double.parseDouble(reader.nextLine());
		System.out.println(" nhap loai:");
		loaiMeo = reader.nextLine();
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println(loaiMeo);
	}

	@Override
	public double tinhTienAn() {
		// TODO Auto-generated method stub
		double tienAn = (canNang - 1) * 0.04;
		return tienAn;
	}

}
