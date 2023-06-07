package read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import lombok.Cleanup;

public class ReadExample2 {

	
	// 핵심포인트: 바가지(char[] 배열)를 이용해서, 문자기반 입력스트림에서
	//			   바가지 크기만큼, 문자들을 한꺼번에 읽어들이자 => 속도가 빨라짐
	public static void main(String[] args) throws Exception {
		@Cleanup Reader reader = new FileReader("C:/temp/TTT2.java");
		
//		try(reader){
		int readCharNo;
		
		char[] cbuf = new char[20];		// 바가지의 크기:20문자
		
		String data = "";				// 파일데이터를 문자로 저장할 지역변수
		
		while(true) {
			readCharNo = reader.read(cbuf);
			
			if(readCharNo == -1) { // -1 : EOF(End-Of-File 
				break;				// 파일의 끝을 만났으니, 탈출
			} // if
			
			// 읽어낸 문자배열(바가지) String(Token)으로 변환
			data += new String(cbuf, 0 , readCharNo);
			
		} // while
		System.out.println(data);
		
//		} // try-with-resources
	} // main

} // end class
