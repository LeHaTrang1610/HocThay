/**
 * 
 */

import java.util.Scanner;

/**
 * @author USER
 * 
 */
public class MangSoThuc {

	int  m;
	int n;
	double [][] a;

	public void nhap() {
		Scanner reader = new Scanner(System.in);
		System.out.print("nhap so luong dong cua matran: ");
		m = reader.nextInt();
		System.out.print("nhap so luong cot cua matran: ");
		n = reader.nextInt();
		a= new double[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("nhap phan tu thu a[" + i + "][" + j + "]: " +" ");
				a[i][j] = reader.nextDouble();

			}
		}
	}

	public void xuat() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print( a[i][j]+"   ");
			}
			System.out.println();
		}
	}
	
	public int baiTap166(){
		int idem=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++ ){
				if(a[i][j]>0){
					idem++;
				}
			}
		}
		return idem;
	}
	
	public int baiTap167(double x){
		int idem=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++ ){
				if(a[i][j]==x){
					idem++;
				}
			}
		}
		return idem;
	}
	
	public int baiTap168(int d){
		int idem=0;
		for(int i=0;i<m;i++){
				if(a[i][d]<0){
					idem++;
				}
		}
		return idem;
	}
	
	public double baiTap169a(){
		double min= a[0][0];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++ ){
				if(a[i][j]<min){
					a[i][j]=min;
				}
			}
		}
		return min;
	}
	public int baiTap169b(){
		int idem=0;
		double min=baiTap169a();
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++ ){
				if(a[i][j]==min){
					idem++;
				}
			}
		}
		return idem;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MangSoThuc mst = new MangSoThuc();
		mst.nhap();
		mst.xuat();
		//int c= mst.baiTap166();
		//System.out.println("luong so duong trong ma tran :"+c);
		//int c= mst.baiTap167(5);
		//System.out.println("luong so xua hien  trong ma tran :"+c);
		//int c= mst.baiTap168(2);
		//System.out.println("luong so am tren 1 cot  trong ma tran :"+c);
		int c= mst.baiTap169b();
		System.out.println("so luong gia tri nho nhat  trong ma tran :"+c);
	
	}
	
	

}
