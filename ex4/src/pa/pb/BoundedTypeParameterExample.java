package pa.pb;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BoundedTypeParameterExample {

	// 핵심포인트: "제한된 타입 파라미터"를 가지는 제네릭 메소드를 호출해보자!!
	// 				이때 구체타입은 어떻게 지정되는가! 를 봐라!
	public static void main(String[] args) {
//		 int str = Util.<String>compare("a", "b"); // XX
		
		int result = Util2.compare(12.3, 100);
		int result2 = Util2.compare(12.3, 10);
		log.info(result);
		log.info(result2);
		
		
		
	} // main

} // end class
