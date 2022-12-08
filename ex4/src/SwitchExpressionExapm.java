
public class SwitchExpressionExapm {

	public static void main(String ... args) {
	
		int intValue = 100;
		
		boolean boolValue = 
		switch(intValue) {
		case 100, 200, 300 -> false;
		case 400, 500      -> true;
		default            -> false;
		
		};   // switch expression
		
		System.out.println(boolValue);
		
		
//		int value = 3000;
		
//		switch(value) {
//		case 100, 150 -> {
			//System.out.println("case100");
			//System.out.println("Hello, world!!!");
		//}// case 100
		
		// 실행문장이 단 1개 일 때에는, 중괄호기호({}) 생략가능!!
		// 무조건 생략해야 하는 것은 아니다!!!
		//case 200, 250 -> {
	//		System.out.println("case200");
//		}
		
		// 중괄호 기호 생략
//		case 1000 -> System.out.println("case1000");
		
		// 실험: 이 case에서만, 값을 생성해보자!
		// 값을 생성하는 용도와 실행문장 수행용도를 섞어서 사용할수는 없다.
//		case 3000 -> 3000;      

		
		// Switch Expression의 용도가 값을 생성하는 식이 아니라,
		// 이 예제와 같이, 단순히 실행문장을 수행시키는 목적이라면,
		// default 케이스는 없어도 그만!
//		default -> {
//			System.out.println("default");
//		}
		
//		} // switch expression
		
//	3. 값을 생성하는 용도로 switch expression 사용
	
	String str = "Hello";
	
	int result = switch(str) {
	case "world" -> 1;
	case "Hello" -> 2;
//	case "Hello" -> 3; xx : Duplicate case ( 중복된 값을 생성 불가) 
	default -> 0;
	}; // switch expression
	System.out.println(str);
	
		
	
	// 4. 값을 생성하는 용도로 switch expression 사용하되,
	// 복잡한 연산식과 yield 키워드를 이용해서 값을 반환
	
	int me = 4;
	String operation = "SquareMe";
	
	result = switch(operation) {
	// 값을 생성하는 식은 yield 키워드를 사용하되
	// 중괄호 기호({}) 마저 생략되어버린다면, Lambda Expression 생략규칙에
	// 따라, 반드시 yield 키워드까지 생략해야 한다!
	
	// 자바언어에서는, 오직 한개의 값(=스칼라, Scalar)이 나와야 될 부분이 있다면,
	// 아래 경우가 모두 가능하다:
	// (1) 리터럴
	// (2) 변수
	// (3) 연산식
	case "DoubleMe"   -> me * 2;
	case "SquareMe" -> {
		yield me * me;  
	}
	default         -> me;
		
	
	}; // switch expression

	System.out.println(result);
	
	
	
	//5. 값을 생성하는 용도로 switch expression 사용하되,
	//   Lvalue 가 있느냐 없느냐에 따라, default 케이스의 용법이 달라진다!!!
	
	operation = "SquareMe";
	
//	*Caution*: if a switch expression returns a value and Lvalue Not exists,
//	           The switch expression should Not return 
//  Note1 : A switch expression should have a default case if Lvalue exists.
//	Note2 : A switch expression have *optional* default case if Lvalue Not exists.
	//Lvalue
	// L밸류가 실행되면 R밸류는 계산식이 되어야함 반대로 실행이 되지않는다면 R밸류는 오직 실행문의 역할만 함 
//	String s = 
			//Rvalue
			
			switch(operation) {
	case "SquareMe" -> {
		System.out.println("Hello1");
		System.out.println("Hello2");
		
	//	yield "100"; // 문자열 반환
	} //default          ->"Giseo";
	 // default          -> { 
	//	  yield "Giseo"; 
		  } // Ditto. (같다)
	}; // switch expression
	
	
	
	
	
		
		
		
		
	} // main
	
} // end class
