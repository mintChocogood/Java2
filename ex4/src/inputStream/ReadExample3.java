package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

import lombok.Cleanup;

public class ReadExample3 {

	// 핵심포인트: 바이트 기반의 파일입력스트림으로부터, 바가지를 이용해서, 입력수행
	//			   이때, 바가지에 제약을 설정(즉, 바가지 크기를 다 사용할지, 일부만 사용할지를 설정)
	public static void main(String[] args) throws Exception {
	@Cleanup
	InputStream is = new FileInputStream("C:/temp/TTT.java");
	
	byte[] 바가지 = new byte[8];
	
//			         offset = 배열에서 시작인덱스 번호를 지정하는 역할
//					           length = offset인덱스로부터, 몇개까지 포함시킬지 지정
	
//					------		----
//	is.read(바가지,    2,        3); // 바가지 일부만 사용
	is.read(바가지,    0,        바가지.length); // 바가지 전체를 사용
	System.out.println(Arrays.toString(바가지));

	}

}
