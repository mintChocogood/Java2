package 버퍼인풋스트림;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class BufferedInputStreamExample {

	
	// 핵심포인트: 입/출력 성능을 비약적으로 향상시키는 "성능향상" 보조스트림을
	//			   사용하자!!!
	//			   (BufferedInputStream/BufferedOutputStream,
	//			    BufferedReader/bufferedWriter)
	public static void main(String[] args) throws Exception {

//		long start = 0;
//		long end = 0;
//		
//		FileInputStream fis1 = new FileInputStream("C:/temp/file1.txt");
//		
//		// 실행소요시간 측정 부분 시작
//		start = System.currentTimeMillis();	// 현재시간을 밀리세컨드 단위로 반환
//		
//			// 시간측정 대상 코드들
//			while(fis1.read() != -1);	// 지정된 파일의 끝까지 읽기 작업만 수행
//			
//		end = System.currentTimeMillis();	// 현재시간을 밀리세컨드 단위로 반환
//		// 실행소요시간 측정 부분 끛
//		
//		log.info("1. 버퍼를 사용하지 않았을 때: {} ms", (end-start));
		// 7037 ms
		
		FileInputStream fis2 = new FileInputStream("C:/temp/file1.txt");
		
		// 성능향상 보조스트림(버퍼기반)을 이용한 테스트 수행
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		try(fis2; bis;) {
		long start = System.currentTimeMillis();
		
			while(bis.read() != -1);	// 테스트 코드
			
		long end = System.currentTimeMillis();
		
		log.info("2. 사용했을 때: {} ms ", (end-start));
		// 안썻을떄 7000ms 썻을때 65ms 줫나 빠름 ㅋㅋ
		} 
		
		
		
		
		
		
		
		
		
		
		
		
	} // main

} // end class
