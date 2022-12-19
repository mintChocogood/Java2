package pa.pb.pc;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class NumberFormatExceptionExample {

	// 핵심포인트: 4번쨰 runtimeException인, NumberFormatException에
	///			   대해서 알자! 발생하는 원인을 파악하자!!!
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		// 기본타입마다 대응되는 소위 Wrapper Type의 클래스에는 아래와같은
		// 2개의 공통 메소드가 모두 있습니다:
		//	(1) parseXXX() 메소드: String -> 해당 기본타입값으로 변화
		//	(2) valueOf()  메소드: String -> 해당 Wrapper Type의 객체로 변환
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data1);
		
		int result = value1 + value2;
		log.info("data1: {}, data2: {}, result: {}", data1, data2, result);
		
		
		
	} // main

} // end class 428p
