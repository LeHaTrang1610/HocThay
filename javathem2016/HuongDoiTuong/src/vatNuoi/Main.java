/**
 * 
 */
package vatNuoi;

/**
 * @author USER
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChuotHamster c= new ChuotHamster();
		c.nhap();
		c.xuat();
		double a=c.tinhTienAn();	
		System.out.println(a);

	}

}
