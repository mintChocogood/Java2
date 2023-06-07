package Package1;

public class 자동차 {
	
		public int speed;		// 상태필드
		
		public void speedUp() {
			System.out.println("자동차 가속 호출");
			
			speed += 1;
		} // speedup
		
		// 2. final 메소드 - 자식클래스에서 메소드 재정의 불허!
		public final void stop() {
			System.out.println("자동차 정지 호출");
					
			speed = 0;
		} // stop
	
} // end class
