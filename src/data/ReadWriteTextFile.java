package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\QA Practice Files\\Testing\\text.text");
		f.createNewFile();
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("This is 1st Line");
		bw.newLine();
		bw.write("This is 2nd Line");
		bw.flush();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		
		
	}

}
