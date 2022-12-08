package Package1;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator 계산기 = new Calculator();
		
		// 부모객체의 메소드 호출하여 원의 면적
		System.out.println("원면적 : " + 계산기.areaCircle(r));
		System.out.println();
		
//		==========================
		
		// 부모없는 자식은 없다!!!
		Computer 컴퓨터 = new Computer();			// 자식객체 생성
		
		// 자식객체의 오버라이딩된 메소드를 호출
		System.out.println("2. 원면적 : " + 컴퓨터.areaCircle(r));
	} // main
	
} // end class
