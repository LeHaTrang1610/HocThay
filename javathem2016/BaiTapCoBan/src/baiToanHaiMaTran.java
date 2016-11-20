import java.util.Scanner;

/**
 * 
 */

/**
 * T
 * 
 */
public class baiToanHaiMaTran {
	BaiTapCoBan btcb = new BaiTapCoBan();

	public void nhapMaTran(int ma[][], int n) {
		Scanner reader = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" nhap phan tu thu a[" + i + "][" + j + "]: ");
				ma[i][j] = reader.nextInt();
			}
		}
	}

	public void xuatMaTran(int ma[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ma[i][j] + " ");

			}
			System.out.println();
		}

	}

	public int[][] cong(int ma1[][], int n1, int ma2[][], int n2) {
		int[][] c = new int[n1][n2];
		if (n1 != n2)
			return c;
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1; j++) {
				c[i][j] = ma1[i][j] + ma2[i][j];

			}
		}
		return c;
	}

	public int[][] tru(int a[][], int n1, int b[][], int n2) {
		int d[][] = new int[n1][n2];
		if (n1 != n2) {
			return d;
		}
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1; j++) {
				d[i][j] = a[i][j] - b[i][j];
			}
		}
		return d;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		baiToanHaiMaTran btmt = new baiToanHaiMaTran();
		System.out.print("nhap so luong dong va cot cho ma tran a: ");
		Scanner reader = new Scanner(System.in);
		int n1 = reader.nextInt();
		int[][] a = new int[n1][n1];
		btmt.nhapMaTran(a, n1);
		btmt.xuatMaTran(a, n1);

		System.out.println(" nhap so luong dong va cot cua ma tran b:");
		int n2 = reader.nextInt();
		int[][] b = new int[n2][n2];
		btmt.nhapMaTran(b, n2);
		btmt.xuatMaTran(b, n2);
		//int[][] c = btmt.cong(a, n1, b, n2);
		//btmt.xuatMaTran(c, n1);
		int e[][] = btmt.tru(a, n1, b, n2);
		btmt.xuatMaTran(e, n1);
	}

}
