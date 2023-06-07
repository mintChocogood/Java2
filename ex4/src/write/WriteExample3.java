package write;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample3 {

	// 핵심포인트: 문자기반의 출력스트림(FileWriter)을 이용해서,
	//			   파일에 바가지(char[])를 출력하되, 바가지의 일부분만 출력(using offset, length)
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/temp/test2.txt");
		
		char[] data = "홍길동".toCharArray();
		
		writer.write(data, 1, 2);
		writer.write(data, 0, data.length);
		
		writer.flush();		// ***
		
		writer.close();
	}

}
