package Package1;

// 클래스에는 public or default 접근제한자만 허용됨 (**)
// 클래스 내부에서는, 모든 접근제한자는 효력을 발생시키지 못합니다.(**)
public class A { 	// 누구둔 접근 가능한 클래스
	
	public int field1;		// 퍼블릭 접근제한자
	int field2;				// 디폴트 접근제한자
	private int field3;		// 프라이빗 접근제한자
	
	public A() {			// 같은 클래스 내부에서는, 접근제한자는 아무런 의미(효력)가 없다(**)
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();			// 같은 클래스 내부에서는, 접근제한자는 아무런 의미(효력)가 없다(**)
		method2();
		method3();
	} // 생성자
	
	public void method1() {;;}		// 퍼블릭 접근제한자
	void method2() {;;}				// 디폴트 접근제한자
	private void method3() {;;}		// 프라이빗 접근제한자
//	메소드
	
	
	
	
	
	
	
	
	
	
	
	
	
//	// 1. 필드
//	A a1 = new A(true);			// default 접근제한자
//	A a2 = new A(1);			// default 접근제한자
//	A a3 = new A("문자열");		// default 접근제한자
//	
//	// 2. 생성자
//	public A(boolean b) {;;}   // public 접근제한자
//	A(int b) {;;}			   // default 접근제한자
//	private A(String s) {;;}   // private 접근제한자
	
} // end class
