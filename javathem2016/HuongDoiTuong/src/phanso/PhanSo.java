/**
 * 
 */
package phanso;

import java.util.Scanner;

/**
 * @author USER
 * 
 */
public class PhanSo {

	// thuoc tinh; getter and setter;
	private int tu;
	private int mau;

	public int getTu() {
		return this.tu;
	}

	public int getMau() {
		return this.mau;
	}

	public void setTu(int tu) {
		this.tu = tu;
	}

	public void setMau(int mau) {
		this.mau = mau;
	}

	// ham khoi tao = ham dung = contructor : public, cung ten class va ko co
	// gia tri tra ve
	// 3 loai
	// loai 1 : mac dinh
	public PhanSo() {
		this.tu = 5;
		this.mau = 10;
	}

	// loai thu 2 : thuong use nhat
	public PhanSo(int tuSo, int mauSo) {
		this.tu = tuSo;
		this.mau = mauSo;
	}

	// loai 3
	public PhanSo(PhanSo a) {
		this.tu = a.tu;// ps3.tu = ps2.tu;
		this.mau = a.mau;

	}

	// phuong thuc khac
	// ham xuat
	public void xuatPhanSo() {
		System.out.println(this.tu + "/" + this.mau);
	}

	public void nhapPhanSo() {
		Scanner reader = new Scanner(System.in);
		System.out.println(" nhap tu so cua phan so:");
		this.tu = reader.nextInt();
		System.out.println(" nhap mau so cua phan so:");
		this.mau = reader.nextInt();
	}

	public PhanSo nhanHaiPhanSo(PhanSo a) {
		PhanSo c = new PhanSo();
		c.tu = a.tu * tu;
		c.mau = a.mau * mau;
		return c;
	}

	// cong hai phan so.vs nhan hai phan so

	public PhanSo congHaiPhanSo(PhanSo a) {
		PhanSo d = new PhanSo();
		d.tu = (tu * a.mau) + (mau * a.tu);
		d.mau = mau * a.mau;
		return d;
	}

	public int soSanh(PhanSo a) {

		//1/2 = 0;
		float a1 = (float) tu/mau;
		float a2=(float) a.tu / a.mau;
		if (a1 > a2) {
			return 1;
		}
		if (a1 == a2) {
			return 0;
		}
		return -1;
	}

}
// a > b => 1; a<b => -1
// a=b =>0;

