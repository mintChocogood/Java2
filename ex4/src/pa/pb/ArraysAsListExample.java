package pa.pb;

import java.util.Arrays;
import java.util.List;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class ArraysAsListExample {

//	핵심포인트: Arrays Helper Class를 통해서도 List 컬렉션을 생성할 수 있습니다
	public static void main(String...   args) {
		// Arrays.asList() 메소드는 Generic Method입니다. (***)
		// 때문에, 이 메소드 호출시, "구체타입"을 지정해야 합니다.
		// 더불어, 이 메소드의 매개변수는 "가변인자" 입니다. (***)
		List<String> list1 = Arrays.<String>asList("홍길동", "신용권","김자바");
		Class clazz = list1.getClass();
		log.info("type: {}", clazz.getName());
		
		List<Integer> list2 = Arrays.<Integer>asList(1,2,3,4,5);
		
		// 생성한 List 컬렉션의 순회
		for(String name:list1) {
			log.info("name: {}", name);
		} // enhanced for
		
		for(int name:list2) {
			log.info("name: {}", name);
		} // enhanced for
		
//		---
		
	} // main

} // end class
