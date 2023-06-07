package fileinputstream;

import java.io.FileInputStream;

public class FileInputStreamExample {
	private static final int EOF = -1; 
	
	
	
	// 핵심포인트: 정석으로 바이트 기반의 파일입력을 수행할 수 있게 해주는,
	//			   FileInputStream 객체에 대해서 잘 알자!!
	public static void main(String[] args) {
		try {
			// Step.1 생성자의 매개변수에 전달된, 경로의 파일을 바이트기반으로 입력받을 수 있는
			//		  FileInputStream 객체 생성
			FileInputStream fis = new FileInputStream("C:/temp/TTT.java");
			
			// Step.2 파일의 끝(EOF)을 만날 때까지, 1바이트씩 FileInputStream.read() 메소드로
			//		  파일의 데이터를 얻어내자!!
			int data; // FileInputStream.read() 메소드의 리턴값
			
			while( ( data = fis.read() ) != EOF) { // EOF(-1)
				System.out.write(data);
			} // while
			
			// Step.3 자원해제
			fis.close();
			
 		} catch(Exception e) {		// 예외처리
 			;;
 		}
		
		
		
		
	} // main

} // end class
