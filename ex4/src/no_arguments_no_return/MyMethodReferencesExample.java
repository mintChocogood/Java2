package no_arguments_no_return;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MyMethodReferencesExample {

	// 핵심포인트: 람다식을 만드는 스텝을 잘 익히고, 여러 생략문법을 익히자!!!
	public static void main(String[] args) {

		MyFunctionalInterface2 fi = null;
		// =========================================================================== //
		// 람다식의 생략문법에 대해서 익히자!!!
		// =========================================================================== //
		// (1) 람다식의 중광호 블록({}) 내에, 실행문장이 오직 1개밖에 없으면,
		//	   중괄호 기호({})를 생략 할 수 있따!!!
		// (2) 람다식의 매개변수 선언부에 매개변수들의 타입들을 생략할 수 있다.
		// (3) 람다식의 매개변수선언부에 매개변수 개수가 오직 1개 밖에 없으면,
		//	   소괄호기호(())를 생략할 수 있다
		// =========================================================================== //
				
		// @Override
		// public abstract void method(int x) {
		
//	} // method 
		// 아래와 같이 생략가능
		fi = x -> log.trace("메소드({}) 호출됨." , x);
		fi.method(100);
		
		log.info("type: {}", fi.getClass().getName());
		
		
		
	} // main

} // end class
