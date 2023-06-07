package 보조스트림;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class InputStreamReaderExample {

	
	// 핵심포인트:
	//		바이트 기반의 InputStream -> 문자기반의 Reader로 변환 보조스트림
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;		// 기본스트림 (표준입력)
		
		// Base Stream을 보조스트림의 생성자의 인자값으로 넣어주면
		// Base Stream과 보조스트림이 연결됨
		
		// 여기서 보조스트림: 바이트기반의 입력스트림 => 문자기반의 입력스트림으로 변환
		@Cleanup
		Reader reader = new InputStreamReader(is);	// 보조스트림 연결 (다형성-1)
		
		int readCharNo;	// 보조스트림에서 실제 읽어낸 문자의 개수를 저장하기 위한 변수선언
		
		char[] cbuf = new char[100];	// 바가지: 문자기반으로 바뀜
		
		System.out.println("prompt>>>");
		
		while((readCharNo = reader.read(cbuf)) != -1) {
			// 바가지(char[])를 String Token으로 변환 by using String class
			String token = new String(cbuf, 0, readCharNo);
			
			log.info("1. cbuf: {}" , Arrays.toString(cbuf));
			log.info("2. token: {}", token);
		} // while
		
	} // main

} // end class
