
public class Calculator2Example {

	
	
	// 대전제: 정적멤버(필드와 메소드)는 정적멤버답게 사용하라!!!
	//     	   클래스명.필드 또는 클래스명.메소드 호출하라!!
	public static void main(String[] args) {
		Calculator2 calc = new Calculator2();
		
		int radius = 10;
		double result1 = radius * radius * Calculator2.pi; // 원의 면적구하는 식 
		
		
		int result2 = Calculator2.덧셈(10, 5);
		int result3 = Calculator2.뺄셈(5, 6);
		
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		
		
		
//		==============대전제2 실험==================
		
		// 1. 정적메소드 호출
		Calculator2Example.staticMethod();       // 정적멤버답게 사용하라!
		
		// 2. 인스턴스메소드 호출 (XX : 허용되지 않음 - 컴파일 오류)
//		instanceMehod();
		
		// 3. 정적필드의 사용
		System.out.println(Calculator2Example.age); // OK
		
		// 4. 인스턴스 필드의 사용
		System.out.println(name);                   // XX : 컴파일 오류
	} // main
	
	static String name;		 // 인스턴스 필드
	static int age;      // 정적 필드
	
	
	
	public void instanceMethod() {     // 인스턴스 메소드
		System.out.println(this.name);      // 1. 인스턴스필드의 사용 => OK
		this.instanceMethod2();			   // 2. 인스턴스 메소드 호출 => OK
		
		System.out.println(Calculator2Example.age);       // 3. 정적필드의 사용 => OK
		Calculator2Example.staticMethod();  // 4. 정적메소드 호출 => OK
	} // instanceMethod
	public void instanceMethod2() {
		;;
	}
	
	public static void staticMethod() {
		;;
	} // staticMethod
	
	
	
	
} // end class
