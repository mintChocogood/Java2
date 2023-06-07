package pa.pb;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BoxExample2 {

	// 핵심포인트(to 개발자): 개발자는 이미 선언된 제네릭 타입을 이용하는 입장 
	// 때문에, 제네릭 타입(클래스/인터페이스)을 "사용할 때" => "구체타입" 지정필요!
	public static void main(String[] args) {
		// *** 제네릭 타입을 "사용할 때"에는, "제네릭 타입 파라미터"에 전달할 인자값으로
		// "구체적인 참조타입이름"을 전달
//		Box<String> box1 = new Box<String>();	// @till JAVA 7
//		Box<String> box1 = new Box<>();			// @since JAVA 8
//							//    --
//							// 이 다이아몬드 기호는 "타입추론" 연산자!
//		
//		box1.set("hello");			// 자동형변환이 전혀 발생안함 ** 왜?
//		
//		String str = box1.get();	// 강제형변환이 전혀 발생안함 ** 왜?
//		log.info("1. str:{}" , str);
		
		
		
//		=================
			// Box 클래스의 T는 이순간 모두 Integer로 바뀌게됨
		// 때문에 형변환은 발생하지않음
		Box<Integer> box2 = new Box<>();
		
		box2.set(6);						// Auto-Boxing
		
		int value = box2.get();				// Auto-Unboxing
		log.info("2. value: {}" , value);
		
//		==================
		
		Box<Apple> box3 = new Box<>();
		
		box3.set(new Apple());
		
		Apple apple = box3.get();
		log.info("3. apple: {}" , apple);
		
//		Util.boxing("응애");
		
		
		
	} // main
	
} // end class
