package kethua;

public abstract class ConVat {

	protected double CanNang;
	protected String MauLong;
	
	public ConVat(){
		this.CanNang= 20;
		this.MauLong="xam";
	}
	
	public ConVat(double CanNang ,String MauLong){
		this.CanNang= CanNang;
		this.MauLong=MauLong;
	}
	
	
	public double getCanNang() {
		return CanNang;
	}
	public void setCanNang(double canNang) {
		CanNang = canNang;
	}
	public String getMauLong() {
		return MauLong;
	}
	public void setMauLong(String mauLong) {
		MauLong = mauLong;
	}
	
	public void xuat(){
		System.out.println(CanNang);
		System.out.println(MauLong);
	}
	
}
