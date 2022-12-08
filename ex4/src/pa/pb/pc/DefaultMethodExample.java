package pa.pb.pc;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class DefaultMethodExample {

	// 핵심포인트: 인터페이스의 default 메소드를 어떻게 사용하는 것일까~
	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();	// 다형성-1
		mi1.메소드1();						// 다형성-2
		// 마치 현재 참조변수에 저장된 객체의 기본 메소드처럼 사용가능
		mi1.메소드2();							// ** 디폴트 메소드 호출**
		
//		===============
		
		MyInterface mi2 = new MyClassB();	// 다형성-1
		mi2.메소드1();						// 다형성-2
		mi2.메소드2();						// 다형성-2 ** default 메소드를 재정의하여 사용 **
		
		
	} // main

} // end class