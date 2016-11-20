package kethua;

import java.util.Scanner;

public class ConCho extends ConVat implements VatNuoi{

	private double ChieuDai;

	public ConCho() {
		super();
		this.ChieuDai= 30;
	}

	public ConCho(double CanNang, double ChieuDai, String MauLong) {
		super(CanNang, MauLong);
		this.ChieuDai = ChieuDai;
	}

	public double getChieuDai() {
		return ChieuDai;
	}

	public void setChieuDai(double chieuDai) {
		ChieuDai = chieuDai;
	}
	
	
	@Override
	public void nhap(){
		Scanner reader= new Scanner(System.in);
		System.out.println("can nang cua con cho: ");
		this.CanNang= Double.parseDouble(reader.nextLine());
		System.out.println("chieu dai cua con cho: ");
		this.ChieuDai= Double.parseDouble(reader.nextLine());
		System.out.println(" mau long cua con cho: ");
		this.MauLong= reader.nextLine();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.println(ChieuDai);
	}

}
