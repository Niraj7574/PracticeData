package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("C:\\QA Practice Files\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fi);
		
		System.out.println(prop.getProperty("browser"));

		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fo = new FileOutputStream("C:\\QA Practice Files\\Testing\\prop.properties");
		prop.store(fo, "This is added line");
		
	}

}
