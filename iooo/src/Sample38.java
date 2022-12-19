import java.util.Scanner;

public class Sample38 {

	public static void main(String[] args) {
		// 1. Prompt Message 출력 (입력유도)
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		// Scanner: 콘솔뷰에서 사용자가 입력한 한 행을 
		//          그대로 스캐닝 해서, 문자열로 생성
		Scanner scanner = new Scanner(System.in);
		// 3. 스캐너가 입력받은 문자열을 저장할 변수 선언 
		String inputString; // 지역변수의 "선언" (초기화 없음)
		
		// 4. do ~ while 문
		do {
			System.out.print(">"); // Prompt Message
			
			// 5. 위에서 "선언" 만 되었던, 지역변수의 "초기화"수행
			//    사용자 입력 행을 스캐닝해서 -> 문자열로 생성
			inputString = scanner.nextLine(); 
//			              scanner.nextInt(); // int 타입정수를 생성
//			              scanner.nextDouble(); //double 타입 실수를 생성
//			              scanner.nextBoolean(); // boolean 타입 논리값(true/false) 생성
			System.out.println(inputString); // 스캐닝한 문자열 출력
		} while( ! inputString.equals("q") ); // do-while
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		scanner.close(); //스캐너가 시스템 자원을 운영체제로 반납시킴
		
		
		
		
		
		
	}
}
