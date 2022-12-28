package system_in_out;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;


public class TTT {

	
	// 핵심포인트: 운영체제가 준 3개의 표준 자원을 이용해보자!!
	public static void main(String[] args) throws IOException {
//		(1) 표준출력 (System.out)
		PrintStream stdOut = System.out; // PrintStream: 바이트 기반의 출력스트림
		stdOut.close(); // ** 표준출력을 닫아버림(자원해제)
		
		stdOut.println("1. 표준출력을 이용하여, 콘솔에 출력합니다.");
		
//		(2) 표준에러 (System.err)
		PrintStream stdErr = System.err;
		stdErr.close(); // ** 표준에러를 닫아버림(자원해제)
		
		stdErr.println("2. 표준에러를 이용하여, 콘솔에 출력합니다.");
		
//		(3) 표준입력(System.in)
		InputStream sys = System.in;
		sys.close();	// ***: 키보드를 사용할 수 없음
		
		int keyCode = sys.read();
		int keyCode2 = sys.read();
		int keyCode3 = sys.read();
		stdErr.println("3. keyCode: " + keyCode);	// a
		stdErr.println("4. keyCode2: " + keyCode2);	// CR(Carriage Return)
		stdErr.println("5. keyCode3: " + keyCode3);	// LF(Line Feed)
		
		sys.close();
		
		
	} // main

} // end class
