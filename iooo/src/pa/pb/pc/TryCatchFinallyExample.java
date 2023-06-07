package pa.pb.pc;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TryCatchFinallyExample {
// 핵심포인트: 기본적인 예외처리구문에 대해서 접해보자!!! 가볍게
	public static void main(String[] args) {

		// try는 단독으로 사용불가: try-catch, try-finally는 사용가능
		try {
				
				Class clazz = Class.forName("java.lang.String2");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace(); // 오류문자를 내려줌 ** 필수적으로 수행 시켜야함**
			log.info("클래스가 존재하지않습니다.");
			
			// exit 메소드에 지정한 인자 값 => "종료코드"
			// 이 "종료코드"는 아래와 같은 의미를 가집니다:
			// (1) if 종료코드가 == 0, means "정상종료" 의미
			// (2) if 종료코드가 != 0, means "비정상종료" 의미
			System.exit(0);
		}finally {	// finally 키워드는 필수는 아님 다만 들어가면 반드시 실행 됨
			log.info("Done.");
		} // try-catch-finally
		
	} // main

} // end class
