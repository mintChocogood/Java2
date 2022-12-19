package Package1;

// A 클래스와 같은 패키지 내부에 있는 클래스
public class B {
	
	public B() {
		A a = new A();		// A 클래스는 public, 생성자도 public
		a.field1 = 1;		// field1: public, field2: default, field : private
		a.field2 = 1;
		//a.field3 = 1;
		
		a.method1();		// method1: public, method2: default, method3 : private
		a.method2();
//		a.method3();
	} // 생성자
	
} // end class
