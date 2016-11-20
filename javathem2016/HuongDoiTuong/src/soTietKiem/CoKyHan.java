package soTietKiem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CoKyHan extends TaiKhoanNganHang implements SoTietKiem {
	private int kyHan;
	
	public CoKyHan(String cmnd, String hoTenKhachHang, double soTienGui,
			String ngayLap, double laiSuat, int soThangGui, int kyHan) {
		super(cmnd, hoTenKhachHang, soTienGui, ngayLap, laiSuat, soThangGui);
		this.kyHan = kyHan;
	}

	public CoKyHan() {

	}

	public int getKyHan() {
		return kyHan;
	}

	public void setKyHan(int kyHan) {
		this.kyHan = kyHan;
	}

	public double tienLai() {
		Double tienLai = (double) 0;
		if (soThangGui >= kyHan) {
			tienLai = soTienGui * laiSuat * soThangGui;
		} else {
			return 0;
		}
		return tienLai();
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println(" so cmnd:");
		this.cmnd = reader.nextLine();
		System.out.println(" nhap ho ten khach hang:");
		this.hoTenKhachHang = reader.nextLine();
		System.out.println(" so tien gui:");
		this.soTienGui = Double.parseDouble(reader.nextLine());
		System.out.println(" nhap ngay lap:");
		this.ngayLap = reader.nextLine();
		System.out.println(" lai suat:");
		this.laiSuat = Double.parseDouble(reader.nextLine());
		System.out.println(" so thang gui:");
		this.soThangGui = Integer.parseInt(reader.nextLine());
		System.out.println(" nhap ky han:");
		this.kyHan = Integer.parseInt(reader.nextLine());
	}

	@Override
	public void xuat() {
		// TODO Auto-generated method stub
		super.xuat();
	}

	@Override
	public double tinhTienLai() {
		// TODO Auto-generated method stub
		double tienLai=0;
		if(soThangGui>=kyHan){
			 tienLai=soTienGui*laiSuat*soThangGui;
		}
		return tienLai;
	}

}
