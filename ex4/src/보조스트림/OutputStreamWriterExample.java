package 보조스트림;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		
		// Base 스트림 객체 생성(파일출력)
		FileOutputStream fos = new FileOutputStream("C:/temp/file.txt", true);
		
		// 바이트기반의 OutputStream => 문자기반의 Writer로 변환해주는 보조스트림
		Writer writer = new OutputStreamWriter(fos, "utf8");
		
		// 보조스트림부터 닫고 => 기본스트림을 닫는다! (***)
		try(fos; writer;){	// 오른쪽->왼쪽으로 자원객체를 자동으로 닫는다(***)
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		
		writer.write(data);
		writer.flush();			// ***
		
		} // try-with-resources
		
		log.info("파일 저장이 끝났습니다.");
		
	} // main

} // end class
