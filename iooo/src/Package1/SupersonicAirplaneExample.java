package Package1;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff(); 	// 부모로부터 상속받은 메소드 호출
		
		sa.fly();		// 자식객체의 재정의된 메소드 호출(***)
		
		sa.flyMode = SupersonicAirplane.SUPERSONIC;		// 비행모드 변경
		
		sa.fly();		// 자식객체의 재정의된 메소드 호출(***)
		
		sa.flyMode = SupersonicAirplane.NORMAL;			// 비행모드 변경
		
		sa.fly();		// 자식객체의 재정의된 메소드 호출(***)
		
		sa.land(); 		// 부모로부터 상속받은 메소드 호출
		
		
	} // main

} // end class
