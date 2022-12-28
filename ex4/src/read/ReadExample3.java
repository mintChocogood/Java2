package read;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ReadExample3 {

	
	// 핵심포인트: 바가지(char[] 배열)의 일부만을 사용하자!
	//             but, 실전에서는 이렇게 사용하지 않는다!
	public static void main(String[] args) throws Exception {
		@Cleanup Reader read = new FileReader("C:/temp/test2.txt");
		
		char[] cbuf = new char[4];	// 바가지 생성(최대 4개문자 저장가능)
		
		int readCharNo = read.read(cbuf, 0, 4);	// 1번만 문자기반 입력스트림에서 문자를 읽어냄(바가지 일부만 사용)
		
		log.info(Arrays.toString(cbuf));
		log.info("1. readCharNo: {} ", readCharNo);
		
	} // main

} // end class
