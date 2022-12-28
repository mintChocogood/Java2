package 연습;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class 허허허 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/temp/file.txt");
		
		BufferedInputStream fos = new BufferedInputStream(fis);
		
		try(fis; fos;){
		char[] cbuf = new char[100];
			
			
			
		while(fos.read() != -1);
		
		
		
		
		}
	}
}
