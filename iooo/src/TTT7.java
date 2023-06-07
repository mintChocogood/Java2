
public class TTT7 { // POJO : Plain Old Java Object (평범하고 진부한 자바 객체라는 의미) 
	
	    // 1. 인스턴스 필드   ==> 초기화는 생성자에서 함
		String 인스턴스필드1;
		int 인스턴스필드2;
		
		
		// 2. 정적필드  ==> 초기화는 스태틱 이니셜라이져(static initializer)
		static String 정적필드1;
		static int 정적필드2;
		static double 원주율; //static double 원주율 = 3.14159 = 진짜 초기값 => 진짜 초기화
		                      // 하지만 하드 코딩이므로 권장 X 스태틱 이니셜라이져에서 값변경 추천
		
	    
	
	static {
		System.out.println("이니셜라이져#1");
		
		// 정적필드의 초기화
		TTT7.정적필드1 = "기서";
		TTT7.정적필드2 = 1000;
		TTT7.원주율 = Math.PI; // 필드의 값 변경
		
		// 정적필드의 값을 출력
		System.out.println(TTT7.정적필드1);
		System.out.println(TTT7.정적필드2);
		System.out.println(TTT7.원주율);
		
		// 1. 정적필드의 사용 => OK
		TTT7.정적필드1 = "1"; 
		
		// 2. 정적메소드의 호출 => OK
		TTT7.정적메소드();
		
		// 3. 인스턴스 필드의 사용 => XX
//		인스턴스필드1 = "2"; 
		
		// 4. 인스턴스 메소드 호출 => XX
//		인스턴스메소드();
		
		//5. this 키워드 사용 => XX
//		System.out.println(this);
		
	} // 스태틱 이니셜라이져#1
	static {
		System.out.println("이니셜라이져#2");
		
		// 아래의 메소드가 호출되기까지의 모든 메소드 호출 구조가 출력
		Thread.dumpStack();
		
		// 위 dumpStack() 메소드 호출을 통해서, 우리가 알 수 있는것은
//		 Static initializer의 이름 ===> <clinit> 으로 나온다!
		//                             (Cl)ass static (init)ializer
	} // 스태틱 이니셜라이져#2
			
	TTT7() {
		Thread.dumpStack();
	} // 기본 생성자
	
	
	
	
	public static void main(String... args) {
		TTT7 오브젝트 = new TTT7();
	}
	
	public void 인스턴스메소드() {
		System.out.println("TTT7::인스턴스 메소드() 호출");
	} // 인스턴스메소드
	public static void 정적메소드() { System.out.println("TTT7::정적메소드() 호출");
			} // 정적메소드
	
	
	
	
} // end class
