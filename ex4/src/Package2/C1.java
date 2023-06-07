package Package2;

import Package1.A1;

// 핵심 포인트: package1에 있는 A1클래스를 사용하려 합니다.
//				이때, A1클래스는 public이고, 모든 멤버(필드/생성자/메소드)는 protected.
//				패키지가 다른 클래스에서 A1을 사용하려 하면, A1클래스의 모든 멤버는
//				protected 이기 때문에, default로는 사용할 수 가 없습니다. 하지만 alpha
//				가 남아있습니다. 그래서, 이 예제는 default를 이해하는 예제
public class C1 {

	
	public void method() {
		A1 a;					// OK: A는 public class 이니까!
		
//		a = new A1();			// XX: A1 클래스의 protected 생성자를 호출 불가!(실패)
		
//		a.field = "value";		// XX: A1 클래스의 protected 필드를 호출 불가!(실패)
		
//		a.method();				// XX: A1 클래스의 protected 메소드를 호출 불가!(실패)
	} // 메소드
	
} // end class
