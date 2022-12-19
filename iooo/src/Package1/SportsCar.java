package Package1;

public class SportsCar extends 자동차{
	
	
	@Override
	public void speedUp() {		// final 메소드가 아닙니다.
		speed += 10;
	} // 가속
	
	// 오버라이딩 불가
	@Override
	public void stop() {		// final 메소드 입니다.
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	} // 정지
	
	
	
	
	
} // end class
