package Package1;

public class SupersonicAirplane extends Airplane{
	// 1. 아래의 static final 상수(불변의 진리값)는 비행모드를 상수로 정의한 것
	public static final int NORMAL = 1;				// 순항비행모드
	public static final int SUPERSONIC = 2;			// 초음속비행모드
	
	public int flyMode = NORMAL;					// 비행모드를 저장하는 상태필드
	
	
	// 메소드 재정의(Method Overriding) 수행
	// 왜? 초음속 비행기라면, 비행(날다)이 다르기 때문에
	@Override			// 오버라이드 즉 재정의 해줄때는 꼭 오버라이드 어노테이션
	public void fly() { // 사용
		System.out.println("슈퍼소닉비행기 비행 호출");
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			// Airplane 객체의 fly() 메소드 호출
			super.fly();
//			fly();				// XX: 무한루프가 반복됨, 재귀호출(Recursive Call)
		} // if-else         	// super.을 붙여주지 않으면 가장 가까운 위의
								// public void fly()<< 로 가서 계속해서 반복됨
	} // fly
	
	
	
	
	
	
	
} // end class
