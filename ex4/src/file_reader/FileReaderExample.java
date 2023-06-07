package file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

import lombok.Cleanup;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		@Cleanup FileReader fr = new FileReader("C:/temp/TTT.java");
		
		int readCharNo;
		
		// 문자기반 입출력스트림에서는,
		// 바가지의 타입만  byte -> char로 변경 (*주의*)
		char[] cbuf = new char[100];
		
		while ((readCharNo = fr.read(cbuf)) != -1) { // EOF (-1)
			
			String data = new String(cbuf, 0, readCharNo);	// String Token 새엇ㅇ
			System.out.print(data); // String Token을 console에 연이어서 계속 출력
		} // while
		
		
			
	} // main

} // end class
