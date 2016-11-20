package soTietKiem;

import java.text.DecimalFormat;

public abstract class TaiKhoanNganHang {
	protected String cmnd;
	protected String hoTenKhachHang;
	protected double soTienGui;
	protected String ngayLap;
	protected double laiSuat;
	protected int soThangGui;
	private DecimalFormat df = new DecimalFormat(".##");

	public TaiKhoanNganHang(String cmnd, String hoTenKhachHang,
			double soTienGui, String ngayLap, double laiSuat, int soThangGui) {
		this.cmnd = cmnd;
		this.hoTenKhachHang = hoTenKhachHang;
		this.soTienGui = soTienGui;
		this.ngayLap = ngayLap;
		this.laiSuat = laiSuat;
		this.soThangGui = soThangGui;
	}

	public TaiKhoanNganHang() {

	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getHoTenKhachHang() {
		return hoTenKhachHang;
	}

	public void setHoTenKhachHang(String hoTenKhachHang) {
		this.hoTenKhachHang = hoTenKhachHang;
	}

	public double getSoTienGui() {
		return soTienGui;
	}

	public void setSoTienGui(double soTienGui) {
		this.soTienGui = soTienGui;
	}

	public String getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}

	public double getLaiSuat() {
		return laiSuat;
	}

	public void setLaiSuat(double laiSuat) {
		this.laiSuat = laiSuat;
	}

	public int getSoThangGui() {
		return soThangGui;
	}

	public void setSoThangGui(int soThangGui) {
		this.soThangGui = soThangGui;
	}

	public void xuat() {
		System.out.println("cmnd :" + cmnd);
		System.out.println("ho Ten Khach Hang" + hoTenKhachHang);
		System.out.println("So Tien Gui" + df.format(soTienGui));
		System.out.println("ngay Lap" + ngayLap);
		System.out.println("lai Suat" + df.format(laiSuat));
	}

}
