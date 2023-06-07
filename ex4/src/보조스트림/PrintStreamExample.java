package 보조스트림;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	// 핵심포인트: 프린터로 출력하게 할 수 있게 도와주는 보조스트림 예제
	// 			   (PrintStream, PrintWriter)
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/temp/file.txt");
		PrintStream ps = new PrintStream(fos);
		
		try(fos; ps;){
		ps.println("[프린트 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		ps.flush();
		} // try-with-resources
		
	}

}
