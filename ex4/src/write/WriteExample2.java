package write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {

	
	// 핵심포인트: 바가지 채로, 출력버퍼에 쓰자!!!
	public static void main(String[] args) throws Exception {
		// 1. 문자기반의 파일출력스트림 객체 생성
		Writer writer = new FileWriter("C:/temp/test2.txt", true);
		
		try(writer){	// 파일출력스트림 자원객체 자동 자원해제
			// String => char[]로 인코딩
			char[] data = "홍길동".toCharArray();
			
			// 바가지(char[]) 채로 쓰자!!! (***)
			writer.write(data);	// 출력버퍼에 고속쓰기 (***)
			
			// 출력버퍼 강제 flushing (***)
			writer.flush();	writer.flush(); writer.flush();	
			
			// RUN 하신 후에, 우리가 지정한 경로의 파일에,
			// "홍길동"이 잘 쓰여졌는지 확인하세요!
			
		} // try-with-resources => 이 try-with-resources 블록은 단독사용이 가능합니다!
	} // main

} // end class
