package Package1;
@MyAnnotion         	// OK
//@MyAnnotion public   	// OK
//public @MyAnnotion		// OK 
//public class @MyAnnotion Service // XX : class 키워드와 클래스 이름은 한 몸
public class Service {
	@MyAnnotion
	private String name;
	
	@MyAnnotion private int age;
	private @MyAnnotion double weight;		// OK
//	private  double @MyAnnotion weight;  // XX(필드의 타입과 이름은 한 몸)
	public static final double PI = Math.PI;
	public static int objCount;
	
	static {
		Service.objCount = 0;
	} // 스태틱 이니셜라이져
	
	
	@MyAnnotion				// OK
	public Service() {
//		@MyAnnotion		// OK
		@MyAnnotion int temp3 = 3; // OK
	} // 기본 생성자
	
	{
		int temp2 = 0;
	} // 유저 디파인 블록
	
	public Service(	@MyAnnotion String name, // 어노테이션은 지정된 위치에 부착할 수 있다는 의미이지
					@MyAnnotion int age, 	// 무조건 아무데나 붙일 수 있다는 의미는 X
					@MyAnnotion double weight) {
		int temp = 0;				// 지역변수
	} // 생성자
	
//	@MyAnnotion					// OK
//	@MyAnnotion public 			// OK 
//	public void	@MyAnnotion 	// XX
	public void instanceMethod(String name, int age) {
//		@MyAnnotion				// OK
		boolean isPowerOn = false;	// 지역변수
	} // 인스턴스메소드
	
	@MyAnnotion					// OK
//	public static void @MyAnnotion  // XX : 메소드 한몸 - 리턴타입까지 포함
	public static void staticMethod(String weight) {
//		@MyAnnotion				// OK
		@MyAnnotion Object obj = new Object(); // 지역변수
	} // 정적메소드
	
	
	
	
	
	
} // end class

@MyAnnotion		// OK
//@MyAnnotion interface	// OK 
//interface @MyAnnotion ITemp	// XX : 인터페이스 이름과 interface 키워드는 한 몸
interface Itemp{
	;;
} // end interface

@MyAnnotion		// OK
//@MyAnnotion enum 	// OK
//enum @MyAnnotion Numbering	// XX : 에넘 이름과 enum 키워드는 한 몸
enum Numbering{
	
} // end enum
