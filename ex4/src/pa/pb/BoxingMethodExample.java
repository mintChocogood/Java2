package pa.pb;

import lombok.extern.log4j.Log4j2;
@Log4j2
public class BoxingMethodExample {

	// 핵심포인트: 제네릭 메소드를 사용할 때(="호출할 때"), 타입파라미터 선언부에
	//			   전달할 구체적인 참조타입의 이름("구체타입")을 지정
	
	
	public static void main(String[] args) {
		// 제네릭 메소드에 전달할 "구체타입"은, 아래와 같이,
		// 호출메소드 이름 왼쪽 그리고 도트(.) 연산자 다음에 지정합니다!!(***)
		Box<Integer> box1 = Util.<Integer>boxing(100);	// Auto-Boxing
//		int intValue = box1.get();
		
//		log.info("1. intValue: {}" , intValue);
//		log.info("2. box1: {}", box1);
		
//		Box<String> box2 = Util.<String>boxing("홍길동");
		Box<String> box2 = Util.<String>boxing(200);
//		Box<String> box2 = Util.boxing("홍길동");			// "구체타입" 생략하는 경우(이렇게 하지말것)
		
		String strValue = box2.get();
		log.info("1. strValue: {}" ,strValue);
		log.info("2. box2: {}" ,box2);
		

	} // main

} // end class
