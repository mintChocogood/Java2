
public class LocalVriableExample {

	public static void main(String[] args) {
		
		// @Untill JAVA9
		String message1 = "Hello";       // 우리가 알고 있는 지역변수의 타입선언
		System.out.println(message1);
		
		//@since JAVA10 - var 변수를 사용하자
		var message2 = "Hello";        // 문자열(String) 타입으로 추론
		                               // Rvalue의 초기값으로 타입을 결정 -> 변경불가!
		
		System.out.println(message2 + ", world!!!");
		
		var intValue = 100;                // 컴파일시에, 타입추론으로 int타입으로 결정
		System.out.println(intValue + 200);
		
		var longValue = 100L;   // 정수뒤에 대/소문자로 l을 붙이면, 이 리터럴은 long타입
		System.out.println(longValue + 200);
		
		var doubleValue = 100.0;     //실수뒤에 아무것도 붙이지 않으면, 기본 double 타입 리터럴이 된다.
		System.out.println(doubleValue + 200);
		
		var floatValue = 100.0f; // 실수뒤에 대/소문자로 f를 붙이면, float 타입의 리터럴이 된다
		System.out.println(floatValue + 200);
		
	//	intValue = "Giseo"; // XX : 문자(String)타입이 맞지않습니다 인트변수를 넣으시오
		
		
		
	} // main
} // end class
