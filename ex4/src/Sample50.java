import java.util.Calendar;

public class Sample50 {

	public static void main(String[] args) {
		
		
		// 열거타입을 사용해보자

		Week day = Week.MONDAY;
		
		day = Week.FRIDAY;
		
		// switch문으로 비교가능한 타입은 아래와 같습니다
		// (1)정수, (2) 문자(char), (3) 문자열, (4) 열거타입
		switch(day) {
		case MONDAY: System.out.println("ㅠㅅㅠ;"); break;
		case FRIDAY: System.out.println("^_^/"); break;
		default: System.out.println("-ㅅ-...");
		} // switch
		
		System.out.println(day == Week.FRIDAY);
		System.out.println(day != Week.FRIDAY);
		
//		--------------
		
		if(day == Week.FRIDAY) {
			System.out.println("불금 ^_^");
		} else {
			System.out.println("실망 ㅠ_ㅠ");
		}
		System.out.println("1. day: " + day);
		
		String FQCN = day.getClass().getName();
		String logicalAddress = Integer.toHexString(day.hashCode());
		String dayReference = FQCN + '@' + logicalAddress;
		
		System.out.println("2. dayReference : " + dayReference);
//		---------------------
		// null : 현재 객체의 주소를 가지고 있지않다! 라는 의미
		day = null; // day 변수는 객체의 주소가 들어있지 않다
		
		
		
		// NullPointerException
		
	} // M
} // E
