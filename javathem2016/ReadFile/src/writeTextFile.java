import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author USER
 * 
 */

public class writeTextFile {

	public static void writeTextFile(String fileName) {

		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			Scanner reader = new Scanner(System.in);
			System.out.println(" so luong phan tu");
			int n = reader.nextInt();
			bufferedWriter.write(String.valueOf(n));
			bufferedWriter.newLine();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {

				System.out.print(" nhap phan tu thu a[" + i + "] :");
				a[i] = reader.nextInt();

				bufferedWriter.write(String.valueOf(a[i]) + " ");
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

	public int tinhtong(String fileName) {
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
				if (idem == 2) {
					String [] b = line.split(" ");
					for(String str : b){
						s += Integer.parseInt(str);
					}
				}
			}
			//String line = "1 2 3 4 5";split()
			bufferedReader.close();
			fileReader.close();
			
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file " + fileName);

		} catch (IOException ex) {
			System.out.println("Error reading file:" + fileName);
			ex.printStackTrace();
		}
		return s;

	}

	public static void main(String[] args) {
		writeTextFile wt= new writeTextFile();
		String fileName = "C:\\Users\\USER\\Desktop\\Number.txt";
		// writeTextFile(fileName);
		//readTextFile(fileName);
		int c= wt.tinhtong(fileName);
		System.out.println(c);

		// try{
		// int a = 5;
		// int b = 0;
		// int c = a/b;
		// System.out.println(c);
		// }
		// catch(Exception e){
		// System.out.print("Ban dang chia cho 0");
		// //System.err.println(e.getMessage());
		// }
	}

}
