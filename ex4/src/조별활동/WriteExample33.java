package 조별활동;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample33 {

	// 핵심포인트: 문자기반의 출력스트림(Writer) 객체를 이용해서,
	// 			   출력버퍼(기본8K)에 문자(열)출력 Auto-flushing으로,
	//			   한꺼번에 출력버퍼의 내용물을, 출력스트림에 write 해버림
	public static void main(String[] args) {
		// 1. Reader/Writer이든, 객체를 생성하는 싯점에, 지정된 경로의 파일을 open(연결)
		// 2. OutputStream/Writer 모두, 두번째 생성자 매개변수(append)를 true로 지정하지
		//	  않으면, 파일의 내용을 싹~ 지워버림!!
		try {
		Writer writer = new FileWriter("C:/temp/test2.txt", true); 
		
		try(writer)
		{
		
		String a = "홍기서";
		
		// String.toCharArray() 메소드를 이용해서, 문자열 인코딩(즉, String => char[] 로 변환
		char[] data = "홍길동".toCharArray();
		char[] data2 = a.toCharArray();
		
		for(int i = 0; i<data.length; i++) {
			// 1개의 문자씩 출력(어디에? 출력버퍼에)
			writer.write(data[i]);	// 메모리에 있는 출력버퍼(8K)에 고속쓰기
		} // for
		
		for(int i = 0; i<data2.length; i++) {
			writer.write(data2[i]);
		} // for
		
		
		writer.flush(); // 출력버퍼에 잔존하는 모든 문자들을 강제로 flushing
		}
		catch(IOException e) {
			e.printStackTrace();
		} 
			
		
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			;;
		}
		
		
	} // main

} // end class
