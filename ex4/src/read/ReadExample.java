package read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	
	
	// 핵심포인트: 지정된 경로의 파일의 데이터를, 
	//             문자기반으로 읽어서 콘솔에 그대로 출력허자!
	public static void main(String[] args) throws Exception {
//							자식클래스 중, File을 문자단위로 읽을 수 있는 입력스트림 사용
//							--------------------------------
		Reader reader = new FileReader("C:/temp/TTT2.java");
		int readData;
		
		while (true) { // 문자기반 입력스트림에서, 몇번을 반복해서 읽어내야 할지 모르기 때문에
					   // 무한루프 생성
			readData = reader.read();		// 1개의 문자씩 입력스트림에서 읽음(4바이트 int 정수로 반환)
			
			// 탈출조건
			if(readData == -1) {	// EOF(End-Of_File, -1) : 언젠가 파일의 끝을 만나면..
				break;				// 무한루프 탈출
			} // if
			
			// 읽어낸 1개의 문자를 그대로 콘솔에 출력
			System.out.print((char) readData);
		} // while
		reader.close();		// 자원해제
	} // main

} // end class
