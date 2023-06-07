package Package2;

import Package1.A;
import Package1.B;

// A클래스와 패키지가 틀림(전제사항)
public class C {
	
	public C() {
		A a = new A();		// A class: public, constructor: public
		a.field1 = 1;		// A's field1 : public
//		a.field2 = 1;		// A's field2 : default XX
//		a.field3 = 1;		// A's field3 : private XX
													
		a.method1();		// A's method : public
//		a.method2();		// A's method : default	XX
//		a.method3();		// A's method : private	XX
	}
	
	
	
	
	
	

} // end class
