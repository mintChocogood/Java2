package Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Properties;
import java.util.Scanner;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PropertiesExample {

	// 핵심포인트: 프로그램의 설정파일(XXX.properties 확장자를 가짐 => 이 파일을
	// 리소스번들(Resource Bundle)을 읽어 들여서, Map 컬렉션 형태(Key/value)
    // 쌍으로 저장하느 Map 객체가 Properties임
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		
//		properties.load("리소스번들파일경로");
		
		// 리소스 번들파일(XXX.properties)의 경로를 획득 하려면,
		//	Step.1 현재 실행 클래스 Clazz 객체(java.lang.Class)를 획득
		// 	 	   ex) java.lang.Class clazz; => JVM method area에 저장된 객체의 
		//			   주소를 저장
		//	Step.2 Class 객체의 메소드 중에, getResource(리소스번들파일명)의
		//		   경로를 저장하고 있는 URL 타입의 객체안에 지정된
		//		   리소스 번들파일의 절대 경로가 들어있는 것을 반환
		
		//	Step.3 URL 객체의 메소드로, getPath() 메소드를 호출하면,
		//		   URL 객체가 가지고 있는 절대경로를 문자열로 반환받을 수가 있다.
		
		
		Properties properties = new Properties();
		log.info("1.properties: {}" , properties);
		// Step.1 실행클래스의 Clazz 객체 획득
		Class clazz = PropertiesExample.class;
		
		// Step.2 Clazz객체의 getResource() 메소드 호출
		// *주의1: 이 실행 클래스와 같은 위치에 리소스 번들파일이 있다면, 그저
		//		   리소스 번들의 이름만 아래와 같이 지정해주면 됨
		// *주의2: 만일 리소스 번들 파일이, 다른데 있다면, 그 위치를 알맞게
		//		   지정해주지 않으면 무조건 오류발생(실행시!)
		URL url = clazz.getResource("/아이럽티티/database.properties");
		log.info("2. url : {}" , url);
		
		// Step.3 URL객체로부터, 절대경로를 문자열로 획득(URL 인코딩된 문자열)
		String path = url.getPath();
		log.info("3. path: {}", url.getPath());	
		
		// Step.4 URL 인코딩된 리소스번들의 절대 경로를 "디코딩"해줘야 함
		// String URLDecoder.decode(path, 문자집합);
		path = URLDecoder.decode(path, "utf-8");
		log.info("4. path: {}", path);
		
		// Step.5 자바I/O에서, 문자기반의 파일을 읽을 수 있도록 해주는
		//		  FileReader 클래스의 생성자 매개변수에 리소스번들의 경로
		//		  (디코딩된)를 전달인자(값)으로 주면 끝!
		properties.load(new FileReader(path));			// ***
		
		String key1 = properties.getProperty("key1");
		String 설정2 = properties.getProperty("설정2");
		String 설정3 = properties.getProperty("설정3");
		String 설정4 = properties.getProperty("설정4");
		String 설정5 = properties.getProperty("설정5");
		
		log.info("key1: {}, 설정2: {}, 설정3: {}, 설정4: {}, 설정5: {}",
				key1, 설정2, 설정3, 설정4, 설정5);
		
//		==================================================== //
//		java.lang.Class clazz 객체를 얻어내는 3가지 방법:
//		(1) 참조타입명.class
//		(2) 참조변수.getClass()
//		(3) "FQCN" 문자열을 이용해서, clazz 얻는 방법:
//			java.lang.Class.forName("FQCN")
//			ex) Class.forName("java.lang.String")
//		==================================================== // 
		
		// (1) 리소스번들파일(database.properties)의 파일 경로를 획득해서,
		// Properties 객체의 load() 메소드에 제공하면, 읽어드림.
		
		// Method Chaining 기법으로 최종 .properties 파일의 (절대) 경로획득
		

		
		
			// 절대경로
		
		
		
//		String path =
//				PropertiesExample.
//				class.						// java.lang.Class 타입의 Clazz 획득
//				getResource("database.properties").
//				getPath();					// java.lang.String
//		
//		log.info(path);
		
	} // main
} // end class
