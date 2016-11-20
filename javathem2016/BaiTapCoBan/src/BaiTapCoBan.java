

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class BaiTapCoBan {
	// n = 4
	// 1+2+3+4 = 10;
	int tinhTong(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) { // i=1; i=4; i++ -> i=i+1;
			s += i;
		}
		return s;
	}

	/**
	 * n=4; s=0; i=1; 1<=4 -> s = s+1; s= 1; i=2; 2<=4 -> s = s+2; s = 3; i=3;
	 * 3<=4; ->s+= 3 -> s=6; i=4; 4<=4; s+=4 -> s = 10; i=5; 5<=4; false; return
	 * s = 10;
	 * 
	 * @param agrs
	 */

	int baiTap02(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + i * i;
		}
		return s;
	}

	double baiTap03(int n) {
		double s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + (double) 1 / i;
		}
		return s;
	}

	double baiTap04(int n) {
		double s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + (double) 1 / (2 * i);
		}
		return s;
	}

	double baiTap05(int n) {
		double s = 1;
		for (int i = 1; i <= n; i++) {
			s = s + (double) 1 / (2 * i + 1);
		}
		return s;
	}

	double baiTap06(int n) {
		double s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + (double) 1 / (i * (i + 1));
		}
		return s;
	}

	double baiTap07(int n) {
		double s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + (double) i / (i + 1);
		}
		return s;
	}

	double baiTap08(int n) {
		double s = 0;
		for (int i = 0; i <= n; i++) {
			s = s + (double) (2 * i + 1) / (2 * i + 2);
		}
		return s;
	}

	int baiTap09(int n) {
		int m = 1;
		for (int i = 1; i <= n; i++) {
			m = m * i;

		}
		return m;
	}

	int baiTap10(int x, int n) {
		int s = 0;
		s = (int) Math.pow(x, n);
		return s;
	}

	int baiTap11(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + baiTap09(i);
		}
		return s;
	}

	int baiTap12(int x, int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + baiTap10(x, i);
		}
		return s;
	}

	int baiTap13(int x, int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s = s + baiTap10(x, 2 * i);
		}
		return s;
	}

	void baiTap20(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i);
			}

		}
	}

	int baiTap21(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				s = s + i;

			}
		}
		return s;
	}

	int baiTap22(int n) {
		int s = 1;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				s = s * i;

			}

		}
		return s;
	}

	int baiTap23(int n) {
		int idem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				idem++;

			}

		}
		return idem;
	}

	int baiTap24(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i % 2 != 0) {
				System.out.print(i);
			}
		}
		return n;
	}

	int baiTap25_01(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i % 2 != 0) {
				s = s + i;

			}
		}
		return s;
	}

	int baiTap26(int n) {
		int s = 1;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i % 2 != 0) {
				s = s * i;

			}
		}
		return s;
	}

	int baiTap27(int n) {
		int idem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && i % 2 == 0) {
				idem++;

			}
		}
		return idem;
	}

	int baiTap28(int n) {
		int s = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				s = s + i;
			}

		}
		return s;

	}

	int baiTap29(int n) {
		for (int i = n; i >= 0; i--) {
			if (n % i == 0 && i % 2 != 0) {
				return i;

			}
		}
		return 1;
	}

	int baiTap30(int n) {
		int s = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				s = s + i;

			}

		}
		if (n == s) {
			return 1;
		} else {
			return 0;
		}

	}

	int baiTap31(int n) {
		int idem = 0;
		for (int i = 1; i <= n; i++) {
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

	int baiTap32(int n) {
		int s = 0;
		for (int i = 1; i <= n; i++) {
			if (i * i == n) {
				return 1;
			}
		}
		return 0;
	}

	int baiTap36(int n) {
		int dem = 0;
		while (n > 0) {
			n = n / 10;
			dem++;
		}
		return dem;

	}

	int baiTap37(int n) {
		int s = 0;
		while (n > 0) {
			int du = n % 10;
			s += du;
			n = n / 10;
		}
		return s;

	}

	int baiTap38(int n) {
		int s = 1;
		while (n > 0) {
			int du = n % 10;
			s = s * du;
			n = n / 10;
		}
		return s;
	}

	int baiTap39(int n) {
		int sole = 0;
		while (n > 0) {
			int du = n % 10;
			if (du % 2 != 0) {
				sole++;
			}
			n = n / 10;
		}
		return sole;

	}

	int baiTap40(int n) {
		int S = 0;
		while (n > 0) {
			int du = n % 10;
			if (du % 2 != 0) {
				S = S + du;
			}
			n = n / 10;

		}
		return S;
	}

	int baiTap41(int n) {
		int s = 1;
		while (n > 0) {
			int du = n % 10;
			if (n % 2 == 0) {
				s = s * du;
			}
			n = n / 10;
		}
		return s;
	}

	int baiTap42(int n) {
		int du = 0;
		while (n > 0) {
			du = n % 10;
			n = n / 10;
		}
		return du;
	}

	int baiTap43(int n) {
		int du = 0;
		while (n > 0) {
			du = n % 10;
			if (du % 2 == 0) {
				return 0;

			}
			n = n / 10;
		}
		return 1;
	}

	int baiTap44(int n) {
		int du = 0;
		while (n > 0) {
			 du = n % 10;
			 if(du%2!=0){
				 return 0;
			 }
			n=n/10;
			
		}
		return 1;
	}
	
	
	int baiTap45(int n) {
		//n=23579;
		int du1 = n%10; //du1 = 9;
		n=n/10; //n=2357;
		while (n > 0) {
			 int du2 = n % 10; //du2=7;
			 if(du1 < du2 ){
				 return 0;
			 }
			 du1 = du2; //du1 = 7;
			n=n/10;
		}
		return 1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	void baiTap47(double a,double b){
		double c=0;
		if(a==0&& b!=0){
			System.out.print("Phuong trinh vo nghiem");
		}if(a==0&& b==0){
			System.out.print("Phuong trinh vo  so nghiem");
		}if(a!=0){
			c= -b/a;
			System.out.print(c);
		}
	}
	
	void baiTap48(int a,int b,int c){
		double e=b*b-(4*a*c);
		double g=0;
		if(a!=0){
			if(e<0){
				System.out.print("Phuong trinh vo nghiem");
			}if(e==0){
				System.out.print("phuong trinh co nghiem kep x1=x2=" +-b/(2*a));
				
			}if(e>0){
				System.out.print("phuong trinh co nghiem phan biet x1=" +(-b+ Math.sqrt(e))/(2*a)
						 +"va x2="+(-b- Math.sqrt(e))/(2*a));
			}
		}if(a==0){
			if(b==0&& c!=0){
				System.out.print("Phuong trinh vo nghiem");
			}if(b==0&& c==0){
				System.out.print("Phuong trinh vo  so nghiem");
			}if(b!=0){
				g= -c/b;
				System.out.print(g);
			}
		}
	}
	
	int baiTapDemo(int n) {
		int du = 0;
		while (n > 0) {
			 du = n % 10;
			 if(du%2!=0){
				 return 0;
			 }
			n=n/10;
			
		}
		return 1;
	}
	
	int baiTap46(int n) {
		int du = 0;
		while (n > 0) {
			du = n % 10;
			n = n / 10;
		}
		return du;
	}
	
	

	public static void main(String[] agrs) {
		BaiTapCoBan btcb = new BaiTapCoBan();
		// int kq = btcb.tinhTong(4);
		// System.out.println(kq);
		// int kq24=btcb.baiTap24(6);
		// btcb.baiTap48(0,0,5);
		 int kq = btcb.baiTap46(48);
		System.out.println(kq);

	}
}
