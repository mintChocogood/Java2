package Properties;

import java.net.URL;
import java.util.Properties;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PropertiesExample {

	// 핵심포인트: 프로그램의 설정파일(XXX.properties 확장자를 가짐 => 이 파일을
	// 리소스번들(Resource Bundle)을 읽어 들여서, Map 컬렉션 형태(Key/value)
    // 쌍으로 저장하느 Map 객체가 Properties임
	public static void main(String[] args) {
		Properties properties = new Properties();
		log.info(properties);
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
		
		Class clazz = PropertiesExample.class;
		
		URL url = clazz.getResource("database.properties");
		log.info("1. url : {}" , url);
		log.info("3. path: {}", url.getPath());		// 절대경로
		
		
//		String path =
//				PropertiesExample.
//				class.						// java.lang.Class 타입의 Clazz 획득
//				getResource("database.properties").
//				getPath();					// java.lang.String
//		
//		log.info(path);
		
	} // main
} // end class
