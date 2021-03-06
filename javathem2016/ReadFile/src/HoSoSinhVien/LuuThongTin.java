package HoSoSinhVien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author USER
 * 
 */
public class LuuThongTin {

	public static void LuuThongTin(String hoso) {
		DanhSachSinhVien ds = new DanhSachSinhVien();
		ds.nhap();
		try {
			FileWriter fileWriter = new FileWriter(hoso);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for (SinhVien sv : ds.danhSachSinhVien) {
				bufferedWriter.write(sv.maso + "," + sv.hoten + "," + sv.namsinh
						+ "," + sv.dienthoai );
				bufferedWriter.newLine();
			}

			// bufferedWriter.write(ds+",");
			// bufferedWriter.write(ds.hoten+" ,");
			// bufferedWriter.write(String.valueOf(ds.namsinh)+" ,");
			// bufferedWriter.write((ds.dienthoai)+" ");

			// alway close files.
			bufferedWriter.close();
			fileWriter.close();
			System.out.println("file was writeten successfully");

		} catch (IOException ex) {
			System.out.println(" Error writing to file:" + hoso);
			ex.printStackTrace();
		}
	}

	public static void readTextFile(String hoso) {

		System.out.println("File content :");
		String line = null;
		try {
			// filereader reads text files in the defaukt encoding.
			FileReader fileReader = new FileReader(hoso);

			// always wrap fileReader in bussereedReader'
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);

			}

			// Always close files
			bufferedReader.close();
			fileReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file " + hoso);

		} catch (IOException ex) {
			System.out.println("Error reading file:" + hoso);
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuuThongTin luu = new LuuThongTin();
		String hoso = "C:\\Users\\USER\\Desktop\\thongtinluutru.txt";
		LuuThongTin(hoso);
		readTextFile(hoso);
	}

}
