package Package1;

public class Computer extends Calculator {
	
	
	// 상속받은 원의 면적을 구해주는 메소드가 마음에 안들어서,
	// 다시 재정의(이를 메소드 오버라이딩이라고 합니다) 하고 있음(***** 핵심)
	@Override
	double areaCircle(double r) {
		System.out.println("컴퓨터::원의크기 호출");
		
		return Math.PI * r * r;			// Math.PI의 값은 정확도가 굉장히 높다
	} // areaCircle

} // end class
