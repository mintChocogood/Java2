package Package2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			ThrowsExample.findClass();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
			log.error("클래스가 존재하지 않습니다.");
			
		} finally {
			log.trace("good");// try-catch
		}
	} // main
	
	public static void findClass() throws ClassNotFoundException {
		// 아래의 CLass.forName() 메소드는
		// ClassNotFoundException 예외를 던지게 되어 있음
		Class clazz = Class.forName("java.lang.String2"); 
	} // findClass
	
	
	
	
	
} // end class
