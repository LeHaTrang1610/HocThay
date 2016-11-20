package soTietKiem;

import java.util.Scanner;

public class KhongKyHan extends TaiKhoanNganHang implements SoTietKiem {
 
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
		
	}

	


	@Override
	public void xuat() {
		super.xuat();
		System.out.println("so Thang Gui"+soThangGui);
	}
	
	@Override
	public double tinhTienLai() {
		// TODO Auto-generated method stub
		double tienLai=(double) 0;
		tienLai =(double)soTienGui*laiSuat*soThangGui;
		return tienLai;
	}
}
