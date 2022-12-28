package inputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import lombok.Cleanup;


public class ReadExample2 {

	
	// 핵심포인트: 이번에는 바이트기반 파일입력스트림에서,
	//			   "바가지(byte[])"를 만들어서, 바가지 채로 스트림에서 퍼내자!!!
	public static void main(String[] args) throws Exception{
		
		// Step.1 바이트기반의 파일 입력스트림 객체 생성 => 실제 지정된 파일과 연결 (파일이 개방)
		@Cleanup
		InputStream is = new FileInputStream("C:/temp/TTT.java");
		
		// Step.2 입력스트림에서 바이트들을 한꺼번에 여러바이트를 퍼내기 위한 바가지 생성
		// 아래와 같이, 바가지를 절대 생성하지마라!! => 그럼 어케해야합니까?
		// 적절한 크기의 바가지를 생성해줘야 합니다(바가지: byte[] 배열객체)
		
//		int fileSize = is.available();	// 파일의 크기를 되돌려 줌
//		byte[] 바가지 = new byte[fileSize];	// 이번에는, 바가지를 준비해서, 한번에 많이 읽어내자!
		
		byte[] 바가지 = new byte[8];
		
		// Step.3 필요한 지역변수 선언
		int readByteNo;	// 바가지(byte[])로 실제 읽어낸 바이트의 개수를 저장
		String data = "";
		
		// Step.4 무한루프 속에서, 매번 반복 때마다, 바가지(byte[])로 바이트들을
		//		  바이트 기반의 파일입력스트림에서 읽어내다가, 파일의 끝(EOF,-1)을
		// 		  만나면 빠져나옵니다.
		
		
		while(true) {	// 무한루프: 파일의 크기는 다 다르기 때문에, 몇번을 읽어내야 할지 알 수 없음
			// 바가지로 읽어내면, 실제로 스트림에서 읽어낸 바이트 개수를 반환
			
			readByteNo = is.read(바가지);	// 바가지로 읽어내자!!
			
			// 탈출조건 : 파일의 끝(EOF)에서 빠져나옴
			if(readByteNo == -1) break;			// EOF를 만나면 탈출
			
			// 바가지의 바이트 배열을 문자열로 변환하여, 누적(연결)
			// "문자열로 변환" 하여 , 계속 누적(연결시킴 => 이 문자열 조각을 토큰(Token)이라 부름!!!
			data += new String (바가지, 0, readByteNo);
			
		} // while
		
		// Step.5 파일의 전체 바이트들을 문자열로 계속 연결시킨 최종 문자열 출력
		System.out.println(data);
		
		// Step.6 자원해제: 모든입/출력스트림은(바이트기반이든,문자기반이든) 자원객체임
		//					즉, java.lang.AutoCloseble
//		is.close();
	} // main

}
