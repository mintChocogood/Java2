
public class Car2Example {

	// 대전제: OOP언어인 자바언어에서는 어떤 참조타입의 객체든, 
    //	       new 연산자가 유일한 객체 생성 연산자
	public static void main(String[] args) {

		// new 연산자 => 정식명칭: 객체생성연산자
		// new 연산자의 역할 3가지:
		// (1) 힙 영역에 무조건 새로운 객체를 생성(필드의 값은 타입별 기본값)
		// (2) 바로 뒤에 나오는 피연산자인 "생성자" 호출 => 원하는 필드의 값을 초기화
		//     => 드디어 사용가능한 객체가 완성됨
		// (3) 초기화까지 완성된 객체의 주소(=번지, 레퍼런스)를 반환(생성)
		
		int cc =3000;
		String color = "Black";
		
//		Car2 myCar2 = new Car2(color, cc);
//		System.out.println("-myCar: " + myCar2);
		
		Car2 myCar2 = new Car2();   // (OK)
	} // main

} // end class
