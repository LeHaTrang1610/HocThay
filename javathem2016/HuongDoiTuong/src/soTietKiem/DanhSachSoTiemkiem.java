/**
 * 
 */
package soTietKiem;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author USER
 * 
 */
public class DanhSachSoTiemkiem {
	private DecimalFormat df = new DecimalFormat(".##");
	/**
	 * @param args
	 */
	List<SoTietKiem> danhsachsoTietKiem = new ArrayList<SoTietKiem>();
	

	public void nhap() {
		Scanner reader = new Scanner(System.in);
		System.out.println(" nhap so luong so tiet kiem:");
		int soluong = reader.nextInt();

		for (int i = 0; i < soluong; i++) {
			System.out.println(" cho loai so: 0: Khong co ky han"
					+ " 1: co ky han ");
			int a = reader.nextInt();

			switch (a) {
			case 1:
				CoKyHan kq = new CoKyHan();
				kq.nhap();
				danhsachsoTietKiem.add(kq);
				break;

			case 0:
				KhongKyHan kq2 = new KhongKyHan();
				kq2.nhap();
				danhsachsoTietKiem.add(kq2);
				break;

			default:
				break;

			}

		}

	}

	public void xuat() {
		for (int i = 0; i < danhsachsoTietKiem.size(); i++) {
			danhsachsoTietKiem.get(i).xuat();
			System.out.println(" tien lai cua so :"
					+ df.format(danhsachsoTietKiem.get(i).tinhTienLai()));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachSoTiemkiem ds = new DanhSachSoTiemkiem();
		ds.nhap();
		ds.xuat();

	}

}
