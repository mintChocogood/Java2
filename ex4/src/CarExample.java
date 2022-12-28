
public class CarExample {

	public static void main(String[] args) {

		// 1. 객체생성
		Car myCar = new Car();
		
		// *** 생성된 객체의 필드의 값을 사용하는 방법 : < 참조변수.필드명 > (***)
		// '.' 도트연산자: 객체멤버 참조(=사용) 연산자
		
		// 2. 필드 값 읽기
		myCar.company = "혐기차";
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		// 3. 필드 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	
		
		
		
		
	} // main

} // end class
