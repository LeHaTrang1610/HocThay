package vatNuoi;

public abstract class VatNuoi {
	protected String ten;
	protected double tuoi;
	protected double canNang;

	public VatNuoi(String ten, double tuoi, double canNang) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.canNang = canNang;
	}

	public VatNuoi() {

	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getTuoi() {
		return tuoi;
	}

	public void setTuoi(double tuoi) {
		this.tuoi = tuoi;
	}

	public double getCanNang() {
		return canNang;
	}

	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}

	public void xuat() {
		System.out.println(ten);
		System.out.println(tuoi);
		System.out.println(canNang);

	}
}
