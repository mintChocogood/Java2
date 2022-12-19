package Package2;

public class ThrowsAndThrowExample {

	public static void main(String[] args) throws Throwable {
		Common a = new Common();
		
		a.add(Integer.MAX_VALUE, Integer.MAX_VALUE);
				
				
	} // main

} // end class

// (1) 대부분의 라이브러리 클래스의 메소드들은,
// 	   예외가 발생하더라도, 자신이 직접 예외처리(try-catch)하는 경우는 거의 없다!
class Common {	// 공용으로 쓰이는 클래스
	
	public int add(int num1, int num2) 
		// 문법: throws <예외클래스명1, 예외클래스2, ...> => 메소드에서 발생가능한 예외를 표시
	throws Throwable
	{
		
		// 개발자가 직접 예외를 발생시켜보자!
		// 문법 throw <예외객체 생성>;
		
		if(num1 >= Integer.MAX_VALUE || num2 >= Integer.MAX_VALUE) {
			// 강제로 개발자가 예외객체를 생성해서, 위로 던져야 합니다.
			// 여기서 '위'란, 이 add 메소드를 호출하는 자:
			//	(1) 생성자 블록 (2) 메소드 블록 (3) static initializer
			
//			throw new IllegalArgumentException("인자값이 너무 큽니다.");
			throw new ClassNotFoundException("인자값이 너무 큽니다.");
		} // if
				
		return num1 + num2;
		
	} // method
} // end class