package pa.pb;

import java.util.Scanner;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ScannerExample {

	public static void main(String[] args) {
		// Step.1 java.util.Scanner 클래스의 인스턴스 생성
		// 		*주의* : 이때 생성자의 매개변수에 인자값으로,
		// 				 표준입력(System.in) 전달
		Scanner scanner = new Scanner(System.in);
		
		// Step.2 사용자의 입력을 유도하는 메시지 출력
		//		  (이를 "프롬프트 메시지" 라고 부름)
//		System.out.println("문자열 입력>"); // Prompt Message
		
		// Step.3 사용자가 Step.2의 프롬프트 메시지가 유도하는대로,
		//		  입력한 값을, 엔터키(<Enter>)를 입력하기 전까지의 데이터를 읽어냄
		
		// 한 행을 읽어서 문자열로 반환
//		String inputString = scanner.nextLine();
		
		// 입력한 문장을 구성하는 첫번째 단어(Token)를 스캐닝
//		String token1 = scanner.next(); //  실험 - next() 메소드로 대체
//		String token2 = scanner.next(); //  실험 - next() 메소드로 대체
//		String token3 = scanner.next(); //  실험 - next() 메소드로 대체
//		String token4 = scanner.next(); //  실험 - next() 메소드로 대체
		
		// Step.4 스캐너(Scanner)를 통해, 읽어낸 데이터를 출력
//		log.info("token1: {},token2: {},token3: {},token4: {}" , token1, token2, token3, token4);
		
//		-------------------
		
		// To show a new prompt message.
//		System.out.println("실수입력>");
		System.out.println("(true | false) 입력>");
		
		// To receive a data as a int primitive type from console till pressing enter.
//		double inputDouble = scanner.nextDouble();
//		log.info("2. inputDouble: {}", inputDouble);
//		boolean inputBoolean = scanner.nextBoolean();
//		log.info("3. inputBoolean: {}", inputBoolean);
		
//		----------
		
		while(true) { // 무한루프
			System.out.println("--------- 메뉴 -------");
			System.out.println("1. 커피주문");
			System.out.println("2. 쥬스주문");
			System.out.println("3. 케익주문");
			System.out.println("99.종료");
			System.out.println("----------------------");
			
			System.out.print("번호를 골라주시라요 > ");
			int selectedNumber = scanner.nextInt();
			
			switch(selectedNumber) {
				case 1 : log.info("커피를 주문했습니다."); break;
				case 2 : log.info("쥬스를 주문했습니다."); break;
				case 3 : log.info("케이크를 주문했습니다."); break;
				case 99: log.info("프로그램을 종료합니다..");
						 System.exit(0);
				default: log.info("품절입니다 다시 골라주시거나 99번을 입력해 종료해주세요.");
			} // switch
		} // while
		
		
	} // main

} // end class
