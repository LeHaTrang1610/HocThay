import java.util.Scanner;

/**
 * 
 */

/**
 * @author USER
 * 
 */
public class tichHaiMaTran {

	/**
	 * @param args
	 */

	public void nhap(int a[][], int m, int n) {
		Scanner reader = new Scanner(System.in);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(" nhap phan tu thu a[" + i + "]");
				a[i][j] = reader.nextInt();

			}
		}
	}

	public void xuat(int a[][], int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();

		}
	}
	 public int[][] tich(int a[][], int n1, int m1, int b[][], int n2, int m2){
		 //tam thoi minh lam tren ma tran vuong , // thuong
		 int c[][] = new int [m1][n2]; // tao ma tran tich de chua ket qua
		 if(n1!=m2){
			 return c;
		 }
		 for(int i = 0; i< m1; i++){
			for(int j = 0; j< n2; j++){
				//hai dong for nay la de duyet ma tran binh thuong
				c[i][j] = 0; // cho nay la, chut chi giai thich cho em sau
				for(int k = 0 ; k < n1; k++){
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		 }
		 return c;
	 }
	 // a : 1  2 
	 //		3  4
	 // b : 3  4
	 //		5  6 
	 // c : 13 16
	 //		29  36 
	 // i = 0 , j = 0 ; k = 0 --> c00 = c00 (0) + a00 (1) * b00(3) -> c00 = 3
	 // 				1 -> c00 = c00(3) + a01(2) * b10(5) --> c00 = 13
	 //i=0    ,j=1    ;k=0  -->  c01=c01(0)+a00(1)*b01(4)=4;
	 //i=0     j=1     k=1 -->   c01=c01(4)+a01(2)*b11(6)=16;
	 //i=1   ,j =0    ;k=0 --> c10=c10(0)+a10(3)*b00(3)=9;
	//i=1   ,j =0    ;k=1 --> c10=c10(9)+a11(4)*b10(5)=29;
	//i=1   ,j =1    ;k=0 --> c11=c11(0)+a10(3)*b01(4)=12;
	//i=1   ,j =1    ;k=1 --> c11=c11(12)+a11(4)*b11(6)=36;
	 
	 
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tichHaiMaTran thmt = new tichHaiMaTran();
		Scanner reader = new Scanner(System.in);
		System.out.println(" nhap so luong dong cho ma tran thu nhat:");
		int m1 = reader.nextInt();
		System.out.println(" nhap so luong cot cho ma tran thu nhat");
		int n1 = reader.nextInt();
		int a1[][] = new int[m1][n1];
		thmt.nhap(a1, m1, n1);
		thmt.xuat(a1, m1, n1);

		System.out.println(" nhap so luong dong cho ma tran thu hai:");
		int m2 = reader.nextInt();
		System.out.println(" nhap so luong cot cho ma tran thu hai");
		int n2 = reader.nextInt();
		int a2[][] = new int[m2][n2];
		thmt.nhap(a2, m2, n2);
		thmt.xuat(a2, m2, n2);
		
		int c[][]= thmt.tich(a1, n1, m1, a2, n2, m2);
		thmt.xuat(c, m1, n2);
		
		
	

	}

}
