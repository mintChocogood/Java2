package prac024_InstanceOf;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class InstanceofExample {
	
	// 핵심포인트: 패턴매칭연산자(instanceof)의 이해와 응용
	// 			   더불어서, JAVA 14에서 표준화된 향상된 패턴매칭연산자도 적용해봅니다.
	public static void method1(Parent parent) {
		log.trace("method1({}) invoked.", parent);
		
		if(parent instanceof Child)	{		// @till JAVA 13
			Child child = (Child) parent;	//
			
//		if(parent instanceof Child child) {	// @since JAVA 14
			log.info("Child로 변환성공");
		} else {
			log.info("Child로 변환되지 못함");
		} // if-else
	} // method1
	
	public static void method2(Parent parent) {
		log.trace("method2({}) invoked.", parent);
		
		Child child = (Child) parent;	// Un-safe casting
		log.info("Child로 변환성공");
	} // method2
		
	public static void main(String[] args) {
		Parent parentA = new Child();		// 다형성-1
		
		InstanceofExample.method1(parentA);
		InstanceofExample.method2(parentA);
		
//		=============
		
		Parent parentB = new Parent();		// 다형성-1이 아닙니다!!
		
		InstanceofExample.method1(parentB);
		InstanceofExample.method2(parentB);	// 예외 발생
	} // main
	
} // end class
