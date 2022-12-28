package file;

import java.io.File;
import java.net.URI;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class FileExample {

	
	// 핵심포인트: 도스창에서, 특정 디렉토리의 dir 명령수행결과와 비슷하 화면을 만들어 내는 예제
	public static void main(String[] args) throws Exception{
	// 지정된 경로가 존재하든 안하든 상관 없음!
		File dir = new File("C:temp/1/2/3/Dir");
		File file1 = new File("C:/temp/file1.txt");
		File file2 = new File("C:/temp/file2.txt");
		
		log.info("1. dir : {}", dir);
		log.info("2. file1: {}", file1);
		log.info("3. file2: {}", file2);
		
		// 경로를 URI 형식으로도 지정가능!
		File file3 = new File(new URI("file:///C:/temp/file3.txt") ); // ***
		log.info("4. file4: {}", file3);

//		---
		
		if(dir.exists() == false) { dir.mkdirs(); }
		if(file1.exists() == false) { file1.createNewFile(); }
		file1.createNewFile();
		
		if(file2.exists() == false) { file2.createNewFile(); }
		if(file3.exists() == false) {file3.createNewFile();}
		
		
		
		
	} // main

} // end class
