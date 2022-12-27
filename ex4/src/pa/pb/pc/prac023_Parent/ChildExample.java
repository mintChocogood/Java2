package prac023_Parent;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class ChildExample {

	
	// 핵심포인트 : 다형성-1 상태에서, 자식객체를 다시 회복시키고자 하면,
	//			    "강제형변환"이 필요하다!!
	public static void main(String[] args) {
		Parent parent = new Child();		// 다형성-1
		log.info("1. parent: {}", parent);
		
		parent.field1 = "data1";			// 부모필드 사용
		parent.method1();					// 부모메소드 호출
		parent.method2();					// 부모메소드 호출
		
//		============================
		
		// 다형성-1 상태에서는, 오직 부모타입의 멤버만 사용가능하다!!
//		parent.field2 = "data2";	//(불가능)
//		parent.method3();			//(불가능)
		
//		============================
		
		// 자식객체 고유의 필드와 메소드를 사용해야 할 때에는 어떻게 합니까
		// 부모에게 꽉 안겨있는, 자식객체를 "강제로" 빼내야 합니다.
		// 그래서 "강제형변환"이 필요합니다.
		
		// "instanceof" 연산자: 용법 - <참조변수> instanceof <참조타입>
		//	(패턴매칭)			연산 - 왼쪽의 <참조변수>가. 오른쪽의 <참조타입>의
		//							   인스턴스(객체)가 맞는지 확인 => true or false 반환
		if(parent instanceof Child child) {
//			Child child = (Child) parent;	// 다형성-1 전제조건하에서,
											// 자식객체를 빼낼 때 필요
			log.info(child.field1);
			
			child.field2 = "yyy";			// (가능)
			child.method3();				// (가능)
			
			log.info("2. child: {}", child);
			
			child.field2 = "zzz";
			
			log.info("3. parent: {}", parent);
		} // if
		
//		Parent p = new Child2();
//		
//		if(p instanceof Child) {
//		Child child = (Child) p;
//		log.info("2. child: {}", child);
//		} else {
//			log.info("우리가 생각했던 Child 타입의 객체가 아님.");
//		} // if-else
		
	} // main

} // end class
