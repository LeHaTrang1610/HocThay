/**
 * 
 */

import java.util.Scanner;

/**
 * @author Hi
 * 
 */
public class MangMotChieu02 {
	double a[];
	int n;

	public void nhap() {
		Scanner reader = new Scanner(System.in);
		System.out.println("nhap n");
		n = reader.nextInt();

		a = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan tu a[" + i + "]");
			a[i] = reader.nextDouble();
		}

	}

	public void xuat() {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MangMotChieu02 mc2 = new MangMotChieu02();
		mc2.nhap();
		mc2.xuat();
	}

}
