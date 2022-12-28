package 버퍼인풋스트림;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		
		Reader reader = new InputStreamReader(is,"utf8");
//		Reader reader = new InputStreamReader(is,Charset.forName("utf8"));
		
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println("1. 입력: ");
		
		String lineString = br.readLine();
		
		log.info("2. 출력: {}", lineString);
		
		
		
	}
}
