package vatNuoi;

import java.util.Scanner;

public class Cho extends VatNuoi implements InterFace {
	private double chieuCao;
	private double chieuDai;

	public Cho() {

	}

	public Cho(String ten, double tuoi, double canNang, double chieuCao,
			double chieuDai) {
		super(ten, tuoi, canNang);
		this.chieuCao = chieuCao;
		this.chieuDai = chieuDai;

	}

	public double getCao() {
		return chieuCao;
	}

	public void setCao(double cao) {
		this.chieuCao = cao;
	}

	public double getDai() {
		return chieuDai;
	}

	public void setDai(double dai) {
		this.chieuDai = dai;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println(" nhap ten:");
		String ten = reader.nextLine();
		System.out.println(" nhap tuoi:");
		tuoi = Double.parseDouble(reader.nextLine());
		System.out.println(" nhap can nang:");
		canNang = Double.parseDouble(reader.nextLine());
		System.out.println("nhap chieu chieuCao");
		chieuCao = Double.parseDouble(reader.nextLine());
		System.out.println(" nhap chieu chieuDai:");
		chieuDai = Double.parseDouble(reader.nextLine());
	}

	@Override
	public void xuat() {

		super.xuat();
		System.out.println(chieuCao);
		System.out.println(chieuDai);

	}

	@Override
	public double tinhTienAn() {
		// TODO Auto-generated method stub
		double tienAn = canNang * 0.05;
		return tienAn;
	}

}
