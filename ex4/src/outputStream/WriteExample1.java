package outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class WriteExample1 {

	// 핵심포인트; 지정된 경로의 파일에 문자열을 "출력" 해보자!
	public static void main(String[] args) throws Exception {
		// 1. 바이트 기반의 파일 출력 스트림 생성
		// 	  (지정된 경로의 파일이 없으면, 새로 생성, 있으면 => 내용을 overwrite)
		OutputStream os = new FileOutputStream("C:/temp/test.txt");
		
		// 2. 문자열을 바이트기반의 출력스트림에 출력해보자!!
		//	  모순 : 우리는 문자열을 가지고 있는데, 출력은 바이트로 해야한다!
		// String -> byte[]로 변환(왜? 바이트기반이니까)
		byte[] data = "어 반갑고".getBytes();     // 1.*** 출력용 바가지 생성
		
		// 3. 바가지 크기만큼, 1바이트씩 끊어서, 출력스트림에 write하자!!!
		for(int i = 0; i<data.length; i++) {
			os.write(data[i]);					// 1바이트씩 출력
		
			// 바가지 채로 쏟아붓기
//			os.write(data);
		} // for
		
		// 4. 바이트기반이든/문자기반이든, 출력스트림을 닫기전에
		//    반드시 강제로 출력버퍼(기본크기: 8KB)을 flushing 해줘야 함!! (****)
		
		// 자원객체를 닫기 전에 반드시 최소 한번은 수행해야 함!
		os.flush();				// 2. 강제 flushing (***)
		
		// 5. 자원해제
		os.close();				// 자원닫기
		
		
	} // main

} // end class
