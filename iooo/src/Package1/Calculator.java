package Package1;


// 메소드 오버라이딩: 상속받은 메소드가 마음에 안들면, 다시 재정의(Overriding)
// 할 수 있다 (단, 조건은 상속관계가 성립되엇을 때, 자식이 재정의할 수 있다)
public class Calculator {		// 부모 클래스

	// 원의 면적을 구해주는 기능의 메소드(원의 면적 = radius^2 x 원주율)
	double areaCircle(double r) {
		System.out.println("계산기::areaCircle(r)");
		
		double PI = 3.14159;
		return PI * r * r;		// 원의 면적 반환
	} // areaCircle
} // end class
