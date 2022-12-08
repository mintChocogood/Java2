
public class CalculatorExample {

	public static void main(String[] args) {
		
		// 1. 전자계산기 인스턴스(객체) 생성
		Calculator myCalc = new Calculator();
		
		// 2. 전자계산기의 메소드 호출
		myCalc.powerOn();                //   전원 on
		   
		// 3. 2번과 동일
		myCalc.plus(5, 6);    // 덧셈연산 수행하고 결과받음
		
//		System.out.println("result1: " + result1);
		
		// 4. 2번과 동일
		byte x = 10;
		byte y = 4;
		
		double result2 = myCalc.divide(x, y);  // 나눗셈 연산 수행하고, 그 결과 받음
		System.out.println("result2: " + result2);
		
		// 5. 2번과 동일
		                   // 전원 off
		myCalc.powerOff(); 
	}

}
