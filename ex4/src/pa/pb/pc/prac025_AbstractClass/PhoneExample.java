package prac025_AbstractClass;

public class PhoneExample {

	public static void main(String[] args) {
//		Phone phone = new Phone();	// (X)
		
		// 다형성-1이 아님!
		SmartPhone smartPhone = new SmartPhone("홍길동", 1570000);
		
		smartPhone.turnOn();			// 부모로부터 상속받은 메소드 호출
		smartPhone.internetSearch();	// 자식만의 고유한 메소드 호출
//		smartPhone.turnOff();			// 오버라이딩 된 메소드 호출
		
	} // main

} // end class
