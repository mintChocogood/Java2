package write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import lombok.Cleanup;

public class WriteExample4 {

	
	// 핵심포인트: 더이상 문자열 데이터를 char[]로 인코딩하지 않고,
	//     		   문자열을 바로 출력버퍼에 write 할 수 있는 메소드 사용하자!!
	public static void main(String[] args) throws Exception {
		@Cleanup Writer writer = new FileWriter("C:/temp/test2.txt");
		
		String data = "안녕\n자바\t프로그램\n";
		
		try {
			writer.write(data);				// 문자열 그대로 출력버퍼에 출력가능
			writer.write(data);
			writer.write(data);
			writer.write(data);
			writer.write(data);
			
			writer.write(data, 3, 2);		// 문자열의 부분문자열을 출력버퍼에 출력
			writer.write(data, 3, 2);
			writer.write(data, 3, 2);
			writer.write(data, 3, 2);
			writer.write(data, 3, 2);
		} finally {
			writer.flush();
		} // try-finally
	} // main

} // end class
