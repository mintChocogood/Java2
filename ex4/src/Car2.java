
public class Car2 {
	String color;   //색상
	int cc;			// 배기량
	
	
	// 오버로딩(Overloading): 생성자나 메소드를 같은 이름으로 여러개 선언하는 것
	// 오버로딩 조건: 매개변수 선언부에 매개변수의 (1)개수 (2)순서 (3) 타입 3가지
	//                조건 중, 단 하나라도 틀리면 OK(허용)
	public Car2() { // 매개변수 선언부에, 하나의 매개변수도 선언되지 않은 생성자
		System.out.println("Car2::Constructor invoked");
	} // 기본 생성자 (Default Constructor)

	
	
	
	Car2(String color, int cc) { // 매개변수가 있는 생성자 != 기본생성자
	System.out.println("Car2::Constructor(color, cc) invoked");
	
	} // Constructor


} // end class
