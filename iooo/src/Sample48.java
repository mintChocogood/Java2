import java.util.Arrays;

public class Sample48 {

	// 핵심 : 과연 main (실행진입점)에 있는 "String[] args"는 도대체
		// (1) 누가 = > JVM이
		// (2) 언제 = > main을 실행시킬 때,
		// (3) 어떻게 = > String[] 배열객체를 만들어서
		// (4) 어디에 = > args 배열변수에 넣어줍니다
		// (5) 어디에 사용되는 걸까??? = > 여러분이 무엇을 만드느냐에 달려 있습니다.
	public static void main(String[] args) {
		System.out.println("* args : " + Arrays.toString(args));
		if(args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			
			System.exit(0); // 시스템(JVM)을 종료(exit)시켜라! 는 기능,
		} // if
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);  // < 문자열 숫자를 진짜 (int)정수로 바꿔줌(실수 혹은 문자열은 안됨)
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	} // main

} // end class
