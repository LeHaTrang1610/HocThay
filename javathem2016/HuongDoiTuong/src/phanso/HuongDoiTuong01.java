package phanso;

import java.io.ObjectInputStream.GetField;

/**
 * 
 */

/**
 * @author USER
 * 
 */
public class HuongDoiTuong01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//PhanSo a = new PhanSo(); //khai bao;
		//a.xuatPhanSo();
		// TODO Auto-generated method stub
		/*
		 * int a = 10; PhanSo ps1 = new PhanSo();// loai1 PhanSo ps2 = new
		 * PhanSo(1, 2);// loai2 PhanSo ps3 = new PhanSo(ps2); //
		 * ps1.nhapPhanSo(); // ps2.nhapPhanSo(); ps1.nhapPhanSo(); // ps3 =
		 * ps1.nhanHaiPhanSo(ps2);// ps1 * ps2 ps3 = ps2.congHaiPhanSo(ps1);
		 * 
		 * // ps2.xuatPhanSo(); // ps3.xuatPhanSo(); ps3.xuatPhanSo();
		 */

		/*
		 * ToaDo td= new ToaDo(); td.nhapToaDo(); td.xuatToaDo();
		 */

		/*NgayThangNam ntn = new NgayThangNam();
		ntn.nhapNgayThangNam();
		ntn.xuat();*/
		
		/*ThongTinTinh ttt= new ThongTinTinh();
		ttt.nhap();
		ttt.xuat();*/
		/*
		DuongTron dt= new DuongTron();
		dt.nhap();
		dt.xuat();*/
		
		/*TamGiac tg= new TamGiac();
		tg.nhap();
		tg.xuat();*/
		
		/*PhanSo a = new PhanSo();
		a.setTu(5);
		a.setMau(10);
		//tu so la: 5;
		//mau so la 10;
		System.out.println(" tu so la:"+a.getTu());
		System.out.println(" mau so la: "+a.getMau());*/
		
		
		
	/*	ToaDo td= new ToaDo();
		td.setx(2);
		td.setY(3);
		//td.xuatToaDo();
		
		DuongTron dt= new DuongTron();
		dt.setI(td);
		dt.setR(6);
		dt.xuat();*/
		
		/*NgayThangNam b= new NgayThangNam();
		b.setNgay(11);
		b.setThang(4);
		b.setNam(2016);
		b.xuat();*/
		
		/*ToaDo td= new ToaDo();
		td.setx(3);
		td.setY(4);
		
		ToaDo td1= new ToaDo();
		td1.setx(3);
		td1.setY(4);
		
		ToaDo td2= new ToaDo();
		td2.setx(0);
		td2.setY(4);
		
		ToaDo td3= new ToaDo();
		td3.setx(8);
		td3.setY(8);
		
		
		TamGiac tg= new TamGiac();
		tg.setA(td1);
		tg.setB(td2);
		tg.setC(td3);
		tg.xuat();*/
		
		/*ThongTinMatHang mh= new ThongTinMatHang();
		mh.setDon(10);
		mh.setSoLuong(20);
		mh.setMatHang("abc");*/
		//-------------------------------------------------------------
			/*Contructor*/
		
		//ToaDo td= new ToaDo();
		//td.xuatToaDo();
		/*DuongTron dt= new DuongTron();
		dt.xuat();*/
		/*NgayThangNam nt= new NgayThangNam();
		nt.xuat();*/
		
		/*ThongTinMatHang t= new ThongTinMatHang();
		t.xuat();*/
		
		/*ThongTinTinh n= new ThongTinTinh();
		n.xuat();*/
		
		
		
		
		//CONTRUCTOR LOAI 2//
		/*PhanSo a = new PhanSo(1,2);
		a.xuatPhanSo();*/
		
		/*
		ToaDo a= new ToaDo(2,3);
		a.xuatToaDo();
		
		DuongTron dt= new DuongTron(33,a);
		dt.xuat();*/
		/*PhanSo p= new PhanSo();
		PhanSo psa= new PhanSo();
		psa.nhapPhanSo();
		psa.xuatPhanSo();
		
		int c=p.soSanh( psa);
		System.out.println(+c);
		*/
		
		/*ToaDo td= new ToaDo();
		ToaDo td1= new ToaDo();
		td.nhapToaDo();
		td.xuatToaDo();
		double f= td.khoangCachDiem(td1);
		System.out.println(+f);*/
		
		TamGiac tg= new TamGiac();
		
		ToaDo tdA= new ToaDo();
		tdA.nhapToaDo();
		
		ToaDo tdB= new ToaDo();
		tdB.nhapToaDo();
		
		ToaDo tdC= new ToaDo();
		tdC.nhapToaDo();
		
		tg.setA(tdA);
		tg.setB(tdB);
		tg.setC(tdC);
	
		Double p= tg.ChuViTamGiac();
		System.out.println("P:"+p);
		Double s= tg.DienTichTamGiac();
		System.out.println( "S: "+s);
		
		

	}

}
