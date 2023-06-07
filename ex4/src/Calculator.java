
public class Calculator {

		String model = "SZ1000";   // <= (인스턴스)필드
//		static String model = "SZ1000"; <= 정적 필드, (메소드도 마찬가지이며 생성자는 제외함)
//	      "static => 이 붙어있다면 정적필드 붙어있지않다면 인스턴스 필드
		
	
		void powerOn() {    // 전원을 켜다
			System.out.println("Calculator::powerOn() invoked");
			
//			System.out.println("\t + model: " + this.model);
			
//			this.powerOff();
		} // powerOn
		
			
		void powerOff() {   // 전원을 끕니다
			System.out.println("Calculator::powerOff() invoked");
		} // powerOff
		
		public int plus(int x, int y) {   // 덧셈을 수행하다
			System.out.println("Calculator::plus(x, y) invoked");
			
			int result = x + y;
			return result;
		} // plus
		
		double divide(int x, int y) {   // 나눗셈을 수행하다
			System.out.println("Calculator::divide(x,y) invoked");
			
			double result = (double)x / (double)y;
			return result;
		} // divide

} // end class 
