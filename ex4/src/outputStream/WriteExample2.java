package outputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

import lombok.Cleanup;

public class WriteExample2 {

	// 핵심포인트: 출력스트림 객체 생성시, 지정된 경로의 파일이 이미 존재하는 경우
	//			   기본 동작이 무조건 기존 내용을 삭제하고 다시쓰는 Overwrite으로 작동하는데,
	//			   이번 출력시에는, 기존 파일의 내용을 그대로 유지한채로, 파일의 끝부분에 "추가"
	//			   (apeend)" 해주려면 어떻게 합니까!? => 출력스트림 생성자의 2번째 매개변수가
	// 			   boolean append 매개변수로, append=true이면 추가, append=false이면, overwirte됨
	//			   (기본값은 append=false임 => 그래서, 기존파일내용이 삭제됨)
	public static void main(String[] args) throws Exception {
		// 기존파일에 계속해서 추가해서 wirte 작업을 하려면,
		// 생성자의 두번째 매개변수로, true 추가하면됨!
		@Cleanup OutputStream os = new FileOutputStream("C:/Temp/test.txt", true);
		
		try(os) {
			// os 라는 자원객체를 사용하는 실행문자들을 넣음.
			
			// String > byte[]로 변환 -> 바가지 준비
			byte[] data = "대한민국".getBytes();
			
			// 출력버퍼(8K)에 바가지채로 쓰기 수행!
			os.write(data);
			
			// 출력스트림을 닫기전에 반드시 최소 1번은 강제 flushing 해야 함!
			// 왜? 출력버퍼(8KB)에 잔류한 바이트들이 존재할 수 있기 때문
			// 실전코드에서는 아래의 강제 flush 메소드 호출을 3회이상 수행!!!
			os.flush(); os.flush(); os.flush();
			
			
		} // try-with-resources
		
	} // main

} // end class
