package kethua;

import java.util.Scanner;

public class ConMeo extends ConVat implements VatNuoi{
	private double ChieuCao;

	public ConMeo() {
		super();
		this.ChieuCao = 5;

	}

	public ConMeo(double CanNang, double ChieuCao, String MauLong) {
		super(CanNang,MauLong);
		this.ChieuCao = ChieuCao;

	}

	
	public double getChieuCao() {
		return ChieuCao;
	}

	public void setChieuCao(double chieuCao) {
		ChieuCao = chieuCao;
	}

	

	@Override
	public void nhap() {
		Scanner reader= new Scanner(System.in);
		System.out.println("can nang cua con meo: ");
		this.CanNang= Double.parseDouble(reader.nextLine());
		System.out.println("chieu dai cua con meo: ");
		this.ChieuCao= Double.parseDouble(reader.nextLine());
		System.out.println(" mau long cua con meo: ");
		this.MauLong= reader.nextLine();
	}
	
	@Override
	public void xuat(){
		super.xuat();
		System.out.println(ChieuCao);
	}
}
