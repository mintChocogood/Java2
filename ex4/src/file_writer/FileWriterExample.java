package file_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class FileWriterExample {

	public static void main(String[] args) throws Exception {
		File file = new File("C:/temp/file2.txt");
		
		Charset charset = StandardCharsets.UTF_8;	// 1st. method
//		        charset = Charset.forName("UTF-8");	// 가능
//				charset = Charset.forName("UTF8");	// 가능
//				charset = Charset.forName("utf-8");	// 가능
//				charset = Charset.forName("utf8");	// 가능
				charset = Charset.forName("cp949");	
				
		log.info("1. charset: {}", charset);
		
//		FileWriter fw = new FileWriter(file, true);
		FileWriter fw = new FileWriter(file, charset ,true);
		
		// 문자열을 그대로 출력가능해짐 ("\r\n" => Enter Key)
		// 기본 출력버퍼(임시메모리)에 고속출력
		fw.write("FileWriter는 한글로된" + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		
		fw.flush(); // 강제로 출력버퍼에 잔류하는 문자들 방출(flush)
		
		fw.close(); // 자원해제
		
		System.out.println("파일에 저장되었습니다.");
	} // main

} // end class
