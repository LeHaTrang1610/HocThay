/**
 * 
 */
package vatNuoi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author USER
 * 
 */
public class DanhSachDongVat {

	List<InterFace> DanhSacDongVat = new ArrayList<InterFace>();

	public void nhap() {
		Scanner reader = new Scanner(System.in);
		System.out.println("nhap so luong dong vat");
		int soLuong = reader.nextInt();
		for (int i = 0; i < soLuong; i++) {
			System.out.println(" chon loai dong vat: chuot-0,cho-1 ,meo-2");
			int loai = reader.nextInt();
			switch (loai) {
			case 0:
				ChuotHamster chuot = new ChuotHamster();
				chuot.nhap();
				DanhSacDongVat.add(chuot);
				break;
			case 1:
				Cho cho = new Cho();
				cho.nhap();
				DanhSacDongVat.add(cho);
				break;
			case 2:
				Meo meo = new Meo();
				meo.nhap();
				DanhSacDongVat.add(meo);
				break;
			default:
				break;
			}
		}
	}

	public void xuat() {
		for (int i = 0; i < DanhSacDongVat.size(); i++) {
			DanhSacDongVat.get(i).xuat();
			System.out.println("tien an:" + DanhSacDongVat.get(i).tinhTienAn());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachDongVat ds = new DanhSachDongVat();
		ds.nhap();
		ds.xuat();
	}

}
