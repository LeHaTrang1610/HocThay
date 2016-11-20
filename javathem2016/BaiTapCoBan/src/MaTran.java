import java.sql.BatchUpdateException;
import java.util.Scanner;

public class MaTran {

	int m; // so luong dong;
	int n; // so luong cot;
	int[][] a; // ma hai chieu cac so nguyen;
	BaiTapCoBan btcb = new BaiTapCoBan();

	public void nhap() {
		System.out.print("nhap so luong dong cho ma tran: ");
		Scanner reader = new Scanner(System.in);
		m = reader.nextInt();
		System.out.print("nhap so luong cot cho ma tran: ");
		n = reader.nextInt();
		a = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" nhap phan tu thu a[" + i + "][" + j + "]: ");
				a[i][j] = reader.nextInt();
			}
		}
	}

	public void xuat() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}

	}

	public int baiTap151() {
		int s = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > 0) {
					s = s + a[i][j];
				}
			}
		}
		return s;

	}

	public int baiTap152() {
		int s = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] % 2 != 0) {
					s = s + a[i][j];
				}
			}
		}
		return s;

	}

	public int baiTap153(int d) {
		int s = 0;

		for (int j = 0; j < n; j++) {

			s = s + a[d][j];
		}

		return s;

	}

	public int baiTap154(int d) {
		int s = 0;

		for (int i = 0; i < m; i++) {

			s = s + a[i][d];
		}

		return s;

	}

	public int baiTap155(int d) {
		int s = 0;

		for (int j = 0; j < n; j++) {
			if (a[d][j] > 0) {
				s = s + a[d][j];
			}

		}

		return s;

	}

	public int baiTap156(int d) {
		int s = 1;
		for (int i = 0; i < m; i++) {
			if (a[i][d] % 2 == 0) {
				s = s * a[i][d];
			}

		}
		return s;
	}

	public void baiTap157() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] < 0) {
					a[i][j] = Math.abs(a[i][j]);

				}
			}
		}
	}

	public int baiTap159(int d) {
		int s = 0;
		for (int i = 0; i < m; i++) {
			if (a[i][d] % 2 != 0) {
				s = s + a[i][d];
			}

		}
		return s;
	}

	public int baiTap160() {
		int s = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (btcb.baiTap30(a[i][j]) == 1) {
					s = s + a[i][j];

				}
			}
		}
		return s;
	}

	/**
	 * public int baiTap162a(){
	 * 
	 * for(int i=0;i<n;i++){
	 * 
	 * if(n%i==0){ return 1;
	 * 
	 * 
	 * 
	 * }
	 * 
	 * } return 0; }
	 **/

	public int baiTap162() {
		int idem = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (btcb.baiTap31(a[i][j]) == 1) {
					idem++;

				}
			}
		}
		return idem;
	}

	public int baiTap163() {
		// 123 4 67 a[0][0] = 123
		// 567 3 8
		// 222 5 99
		int idem = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				idem += btcb.baiTap36(a[i][j]);
			}
		}
		return idem;
	}

	public int baiTap165(int d) {
		int idem = 0;
		for (int j = 0; j < n; j++) {
			if (btcb.baiTap30(a[d][j]) == 1) {
				idem++;
			}

		}
		return idem;
	}

	public int baiTap170() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > 0) {
					return 1;

				}
			}
		}
		return 0;
	}

	public int baiTap171() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (btcb.baiTap30(a[i][j]) == 1) {
					return 1;

				}
			}
		}
		return 0;
	}

	public int baiTap172() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] % 2 != 0) {
					return 1;

				}
			}
		}
		return 0;
	}

	public int baiTap173() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] < 0) {
					return 0;

				}
			}
		}
		return 1;
	}

	public int baiTap174(int d) {
		// d = 2; 123
		for (int j = 1; j < n; j++) {
			if (a[d][j - 1] > a[d][j]) {
				return 0;

			}
		}
		return 1;
	}

	public int baiTap176() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i + 1][j + 1] >= a[i][j]) {
					return 0;

				}
			}
		}
		return 1;
	}

	// 2 4 6 8: 0
	// 1 3 5 6: 1
	// 2 2 4 8: 2
	// ->=0,2
	public int baiTap177a(int d) {
		// d -> tona chan hay ko?

		for (int j = 0; j < n; j++) {
			if (a[d][j] % 2 != 0) {
				return 0;

			}

		}
		return 1;
	}

	public void baiTap177b() {
		for (int i = 0; i < m; i++) { // d=0,1,2 ; d=2 < m=3;
			int kt = baiTap177a(i);
			if (kt == 1) {
				System.out.println(" " + i);
			}
		}
		//
	}

	/**
	 * public void baiTap177b(dung ){ for(int i=0; i<m;i++){ if(baitap(i)==1){//
	 * viet tat cua 177 tren System.out.println(i);
	 * 
	 * }
	 * 
	 * 
	 * } }
	 */
	public int baiTap178a(int d) {
		for (int j = 0; j < m; j++) {
			if (a[d][j] % 2 == 0) {
				return 1;

			}

		}
		return 0;

	}

	public void baiTap178() {
		for (int i = 0; i < n; i++) {
			if (baiTap178a(i) == 1) {
				System.out.println(" " + i);
			}
		}
		System.out.println(" khong ton tai so chang trong ma tran");
	}

	// 0 1 2
	// 0: 1 2 3 ;
	// 1: 4 9 7 ;
	// 2: 1 1 1
	// m=3;

	public int baiTap179a(int c) {
		for (int i = 0; i < m; i++) {
			if (btcb.baiTap32(a[i][c]) == 1) {
				return 1;
			}
		}
		return 0;

	}

	public void baiTap179() {
		for (int i = 0; i < m; i++) {
			if (baiTap179a(i) == 1) {
				System.out.println(+i);
			}
		}
	}

	public int baiTap180a() {
		int max = a[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[j][j] > max) {
					max = a[i][j];
				}
			}
		}
		return max;
	}

	public int baiTap180b(int d) {
		int max = baiTap180a();
		for (int j = 0; j < n; j++) {
			if (max == a[d][j]) {
				return 1;
			}

		}
		return 0;

	}

	// 1 2 3
	// 5 8 1
	// 7 2 7

	public void baiTap180() {
		for (int j = 0; j < m; j++) {
			if (baiTap180b(j) == 1) {
				System.out.println(" " + j);
			}

		}

	}

	public int baiTap181a(int c) {
		for (int i = 1; i < m; i++) {
			if (a[i - 1][c] > a[i][c]) {
				return 0;
			}
		}
		return 1;

	}

	public void baiTap181() {
		for (int j = 0; j < n; j++) {
			if (baiTap181a(j) == 1) {
				System.out.println(" " + j);
			}

		}

	}

	public int baiTap182a(int d) {
		for (int j = 0; j < n; j++) {
			if (a[d][j] >= 0) {
				return 0;
			}
		}
		return 1;

	}

	public void baiTap182() {
		for (int i = 0; i < m; i++) {
			if (baiTap182a(i) == 1) {
				System.out.print(" " + i);
			}
		}

	}

	public int baiTap183a(int d) {
		for (int j = 0; j < n; j++) {
			if (a[d][j] < 0) {
				return 1;
			}
		}
		return 0;

	}

	public void baiTap183() {
		for (int i = 0; i < m; i++) {
			if (baiTap183a(i) == 1) {
				System.out.print(" " + i);
			}
		}

	}

	public int baiTap184a(int d) {
		for (int j = 1; j < n; j++) {
			if (a[d][j - 1] < a[d][j]) {
				return 0;
			}
		}
		return 1;

	}

	public void baiTap184() {
		for (int i = 0; i < m; i++) {
			if (baiTap184a(i) == 1) {
				System.out.println(" " + i);
			}

		}

	}

	public int baiTap185() {
		int max = a[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
		}
		return max;

	}

	public int baiTap186() {
		int m2 = a[0][0];
		int max = baiTap185();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (m2 < a[i][j] && m2 < max && a[i][j] != max) {
					m2 = a[i][j];
				}
			}

		}
		return m2;

	}

	public int baiTap187() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > 0) {
					return a[i][j];
				}
			}

		}
		return 0;

	}

	public int baiTap188() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] % 2 == 0) {
					return a[i][j];
				}
			}

		}
		return 0;

	}

	public int baiTap189(int c) {
		int min = a[0][c];
		for (int i = 0; i < m; i++) {
			if (min > a[i][c]) {
				min = a[i][c];
			}
		}
		return min;

	}

	public int baiTap190() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (btcb.baiTap31(a[i][j]) == 1) {
					return a[i][j];
				}
			}

		}
		return 0;

	}

	public int baiTap191() {
		int max = a[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > max && a[i][j] % 2 == 0) {
					max = a[i][j];
				}
			}
		}
		return max;

	}

	// sao tai sao lai sai thay em cho a[i][j]>0 saono lay -2 thay

	public int baiTap192() {
		int min = baiTap187();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > 0 && min > a[i][j]) {
					min = a[i][j];
				}
			}
		}
		return min;

	}

	public int baiTap193() {
		int max = baiTap190();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (max < a[i][j] && btcb.baiTap31(a[i][j]) == 1) {
					max = a[i][j];
				}
			}
		}
		return max;
	}

	public int baiTap194b() {
		int min = baiTap188();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] % 2 == 0 && min > a[i][j]) {
					min = a[i][j];
				}
			}
		}
		return min;
	}

	public int baiTap194() {
		int idem = 0;
		int min = baiTap194b();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == min) {
					idem++;
				}
			}
		}
		return idem;
	}

	public int baiTap195() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (btcb.baiTap32(a[i][j]) == 1) {
					return a[i][j];
				}
			}
		}
		return 0;
	}

	public int baiTap195b() {
		int max = baiTap195();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > max && baiTap195() == 1) {
					max = a[i][j];
				}
			}
		}
		return max;
	}

	public int baiTap196() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (btcb.baiTap30(a[i][j]) == 1) {
					return a[i][j];
				}
			}
		}
		return 0;
	}

	public int baiTap196b() {
		int min = baiTap196();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] < min && baiTap196() == 1) {
					return a[i][j];
				}
			}
		}
		return min;
	}

	public int baiTap197() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] < 0) {
					return a[i][j];
				}
			}
		}
		return 0;
	}

	public int baiTap197b() {
		int max = baiTap197();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > max && a[i][j] < 0) {
					max = a[i][j];
				}
			}
		}
		return max;
	}

	public int baiTap198(int d) {
		int max = a[d][0];
		for (int j = 0; j < n; j++) {
			if (a[d][j] > max) {
				max = a[d][j];
			}

		}
		return max;
	}

	public int baiTap199a(int x) {
		int idem = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (x == a[i][j]) {
					idem++;
				}
			}
		}
		return idem;
	}

	public int baiTap199b() {
		int mx = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (baiTap199a(a[i][j]) > mx) {
					mx = baiTap199a(a[i][j]);
				}
			}
		}
		return mx;
	}

	public void baiTap199() {
		int max = baiTap199b();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (baiTap199a(a[i][j]) == max) {
					System.out.println(" " + a[i][j]);
				}
			}
		}
	}

	public int baiTap200a(int x) {
		int idem = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > 0 && x == a[i][j]) {
					idem++;
				}
			}
		}
		return idem;
	}

	public int baiTap200b() {
		int min = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (baiTap200a(a[i][j]) < min) {
					min = baiTap200a(a[i][j]);
				}
			}
		}
		return min;
	}

	public void baiTap200c() {
		int min = baiTap200b();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (baiTap200a(a[i][j]) == min) {
					System.out.println(" " + a[i][j]);
				}
			}
		}
	}

	public void baiTap201(int d) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 1 + i; j < n; j++) {
				if (a[d][i] > a[d][j]) {
					int sTmp = a[d][j];
					a[d][j] = a[d][i];
					a[d][i] = sTmp;
				}
			}
		}
	}

	public void baiTap202(int d) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 1 + i; j < n; j++) {
				if (a[d][i] < a[d][j]) {
					int sTmp = a[d][j];
					a[d][j] = a[d][i];
					a[d][i] = sTmp;
				}
			}
		}
	}

	public void baiTap203(int c) {
		for (int i = 0; i < m - 1; i++) {
			for (int j = 1 + i; j < m; j++) {
				if (a[i][c] > a[j][c]) {
					int sTmp = a[i][c];
					a[i][c] = a[j][c];
					a[j][c] = sTmp;
				}
			}
		}
	}

	public void baiTap204(int c) {
		for (int i = 0; i < m - 1; i++) {
			for (int j = 1 + i; j < m; j++) {
				if (a[i][c] < a[j][c]) {
					int sTmp = a[i][c];
					a[i][c] = a[j][c];
					a[j][c] = sTmp;
				}
			}
		}
	}

	public void baiTap205a() {
		int b[] = new int[m * n];
		int k = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] % 2 == 0) {
					b[k++] = a[i][j];
				}
			}
		}
		for (int g = 0; g < k - 1; g++) {
			for (int t = g + 1; t < k; t++) {

				if (b[g] < b[t] && b[g] % 2 == 0 && b[t] % 2 == 0) {
					int sTmp = b[g];
					b[g] = b[t];
					b[t] = sTmp;
				}
			}
		}
		for (int i = 0; i < k; i++) {
			System.out.print(b[i] + " ");
		}
	}

	//
	public void baiTap206() {
		int b[] = new int[m * n];
		int k = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (btcb.baiTap31(a[i][j]) == 1) {
					b[k++] = a[i][j];
				}
			}
		}
		for (int g = 0; g < k - 1; g++) {
			for (int t = g + 1; t < k; t++) {

				if (b[g] > b[t]) {
					int sTmp = b[g];
					b[g] = b[t];
					b[t] = sTmp;
				}
			}
		}
		for (int i = 0; i < k; i++) {
			System.out.print(b[i] + " ");
		}
	}

	//
	public void baiTap207() {
		int b[] = new int[m * n];
		int k = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				b[k++] = a[i][j];
			}
		}
		for (int g = 0; g < k - 1; g++) {
			for (int t = g + 1; t < k; t++) {
				if (b[g] > b[t]) {
					int sTmp = b[g];
					b[g] = b[t];
					b[t] = sTmp;
				}
			}
		}
		//
		k = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = b[k++];
			}
		}
		// run di

	}

	//

	public int baiTap208() {
		int s = 0;
		for (int i = 0; i < m; i++) {
			for (int j = i + 1; j < n; j++) {
				s = s + a[i][j];
			}
		}
		return s;
	}

	//
	public int baiTap208c2() {
		int s = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i < j) {
					s = s + a[i][j];
				}
			}
		}
		return s;
	}

	public int baiTap209() {
		int s = 0;
		for (int i = m - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				s = s + a[i][j];
			}
		}
		return s;
	}

	public int baiTap209c2() {
		int s = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i > j) {
					s = s + a[i][j];
				}
			}
		}
		return s;
	}

	//

	public int baiTap210() {
		int s = 0;
		for (int i = 0; i < m; i++) {
			for (int j = i; j <= i; j++) {
				s = s + a[i][j];
			}
		}
		return s;
	}

	public int baiTap210c2() {
		int s = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					s = s + a[i][j];
				}
			}
		}
		return s;
	}

	// 1 2 3
	// 3 4 5
	// 8 9 1

	public int baiTap211() {
		int s1 = 0, s2 = 0, s3 = 0;
		int s = 0;
		for (int j = 0; j < n; j++) {
			if (a[0][j] % 2 == 0) {
				s1 = s1 + a[0][j];
			}

		}
		for (int j = 0; j < n; j++) {
			if (a[m - 1][j] % 2 == 0) {
				s2 = s2 + a[m - 1][j];
			}
		}

		for (int i = 1; i < m - 1; i++) {
			if (a[i][0] % 2 == 0) {
				s3 = s3 + a[i][0];

			}
			if (a[i][n - 1] % 2 == 0) {
				s3 = s3 + a[i][n - 1];
			}
			if (a[i][0] % 2 == 0 && a[i][n - 1] % 2 == 0) {
				s3 = s3 + a[i][0] + a[i][n - 1];
			}
			s = s1 + s2 + s3;
		}
		return s3;
	}

	//
	public int baiTap211c2() {
		int s = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0 || i == m - 1 || j == 0 || j == m - 1) {
					s = s + a[i][j];
				}
			}
		}
		return s;
	}

	public int baiTap212() {
		int dem = 0;
		for (int i = 0; i < m; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i][j] == a[j][i])
					dem++;
			}
		}
		return dem;
	}

	public int baiTap213a(int d) {
		for (int j = 1; j < n; j++) {
			if (a[d][j - 1] < a[d][j]) {
				return 0;
			}
		}
		return 1;

	}

	public int baiTap213() {
		int s = 0;
		for (int i = 0; i < m; i++) {

			if (baiTap213a(i) == 1) {
				s++;

			}
		}
		return s;
	}

	public int baiTap214a() {
		int max = a[0][0];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
				}
			}
		}
		return max;

	}

	public int baiTap214() {
		int max = baiTap214a();
		int idem = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (max == a[i][j]) {
					idem++;
				}
			}
		}
		return idem;

	}

	public int baiTap215() {
		int s = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > 0 && i == j) {
					s++;
				}
			}
		}
		return s;
	}

	public int baiTap216() {
		int s = 0;
		for (int i = 0; i < m; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i][j] % 2 == 0) {
					s++;
				}
			}
		}
		return s;
	}

	public int baiTap216c2() {
		int idem = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] % 2 == 0 && i < j) {
					idem++;
				}
			}
		}
		return idem;
	}

	public int baiTap217() {
		int s = 0;
		for (int i = 1; i < m; i++) {
			for (int j = i; j <= i; j++) {
				if (a[i - 1][j - 1] > a[i][j]) {
					return 0;
				}
			}
		}
		return 1;
	}

	public int baiTap217c2() {
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (i == j && a[i - 1][j - 1] > a[i][j]) {
					return 0;
				}
			}
		}
		return 1;
	}

	public int baiTap218() {
		if (m != n) {
			return 0;
		}
		return 1;
	}
	
	public int baiTap218c2(){
		for(int i=0;i<m;i++){
			for(int j=i+1;j<n;j++){
				if( a[i][j] != a[j][i]){
					return 0;
				}
			}
		}
		return 1;
	}

	public void baiTap219() {
		for (int i = 1; i < m; i++) {
			for (int j = i; j <= i; j++) {
				if (a[i - 1][j - 1] > a[i][j]) {
					int stmp = a[i - 1][j - 1];
					a[i - 1][j - 1] = a[i][j];
					a[i][j] = stmp;
				}
			}
		}
	}
	
	public void baiTap219c2(){
		for(int i=0;i<m-1;i++){
				for( int j=i+1;j<m;j++){
					if(a[i][i]>a[j][j]){// i i  jj // tc dg cheo chinh
						int sTmp= a[i][i];
						a[i][i]=a[j][j];
						a[j][j]=sTmp;
						
				}
			}
				
		}
		
	}
	
	

	/*
	 * public int baiTap205b() { for (int i = 1; i < m; i++) { if
	 * (baiTap205a(i)==1) { return 1; }
	 * 
	 * } return 0; }
	 * 
	 * public int baiTap205c() { for (int i = 1; i < m; i++) { for (int j = 1; j
	 * < n; j++) { if (baiTap205b()== 1 && a[i-1][j - 1] > a[i][j] && a[i-1][j -
	 * 1] % 2 == 0 && a[i][j] % 2 == 0) { int sTmp = a[i][j]; a[i][j] = a[i -
	 * 1][j-1]; a[i - 1][j-1] = sTmp; } } } return 0; }*
	 */

	public static void main(String[] arr) {
		MaTran mt = new MaTran();
		mt.nhap();
		mt.xuat();
		// int c= mt.baiTap151();
		// System.out.println("Tong cac so duong trong ma tran la :"+c);
		// int c=mt.baiTap152();
		// System.out.println("tong cac so le trong mang so nguyen la :"+c);
		// int c = mt.baiTap153(2);
		// System.out.println("tong cac so le trong mang so nguyen la :" + c);
		// int c = mt.baiTap155(2);
		// System.out.println("tong theo dong :" + c);
		// int c= mt.baiTap156(2);
		// System.out.println("tich cac so chan  tren mot cot trong ma tran so nguyen la :"+c);
		// mt.baiTap157();
		// System.out.println("");
		// mt.xuat();
		// int c= mt.baiTap159(2);
		// System.out.println(" tong cac gia tri le tren mot cot trong ma tran so nguyen :"
		// +c);
		// int c= mt.baiTap159(2);
		// System.out.println(" tong cac gia tri le tren mot cot trong ma tran so nguyen :"
		// +c);
		// int c= mt.baiTap160();
		// System.out.println(" tong cac so hoan thien trong ma tran so nguyen :"+c);

		// int c= mt.baiTap162();
		// System.out.println("so luong so nguyen to trong ma tran:" +c);
		// int c= mt.baiTap163();
		// System.out.println("so luong chu so trong trong ma tran:" +c);
		// int c = mt.baiTap165(2);
		// System.out.println("so luong so hoan thien trn 1 hang trong trong ma tran:"+
		// c);
		// int c= mt.baiTap170();
		// System.out.println(" ket qua kiem tra:" +c);
		// int c= mt.baiTap171();
		// System.out.println(" ket qua kiem tra:" +c);
		// int c= mt.baiTap172();
		// System.out.println(" ket qua kiem tra:" +c);
		// int c= mt.baiTap173();
		// System.out.println(" ket qua kiem tra:" +c);
		// mt.baiTap177b();
		// mt.baiTap180();
		// mt.baiTap184();
		// int c = mt.baiTap185();
		// System.out.println(" gia tri lon nhat trong ma tran :  " + c);
		// int c = mt.baiTap187();
		// System.out.println(" gia tri duong dau tien trong mang so nguyen:  "
		// + c);
		// int c = mt.baiTap188();
		// System.out.println(" gia tri chan dau tien trong mang so nguyen: +
		// c);
		// int c = mt.baiTap189( 2);
		// System.out.println(" gia tri nho nhat trong cot:" + c);
		// int c = mt.baiTap190( );
		// System.out.println(" so nguyen to dau tien trong ma tran:" + c);
		// int c = mt.baiTap191();
		// System.out.println(" gia tri chan lon  nhat:" + c);
		// int c = mt.baiTap198(2);
		// System.out.println("  :" + c);
		// mt.baiTap205c();
		// System.out.println("");
		// mt.xuat();
		// mt.baiTap201(2);
		// System.out.println("  ");
		// mt.xuat();

		// mt.baiTap202(2);
		// System.out.println("  ");
		// mt.xuat();

		// mt.baiTap205a();
		// mt.baiTap207();
		// System.out.print(" ");
		// mt.xuat();

		mt.baiTap219c2();
		mt.xuat();
		//System.out.println(+c);
		//System.out.println(" ");
		//mt.baiTap219c2();
		//mt.xuat();
		
		
		 
		// mt.xuat();
	}

}
