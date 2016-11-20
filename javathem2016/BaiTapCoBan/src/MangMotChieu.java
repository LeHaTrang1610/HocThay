/**
 * 
 */


import java.util.Scanner;

/**
 * @author Hi
 * 
 */
public class MangMotChieu {

	int a[]; // a la mang mot chieu cac so nguyen;
	int n; // so luong phan tu.

	BaiTapCoBan btcb = new BaiTapCoBan();

	public void nhap() {
		Scanner reader = new Scanner(System.in);
		System.out.print("nhap so luong phan tu: ");
		n = reader.nextInt();
		a = new int[n]; // tao ra mang so nguyen co n phan tu;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu a[" + i + "]");
			a[i] = reader.nextInt();
		}

	}

	public void xuat() {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	//
	public void bai50() {

		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
		}
	}

	public void baitap51() {
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(i + " ");
			}

		}
	}

	public int baitap52() {
		int max = a[0];

		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];

			}

		}
		return max;

	}

	public int baiTap53() {
		for (int i = n - 1; i >= 0; i--) {
			if (a[i] % 2 == 0) {
				return a[i];
			}
		}
		return 1;
	}

	public int baiTap54a() {

		int min = a[0];
		for (int i = 0; i > 0; i++) {

			if (a[i] < a[0]) {
				min = a[i];

			}

		}
		return min;

	}

	public int baiTap54() {
		int min = baiTap54a();
		for (int i = 0; i < n; i++) {
			if (a[i] == min) {
				return i;
			}
		}
		return -1;
	}

	// 5 6 3 4 3 8 9

	public int baiTap56() {
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				return i;
			}
		}
		return 1;
	}

	public int baiTap57() {
		for (int i = n - 1; i >= 0; i++) {
			if (btcb.baiTap30(a[i]) == 1) {
				return a[i];
			}
		}
		return 1;
	}

	// 3 5 6 -1 -8
	// 1: so duong dau tien.
	// 2: x= 1;
	public int baiTap58a() {

		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {

				return a[i];
			}

		}
		return -1;

	}

	public int baiTap58() {
		int min = baiTap58a();
		for (int i = 0; i < n; i++) {
			if (a[i] < min && a[i] > 0) {
				min = a[i];

			}
		}
		return min;
	}

	public int baiTap59() {
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				return a[i];
			}
		}
		return 1;
	}

	public int baiTap60() {
		for (int i = 0; i < n; i++) {
			if (btcb.baiTap31(a[i]) == 1) {
				return a[i];
			}
		}
		return 0;
	}

	public int baiTap61() {
		for (int i = 0; i < n; i++) {
			if (btcb.baiTap30(a[i]) == 1) {
				return a[i];
			}
		}
		return 1;
	}

	public int baiTap62() {
		for (int i = 0; i < n; i++) {
			if (a[i] < 0) {
				return a[i];
			}
		}
		return 1;
	}

	public int baiTap63a() {
		for (int i = 0; i < n; i++) {
			if (btcb.baiTap31(a[i]) == 1) {
				return a[i];
			}
		}
		return 0;

	}

	public int baiTap63() {
		int max = baiTap63a();
		for (int i = 0; i < n; i++) {
			if (max < a[i] && btcb.baiTap31(a[i]) == 1) {
				max = a[i];

			}
		}
		return max;
	}

	public int baiTap64() {
		int min = baiTap61();
		for (int i = 0; i < n; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	public int baiTap65a() {
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				return a[i];
			}
		}
		return 1;
	}

	public int baiTap65() {
		int min = baiTap65a();
		for (int i = 0; i < n; i++) {
			if (min > a[i] && a[i] % 2 == 0) {
				min = a[i];

			}

		}
		return min;

	}

	public int baiTap66a() {
		for (int i = 0; i < n; i++) {
			if (a[i] < 0) {
				return a[i];
			}
		}
		return 0;
	}

	public int baiTap66b() {
		int max = baiTap66a();
		for (int i = 0; i < n; i++) {
			if (max < a[i] && a[i] < 0) {
				max = a[i];
			}
		}
		return max;
	}

	public void baiTap66() {
		int max = baiTap66b();
		for (int i = 0; i < n; i++) {
			if (a[i] == max) {
				System.out.println(a[i]);
			}
		}
	}

	public int baiTap67() {
		for (int i = 0; i < n; i++) {
			if (a[i] > 2015) {
				return a[i];
			}
		}
		return 0;
	}

	public int baiTap68(int x, int y) {
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > x && a[i] < y) {
				return a[i];
			}

		}
		return x;
	}

	public int baiTap69() {
		for (int i = 0; i < n - 1; i++) {
			if (a[i] == a[i - 1] * a[i + 1]) {
				return a[i];

			}
		}
		return -1;
	}

	public int baiTap70() {
		for (int i = 0; i < n; i++) {
			if (btcb.baiTap32(a[i]) == 1) {
				return a[i];
			}
		}
		return -1;
	}

	public void baiTap78(int b, int c) {

		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.print("  " + a[i]);

			}

		}
	}

	public void baiTap79() {
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > Math.abs(a[i + 1])) {
				System.out.print(a[i]);
			}
		}
	}

	public void baiTap80() {
		for (int i = 1; i < n - 1; i++) {
			if (a[i] < Math.abs(a[i + 1]) && a[i] > Math.abs(a[i - 1])) {
				System.out.print(a[i]);
			}
		}
	}

	public void baiTap81() {
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0 && (a[i - 1] % 2 == 0 || a[i + 1] % 2 == 0)) {

				System.out.print(a[i] + " ");
			}
		}
	}

	public void baiTap82() {
		// kiem dau tien va thu 1
		if (a[0] * a[1] < 0) {
			System.out.print(a[0]);
		}
		for (int i = 1; i < n - 1; i++) {
			if ((a[i] * a[i - 1]) < 0 || (a[i] * a[i + 1]) < 0) {
				System.out.print(a[i] + "  ");

			}
		}
		if (a[n - 2] * a[n - 1] < 0) {
			System.out.print(a[n - 1]);
		}

	}

	public int baiTap83a() {
		int max = a[0];
		for (int i = 1; i < n; i++) {
			if (max < a[i]) {
				max = a[i];

			}

		}
		return max;
	}

	public int baiTap83() {
		int max = baiTap83a();
		for (int i = 0; i < n; i++) {
			if (max == a[i]) {
				return i;
			}
		}
		return 0;

	}

	public void baiTap84a() {
		System.out.print("vi tri cac so nguyen to");
		for (int i = 0; i < n; i++) {
			if (btcb.baiTap31(a[i]) == 1) {
				System.out.print("  " + i);
			}
		}
	}

	public int baiTap88a(int n) {
		int dt = 0;
		while (n > 0) {
			dt = n % 10;
			n = n / 10;
		}
		if (dt % 2 == 0) {
			return 1;
		}
		return 0;
	}

	public void baiTap88() {
		for (int i = 0; i < n; i++) {
			if (baiTap88a(a[i]) == 0) {
				System.out.print(i + "  ");
			}
		}

	}

	public void baiTap95(int b, int c) {
		for (int i = 0; i < n; i++) {
			if (a[i] >= b && a[i] <= c) {
				System.out.print(a[i] + "  ");
			}

		}
	}

	public int baiTap97() {
		int s = 0;
		for (int i = 0; i < n; i++) {
			s = s + a[i];

		}
		return s;
	}

	public int baiTap98() {
		int s = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {
				s = s + a[i];

			}
		}
		return s;
	}

	public int baiTap99() {
		int s = 0;
		for (int i = 0; i < n; i++) {
			if (baiTap88a(a[i]) == 0) {
				s = s + a[i];
			}
		}
		return s;

	}

	public int baiTap101() {
		// for 1-n;
		// if(ai > ai-1;
		// s+=ai;

		int s = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] > a[i - 1]) {
				s = s + a[i];
			}

		}
		return s;
	}

	public int baiTap105() {
		int s = 0;
		for (int i = 0; i < n; i++) {
			if (btcb.baiTap32(a[i]) == 1) {
				s = s + a[i];
			}
		}
		return s;
	}

	public int baiTap106() {
		int s = 0;
		for (int i = 0; i < n; i++) {
			if (baiTap88a(a[i]) == 1) {
				s = s + a[i];

			}
		}
		return s;

	}

	public void baiTap107() {
		int idem = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				idem++;
			}

		}
		System.out.println("\nso luong gia tri chan trong mang:" + idem);
	}

	public void baiTap108() {
		int idem = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 7 == 0 && a[i] > 0) {
				idem++;
			}

		}
		System.out.println("\nso duong chia het cho 7 :" + idem);
	}

	public void baiTap109(int X) {
		int idem = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == X) {
				idem++;
			}
		}
		System.out.println("so lan xua hien gia tri" + X + "trong mang la"
				+ idem);
	}

	public void baiTap110() {
		int idem = 0;
		for (int i = 0; i < n; i++) {
			int b = a[i] % 10;
			if (b == 5) {
				idem++;
			}
		}
		System.out.println("\nso luong cac gia tri tan cung bang 5: " + " "
				+ idem);
	}

	public int baiTap111() {
		int chan = 0;
		int le = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				chan++;
			} else {
				le++;
			}
		}
		if (chan > le) {
			return -1;
		}
		if (chan == le) {
			return 0;
		}
		if (chan < le) {
			return 1;
		}
		return 2;
	}

	/**
	 * public int baiTap112a() { int idem=0; int max=a[0]; for(int
	 * i=0;i<n-1;i++){ if(max<a[i]){ max=a[i];
	 * 
	 * } } return max;
	 * 
	 * }
	 **/

	public void baiTap113() {
		int idem = 0;
		for (int i = 0; i < n; i++) {
			if (btcb.baiTap31(a[i]) == 1) {
				idem++;

			}
		}
		System.out.println("so luong gia tri cac so nguyen to" + idem);
	}

	public int baiTap114() {
		int idem = 0;
		for (int i = 0; i < n; i++) {
			if (btcb.baiTap30(a[i]) == 1) {
				idem++;
			}
		}
		return idem;
	}

	public int baiTap116() {
		int idem = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0 && (a[i - 1] % 2 == 0 || a[i - 1] % 2 == 0)) {
				idem++;
			}
		}
		return idem;

	}

	public int baiTap117() {
		int idem1 = 0;
		int idem2 = 0;
		int idem3 = 0;
		int idem = 0;
		if (a[0] * a[1] < 0) {
			idem1++;
		}
		if (a[n - 2] * a[n - 1] < 0) {
			idem3++;
		}
		for (int i = 1; i < n - 1; i++) {
			if (a[i] * a[i - 1] < 0 || a[i] * a[i + 1] < 0) {
				idem2++;
			}

		}
		idem = idem1 + idem2 + idem3;
		return idem;

	}

	public int baiTap118() {
		int idem = 0;
		for (int i = 1; i < n - 1; i++) {
			if (a[i - 1] * a[i + 1] > 0 && Math.abs(a[i]) > Math.abs(a[i - 1])
					&& Math.abs(a[i]) > Math.abs(a[i + 1])) {
				idem++;
			}

		}
		return idem;
	}

	public int baiTap119() {
		for (int i = 0; i < n; i++) {
			if (a[i] == 100) {
				return 1;
			}
		}
		return 0;

	}

	public int baiTap120() {
		for (int i = 1; i < n; i++) {
			if (a[i] == (a[i - 1] + 1)) {
				return 1;
			}
		}
		return 0;

	}

	public int baiTap121() {
		for (int i = 1; i < n; i++) {
			if (a[i] % 2 == 0) {
				return 1;
			}
		}
		return 0;

	}

	public int baiTap122() {
		int idem = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				idem++;
			}
		}
		if (idem == 2) {
			return 1;
		} else {
			return 0;
		}

	}

	public int baiTap123() {
		for (int i = 1; i < n; i++) {
			if (btcb.baiTap30(a[i]) == 1) {
				if (a[i] < 256) {
					return 1;
				}
			}

		}
		return 0;
	}

	public int baiTap124() {
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 != 0) {

				return 0;

			}

		}
		return 1;
	}

	public int baiTap125() {
		for (int i = 1; i < n - 1; i++) {
			if (a[i - 1] * a[i + 1] < 0
					&& Math.abs(a[i - 1]) == Math.abs(a[i + 1])) {

				return 1;

			}

		}
		return 0;
	}

	public int baiTap126() {
		for (int i = 0; i < n - 1; i++) {
			if (a[i] > a[i + 1]) {
				return 0;
			}

		}
		return 1;
	}

	public int baiTap127() {
		for (int i = 1; i < n; i++) {
			if (a[i - 1] < a[i]) {
				return 0;
			}

		}
		return 1;
	}

	public int baiTap128() {
		for (int i = 1; i < n; i++) {
			if (a[i - 1] != a[i]) {
				return 0;
			}

		}
		return 1;
	}

	public int baiTap129() {
		for (int i = 1; i < n - 1; i++) {
			if ((Math.abs(a[i]) > Math.abs(a[i - 1]) && Math.abs(a[i]) > Math
					.abs(a[i + 1]))
					|| (Math.abs(a[i]) < Math.abs(a[i - 1]) && Math.abs(a[i]) < Math
							.abs(a[i + 1]))) {

				return 1;

			}

		}
		return 0;
	}

	// 874589
	public void baiTap130() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public void baiTap131() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public void baiTap132() {
		for (int i = 1; i < n - 1; i = i + 2) {
			for (int j = i + 2; j < n; j = j + 2) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public void baiTap133() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (btcb.baiTap31(a[i]) == 1 && btcb.baiTap31(a[j]) == 1) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
	}

	public void baiTap134() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (btcb.baiTap30(a[i]) == 1 && btcb.baiTap30(a[j]) == 1) {
					if (a[i] < a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;

					}

				}
			}
		}
	}

	public void baiTap135() {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > 0 && a[j] > 0) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
	}

	public void baiTap136() {
		for (int i = 0; i < n - 1; i = i + 1) {
			for (int j = i + 1; j < n; j = j + 1) {
				if (a[i] % 2 == 0 && a[j] % 2 == 0) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
				if (a[i] % 2 != 0 && a[j] % 2 != 0) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}

			}

		}
	}

	public void baiTap137() {
		for (int i = 0; i < n - 1; i = i + 1) {
			for (int j = i + 1; j < n; j = j + 1) {
				if (a[i] > 0 && a[j] > 0) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
				if (a[i] < 0 && a[j] < 0) {
					if (a[i] < a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}

			}

		}
	}

	
	
	
	public void baiTap138(int x, int k){
		int b[]= new int[n];
		for(int i=0;i<n;i++){
			b[i]=a[i];
			
		}
          a= new int[n+1];
          for(int i=0;i<k;i++){
        	  a[i]=b[i];
          }
          a[k]=x;
          for(int i=k+1;i<=n;i++){
        	  a[i]=b[i-1];
          }
	n++;
	}

	//
	public int baiTap139a(int x) {

		for (int i = 0; i < n - 1; i++) {
			if (a[i] > x) {
				return i;
			}
		}
		return n - 1;
	}

	/**
	 * public int baiTapDemoa(){ int idem=0; for(int i=0;i<n;i++){ if(n%i==0){
	 * idem++;
	 * 
	 * }if(idem==2){ return 1; } } return 0; } public int baiTapDemob(){ for(int
	 * i=0;i<n;i++){ if(baiTapDemoa(a[i])==1){
	 * 
	 * } } } public int baiTapDemo(){ int max=baiTapDemoa(a[i]==1); for(int
	 * i=0;i<n;i++){ if(max<a[i] && baiTapDemoa(a[i])==1){ max=a[i]; } } }
	 * 
	 * /**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		MangMotChieu mmc = new MangMotChieu();
		mmc.nhap();
		System.out.println("mang vua nhap");
		mmc.xuat();
		/**
		 * System.out.println("\ncac so chan trong mang"); mmc.bai50();
		 * System.out.println("\n vi tri so le trong mang"); mmc.baitap51();
		 * 
		 * int kq = mmc.baitap52(); System.out.println("\n Gia tri max: " + kq);
		 * 
		 * // System.out.println("\n vi tri cua so nho nhat: " + kq); //
		 * mmc.baiTap54();
		 * 
		 * int kq53 = mmc.baiTap53();
		 * System.out.println("\n gia tri chan cuoi cung trong mang: " + kq53);
		 * 
		 * int kq56 = mmc.baiTap56();
		 * System.out.println("\n gia tri chan dau tien  trong mang: " + kq56);
		 * 
		 * int kq54 = mmc.baiTap54();
		 * System.out.println("\n vi tri so nho nhat: " + kq54);
		 **/

		// int kq57=mmc.baiTap57();
		// System.out.println("\n 57 :   "+kq57);

		// int kq58 = mmc.baiTap58();
		// System.out.println("\n gia tri duong nho nhat trong mang: " + kq58);

		// int kq59 = mmc.baiTap59();
		// System.out.print(" so chan dau tien" + kq59);

		// int kq60 = mmc.baiTap60();
		// System.out.println("\n so nguyen to dau tien " + kq60);

		// int kq61= mmc.baiTap61();
		// System.out.print("\n so hoan thien dau tien    " + kq61);

		// int kq62= mmc.baiTap62();
		// System.out.print("\n gia tri am dau tien: " +kq62);

		// int kq63 = mmc.baiTap63();
		// System.out.println("\n so nguyen to lon nhat: " + kq63);

		// int kq64 = mmc.baiTap64();
		// System.out.print("so hoan thien nho nhat " + kq64);

		// int kq65 = mmc.baiTap65();
		// System.out.print("gia tri chan nho nhat  " + kq65);

		// int kq66 = mmc.baiTap66();
		// System.out.print("\nGia tri am lon nhat trong mang" + kq66);

		// int kq67=mmc.baiTap67();
		// System.out.print("\n Gia tri dau tien lon hon 2015 :  "+kq67);

		// int kq69=mmc.baiTap69();
		// System.out.print("Vi tri thoa man" +kq69);

		// int kq70= mmc.baiTap70();
		// System.out.print("So chinh phuong dau tien trong mang so nguyen :"+kq70);

		// int kq68 = mmc.baiTap68(5,10);
		// System.out.println("\n so thoai man: " + kq68);

		// System.out.print("gia tri chan trong mang so nguyen :");
		// mmc.baiTap78(8, 26);

		// System.out.println("\n  gia tri thoai man gia tri  " );
		// mmc.baiTap79();

		// System.out.println("\n  gia tri thoai man gia tri  ");
		// mmc.baiTap80();

		// System.out.print("\ngia tri chan co it nhat mot vung lan can cung la chan: "+" ");
		// mmc.baiTap81();

		// System.out.print("\ngia tri co it nhat mot lan can trai dau :" +" ");
		// mmc.baiTap82();
		// int kq83=mmc.baiTap83();
		// System.out.print("\n vi tri max :"+" "+kq83);

		// mmc.baiTap84a();
		// System.out.println("ca chu so co chu so dau tien la le"+" ");
		// mmc.baiTap88();
		// System.out.println("");
		// mmc.baiTap95(5,15);
		// int kq97= mmc.baiTap97();
		// System.out.println(" tong ca chu so "+kq97);

		// System.out.println("\ntong ca gt duong trong mang ");
		// mmc.baiTap98();

		// int kq99= mmc.baiTap99();
		// System.out.println(" tong cac chu so co chu so du tien la le "+kq99);

		// int kq101 = mmc.baiTap101();
		// System.out.println(" tong cac gia tri lon ho gt lien truoc no " +
		// kq101);

		// int kq105 = mmc.baiTap105();
		// System.out.println(" tong cac gia tri so chinh phuong " + kq105);

		// int kq106=mmc.baiTap106();
		// System.out.println("tong cac gia tri co chu so dau tien la chan:"+kq106);

		// mmc.baiTap107();
		// System.out.println("");

		// mmc.baiTap109(2);

		// mmc.baiTap110();

		// int kq111= mmc.baiTap111();
		// System.out.println("   "+kq111);

		// mmc.baiTap112();

		// .baiTap113();

		// int kq114= mmc.baiTap114();
		// System.out.println("\nso luong cac gia tri hoan thien trong mang"
		// +kq114);

		// int kq116=mmc.baiTap116();
		// System.out.println(""+kq116);

		// int kq117=mmc.baiTap117();
		// System.out.println("so luong cac gia tri ke nhau ma ca hai deu trai dau"+kq117);

		// int kq118= mmc.baiTap118();
		// System.out.println("so luong thoa man de bai"+kq118);

		// int kq119 = mmc.baiTap119();
		// System.out.println("\n" + kq119);

		// int kq120 = mmc.baiTap120();
		// System.out.println("\n" + kq120);

		// int kq121 = mmc.baiTap121();
		// System.out.println("\n" + kq121);

		// int kq122 = mmc.baiTap122();
		// System.out.println("\n" + kq122);

		// int kq123 = mmc.baiTap123();
		// System.out.println("\n" + kq123);
		// int kq124 = mmc.baiTap124();
		// System.out.println("\n" + kq124);

		// int kq125= mmc.baiTap125();
		// System.out.print(" \n"+kq125);

		// kq126= mmc.baiTap126();
		// System.out.print(" \n"+kq126);

		// int kq127 = mmc.baiTap127();
		// System.out.print(" \n" + kq127);

		// int kq128 = mmc.baiTap128();
		// System.out.print(" \n" + kq128);

		// int kq129 = mmc.baiTap129();
		// System.out.print(" \n" + kq129);
		 mmc.baiTap130();
		 System.out.println("sap xep mang sau khi xep tang ");
		 mmc.xuat();

		// mmc.baiTap131();
		// System.out.println("sap xep mang sau khi xep giam ");
		// mmc.xuat();
		// mmc.baiTap132();
		// System.out.println("sap xep gia tri tai vi tri le tang dan");
		// mmc.xuat();

		// mmc.baiTap133();
		// System.out.println("ca gia tri so nguyen to tang dan :");
		// mmc.xuat();

		// mmc.baiTap134();
		// System.out.println("gia tri cac so hoan thien giam dan :");
		// mmc.xuat();

		// mmc.baiTap135();
		// System.out.println("cac gia tri duong sap xep tang dan :");
		// mmc.xuat();
		// mmc.baiTap136();
		// System.out.println("ca gia tri so Chan tang dan va gt so Le tang dan :");
		// mmc.xuat();

//		mmc.baiTap137();
//		 System.out.println("ca gia tri so Duong tang dan va gt  Am  giam dan :");
//		 mmc.xuat();

		///mmc.baiTap138(3, 2); 
		//System.out.println("thoa mam de bai");
		//mmc.xuat();

		// int kq139=mmc.baiTap139a(8);
		// System.out.println("thoa mam de bai"+kq139);

	}

}
