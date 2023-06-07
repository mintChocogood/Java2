package pa.pb;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;
@ToString
@Log4j2
public class TTT3 {
	
	// 가변인자 매개변수의 선언과 사용 그리고 주의할 특징ㅇㅔ 대해서
	// 100% 알자~
	public static void main(String[] args) {

		// 가변인자를 매개변수로 가지는 메소드를 호출하는 입장에서
		// 우선 가변인자를 이해하자 느낌표 땅땅
		
		// (1) 가변인자 매개변수, 전달인자를 전달하는 방법
		TTT3.staticMethod();		// 1) 전달인자의 개수: 0
		TTT3.staticMethod(1);		// 2) 전달인자의 개수: 1
		
		// 아래와 같이, N개의 전달인자를 전달할 때에는, 쉼표로 구분해서
		// 전달하시면 됩니다~(****)
		TTT3.staticMethod(0, 1, 2, 3, 4, 5, 6, 7, 8, 9); // (3) 전달인자의 개수:N
		
		// 빈 배열도 똑같이 전달 가능!  => 아무것도 전달X
//		int[] intArr2 = {}; == TTT3.staticMethod();
		
		int[] intArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // 배열생성
		TTT3.staticMethod(intArr);		// 전달인자로 배열객체를 전달해도 됨~

		
		
	} // main
	
	// (1) 가변인자란? 전달인자의 값으로 0개 이상을 받는 매개변수를 의미
	// (2) 가변인자 매개변수 선언문법: (타입명... 매개변수명)
	// (3) 가변인자를 제대로 사용하시려면, 가변인자를 가지는 메소드를 호출하는 입장과
	// 호출을 당하는 메소드 입장에서 모두 경험하셔야 합니다.
	
	// 가변인자(...)는 매개변수에 단 한개만 입력 가능,
	// 그리고 마지막에 위치해야함
	private static void staticMethod(int... numbers) {
		// 호출당하는 메소드 입장에서 본 가변인자는 한마디로!!!!
		// "배열"객체 입니다!!
		log.trace("스태틱메소드({},{}) 실행됨.", numbers);
		
		log.info("Type of varargs: {}", numbers.getClass().getName());
		
		
	} // 정적메소드
	
	
	
} // end class

