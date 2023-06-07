package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample {

	// 핵심포인트: 바이트 기반 파일 입력스트림을 통해서,
	// 			   파일의 데이터를 read 하자!
	public static void main(String[] args) throws Exception {

		// 바이트 기반의 파일 입력스트림 객체 생성
		InputStream is = new FileInputStream("C:/Temp/TTT.java"); // 다형성-1
		
		int readByte;
		while (true) { // 무한루프
			readByte = is.read();		// 손가락으로 입력스트림에서 한 바이트씩 read하자!
			
			if(readByte == -1) {		// 파일의 끝(EOF, End-Of-File)을 만나면(-1)
				break;					// 무한루프 탈출
			} // if
			
			System.out.println((char) readByte); // 실제 읽어낸 1바이트를 문자로 변환
		} // while
		is.close(); // 자원객체는 다 사용하고 나면 반드시 닫자!
	}

}
