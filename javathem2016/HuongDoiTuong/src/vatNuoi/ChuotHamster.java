package vatNuoi;

import java.util.Scanner;

public class ChuotHamster extends VatNuoi implements InterFace {
	private int mauLong;
	
	public ChuotHamster(){
		
	}

	public ChuotHamster(String ten, double tuoi, double canNang, int mauLong) {
		super(ten, tuoi, canNang);
		this.mauLong = mauLong;

	}

	public int getMauLong() {
		return mauLong;
	}

	public void setMauLong(int mauLong) {
		this.mauLong = mauLong;
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
		System.out.println(" nhap mau long:");
		mauLong = Integer.parseInt(reader.nextLine());
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
		System.out.println(mauLong);
	}

	@Override
	public double tinhTienAn() {
		// TODO Auto-generated method stub
		double tienAn = 0;
		if ((mauLong == 0 || mauLong == 2)) {
			tienAn = (canNang + tuoi) * 0.02;
		} else {
			tienAn = canNang * 0.025;
		}
		return tienAn;
	}

}
