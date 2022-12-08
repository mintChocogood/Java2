package pa.pb.pc;

public class ChileExample {

	// 핵심 포인트:
	//		(1) 다형성-1을 전제조건으로,
	//		(2) 다형성-2: 부모객체의 메소드를 호출하면, 자식객체의 재정의된 메소드가 "무조건"
	//			호출된다!
	//			다형성-2가 발현되면, 부모객체가 상속해준 메소드는 숨겨집니다
	public static void main(String[] args) {
		
		// 1. 자식타입의 객체 생성
		Child child = new Child();
		
		// 2. 다형성-1 : 부모타입의 참조변수에 자식타입의 객체 대입
		Parent parent = child;
		
		// 3. 부모타입에 선언된 메소드 호출
		parent.method1();
		
		// 다형성-2: 부모객체의 메소드를 호출하면,
		//			 자식객체의 재정의된 메소드가 "무조건" 호출된다!
		parent.method2();		// 다형성-2: 재정의된 자식객체의 메소드가 호출됨
		
		// 4. 기타
//		parent.method3();  // (호출 불가능)
		
		
		
	} // main

} // end class
