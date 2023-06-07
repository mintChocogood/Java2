package Package2;

import Package1.A1;

// 핵심포인트: protected의 alpha 접근제한을 이해하자!!!
//			   protected의 alpha는, 비록 다른 패키지에 클래스가 있더라도,
//			   이 클래스가 A1 클래스를 상속받은 자식 클래스라면,
//			   A1클래스의 모든 protected 멤버에 접근 가능하다!!
public class D1 extends A1 {	// A1 클래스를 상속 => A1: 부모, D1: 자식
	
	public D1() {
		super();	// 부모생성자 호출 => protected와 전혀 상관이 있음 (**핵심**)
		

		
		this.field = "value";	// A1 부모 클래스의 필드 사용(상속받았으니까)
		this.method();			// A1 부모 클래스의 메소드 사용(상속받았으니까)
		
//		A1 a = new A1();	// XX: A클래스의 protected 생성자를 잘못 사용하는 예		
	}// D1					// new 연산자는 사용 불가

} // end class
