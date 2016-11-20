package NhapMaTran;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadMatrix {

	public static void writeTextFile(String fileName) {

		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			Scanner reader = new Scanner(System.in);
			System.out.println(" so luong dong");
			int m = reader.nextInt();
			bufferedWriter.write(String.valueOf(m));
			bufferedWriter.newLine();
			System.out.println(" so luong cot");
			int n = reader.nextInt();
			bufferedWriter.write(String.valueOf(n));
			bufferedWriter.newLine();
			int a[][] = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {

					System.out.print(" nhap phan tu thu a[" + i + "][" + j
							+ "] :");
					a[i][j] = reader.nextInt();

					bufferedWriter.write(String.valueOf(a[i][j]) + " ");
				}
				bufferedWriter.newLine();
			}

			// alway close files.
			bufferedWriter.close();
			fileWriter.close();
			System.out.println("file was writeten successfully");

		} catch (IOException ex) {
			System.out.println(" Error writing to file:" + fileName);
			ex.printStackTrace();
		}
	}

	public static void readTextFile(String fileName) {

		System.out.println("File content :");
		String line = null;
		try {
			// filereader reads text files in the defaukt encoding.
			FileReader fileReader = new FileReader(fileName);

			// always wrap fileReader in bussereedReader'
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);

			}

			// Always close files
			bufferedReader.close();
			fileReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file " + fileName);

		} catch (IOException ex) {
			System.out.println("Error reading file:" + fileName);
			ex.printStackTrace();
		}
	}

	/*
	 * public int hienThi(String fileName) { int s=0; String line = null; try {
	 * // filereader reads text files in the defaukt encoding. FileReader
	 * fileReader = new FileReader(fileName);
	 * 
	 * // always wrap fileReader in bussereedReader' BufferedReader
	 * bufferedReader = new BufferedReader(fileReader); int idem = 0; while
	 * ((line = bufferedReader.readLine()) != null) { idem++; if (idem >= 3) {
	 * String[] b = line.split(" ");
	 * 
	 * for (String str : b) { if (Integer.parseInt(str) % 2 == 0) {
	 * //System.out.println(str); s++; }
	 * 
	 * } } } bufferedReader.close(); fileReader.close();
	 * 
	 * } catch (FileNotFoundException ex) {
	 * System.out.println("Unable to open file " + fileName);
	 * 
	 * } catch (IOException ex) { System.out.println("Error reading file:" +
	 * fileName); ex.printStackTrace(); } return s; }
	 */
	
	public int kiemTraSoNguyenTo(int n) {
		int s = 0;
		for( int i=1;i<n;i++){
			if( n%i==0){
				s++;
			}if(s==2){
				return 1;
			}
		}
	return s;
	}
	public void hienThi(String fileName) {
		int s = 0;
		String line = null;

		try {
			// filereader reads text files in the defaukt encoding.
			FileReader fileReader = new FileReader(fileName);

			// always wrap fileReader in bussereedReader'
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int idem = 0;
			while ((line = bufferedReader.readLine()) != null) {
				idem++;
				if (idem >= 3) {
					String[] b = line.split(" ");
					for (String str : b) {
						//for (int i = 0; i <str.length() ; i++) {
							if (kiemTraSoNguyenTo(Integer.parseInt(str))==1) {
								System.out.println(Integer.parseInt(str));
							}
					//	}
						
					}
				}
			}
			bufferedReader.close();
			
			fileReader.close();

		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file " + fileName);

		} catch (IOException ex) {
			System.out.println("Error reading file:" + fileName);
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ReadMatrix wt = new ReadMatrix();
		String fileName = "C:\\Users\\USER\\Desktop\\matran.txt";
		// writeTextFile(fileName);
		readTextFile(fileName);
		
		wt.hienThi(fileName);

	}
}
