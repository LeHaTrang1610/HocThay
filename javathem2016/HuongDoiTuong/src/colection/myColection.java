package colection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class myColection {

	List<Integer> numbers = new ArrayList<Integer>();

	// integer number[] = new Integer[];

	public void nhapMang() {
		Scanner reader = new Scanner(System.in);
		System.out.println("nhap so luong phan tu");
		int n = reader.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("nhap lan " + i + ":");
			int so = reader.nextInt();
			numbers.add(so);
		}
	}

	public void xuat() {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
	}

	public int tong() {
		int s = 0;
		for (int i = 0; i < numbers.size(); i++) {
			s = s + numbers.get(i);

		}
		return s;
	}
	
	public int max(){
		int max=numbers.get(0);
		for( int i=0;i<numbers.size();i++){
			if(numbers.get(i)>max){
				max=numbers.get(i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		myColection num = new myColection();
		num.nhapMang();
		num.xuat();
		int tong= num.tong();
		System.out.println(" tong:"+tong);
		int max=num.max();
		System.out.println("max:"+max);
	}
}
