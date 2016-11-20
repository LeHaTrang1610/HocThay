/**
 * 
 */
package soTietKiem;

/**
 * @author USER
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoKyHan kq = new CoKyHan();
		kq.nhap();
		kq.xuat();
		double c= kq.tinhTienLai();
		System.out.println(c);

	}

}
