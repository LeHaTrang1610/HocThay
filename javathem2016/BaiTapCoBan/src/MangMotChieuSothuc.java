/**
 * 
 */

import java.util.Scanner;

/**
 * @author Hi
 *
 */
public class MangMotChieuSothuc {
	
	double a[];
	int n;
	
	
	public void nhap(){
		Scanner reader= new Scanner(System.in);
		System.out.print("Nhap so luong phan tu :");
		n= reader.nextInt();
		a=new double[n];
		for(int i=0;i<n;i++){
			System.out.println("Nhap phan tu a["+i+"]");
			a[i]= reader.nextDouble();
		}
	}
	
	
	public void xuat(){
		for(int i=0;i<n;i++){
			System.out.print( a[i]+"   ");
		}
	}
	
	
	public double baitap73(){
		for(int i=0;i<n;i++){
			if(a[i]>0){
				return a[i];
			}
		}return -1;
	}
	
	public double baiTap74(){
		double min=a[0];
		for(int i=0;i<n;i++){
			if(min>a[i]){
				min=a[i];
			}
		}return min;
	}
	
	
	public double baiTap75a(){
		for(int i=0;i<n;i++){
			if(a[i]>0){
				return a[i];
			}
		}return -1;
	}
	
	public double baiTap75(){
		double min=baiTap75a();
		for(int i=0;i<n;i++){
			if(min>a[i]&& a[i]>0){
				min=a[i];
			}
		}return min;
	}
	
	
public double baiTap76(){
	for(int i=n-1;i>=0;i--){
		if(a[i]>0){
			return a[i];
		}
	}return -1;
}


public double baiTap77a(){
	for(int i=0;i<n;i++){
		if(a[i]<0){
			return a[i];
		}
	}return 1;
}


public double baiTap77(){
	
	double max=baiTap77a();
	for(int i=0;i<n;i++){
		if(max<a[i]&&a[i]<0){
			max=a[i];
		}
	}return max;
}

public void baiTap95(int b,int c){
	for(int i=0;i<n;i++){
		if(a[i]>=b&&a[i]<=c){
			System.out.print(a[i]+"  ");
		}
	}
}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MangMotChieuSothuc mmcst= new MangMotChieuSothuc();
		mmcst.nhap();
		System.out.print("\n  mang vua nhap ");
		mmcst.xuat();
		
		
		//double kq73=mmcst.baitap73();
		//System.out.print("\ngia tri duong dau tien "+kq73);
		
		
		//double kq74=mmcst.baiTap74();
		//System.out.print("\nGia tri nho nhat trong mang so thuc" +kq74);
		
		//double kq75=mmcst.baiTap75();
		//System.out.print("gia tri duong nho nha trong mang la" +kq75);
		
		//double kq76=mmcst.baiTap76();
		//System.out.print("Gia tri duong cuoi cung"+kq76);
		
		
		double kq77= mmcst.baiTap77();
		//System.out.print("\n Gia tri am lon nhat" +kq77);
		System.out.println("gia tri thoa man");
		mmcst.baiTap95(5,15);
	}

}
