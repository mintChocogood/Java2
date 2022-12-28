package scanner;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class ScannerExample {

	// 핵심포인트: Scanner를 활용해보자
	public static void main(String[] args) throws IOException {
//		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("1. 문자열 입력>"); // Prompt Message
//		String inputString = scanner.nextLine();
//		log.info("1. inputString: {}" ,inputString);
		
//		System.out.println("2. 숫자입력>");
//		if(scanner.hasNext()) {
//			int intnumber = scanner.nextInt();
//			log.info("2. number: {}", intnumber);
//		} // if
//		
//		System.out.println("3. 실수 입력>");
//		if(scanner.hasNext()) {
//			double doublenumber = scanner.nextDouble();
//			log.info("3. number: {}", doublenumber);
//		} // if
//		
//		System.out.println("4. true or false 입력> ");
//		if(scanner.hasNext()) {
//			boolean booleanValue = scanner.nextBoolean();
//			log.info("4. booleanVlaue: {}", booleanValue);
//		}
		
//		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("문장을 하나 입력해 주세요 >>> ");
		// 입력한 문장을 구성하는 첫번째 단어(*Token*)를 스캐닝
//		String token1 = scanner.next(); //  실험 - next() 메소드로 대체
//		String token2 = scanner.next(); //  실험 - next() 메소드로 대체
//		String token3 = scanner.next(); //  실험 - next() 메소드로 대체
//		String token4 = scanner.next(); //  실험 - next() 메소드로 대체
		
		// Step.4 스캐너(Scanner)를 통해, 읽어낸 데이터를 출력
//		log.info("token1: {}, token2: {}, token3: {}, token4: {}" , token1, token2, token3, token4);
		
		
//		-------------------
		
		// To show a new prompt message.
//		System.out.println("실수입력>");
//		System.out.println("(true | false) 입력>");
		
		// To receive a data as a int primitive type from console till pressing enter.
//		double inputDouble = scanner.nextDouble();
//		log.info("2. inputDouble: {}", inputDouble);
//		boolean inputBoolean = scanner.nextBoolean();
//		log.info("3. inputBoolean: {}", inputBoolean);
		
//		----------
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) { // 무한루프
//			System.out.println("--------- 메뉴 -------");
//			System.out.println("1. 커피주문");
//			System.out.println("2. 쥬스주문");
//			System.out.println("3. 케익주문");
//			System.out.println("99.종료");
//			System.out.println("----------------------");
//			
//			System.out.print("번호를 골라주시라요 > ");
//			int selectedNumber = scanner.nextInt();
//			
//			switch(selectedNumber) {
//				case 1 : log.info("커피를 주문했습니다."); break;
//				case 2 : log.info("쥬스를 주문했습니다."); break;
//				case 3 : log.info("케이크를 주문했습니다."); break;
//				case 99: log.info("프로그램을 종료합니다..");
//						 System.exit(0);
//				default: log.info("품절입니다 다시 골라주시거나 99번을 입력해 종료해주세요.");
//			} // switch
//		} // while
		
		Scanner scanner = new Scanner(System.in);
//		scanner.close(); // 자원해제
		
		// 자원해제 후에, 표준입력(System.in)은 무사한가??? 아니면, 같이 close 되었는가?
		System.out.println(">>> 정수를 입력해주세요 >");
//		BigInteger bigInt = scanner.nextBigInteger();
//		log.info("bigInt: {}", bigInt);
		
		
		BigDecimal bigDecimal = scanner.nextBigDecimal();
		log.info("bigDecimal: {}", bigDecimal);
	} // main

} // end class
