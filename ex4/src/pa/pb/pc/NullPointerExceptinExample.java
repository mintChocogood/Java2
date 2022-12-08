package pa.pb.pc;

import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class NullPointerExceptinExample {

	// 핵심포인트: 런타임익셉션 중에 가장 많이 발생하는 널포인트익셉션이
	// 발생하는 원인과 경우에 대해서 이해하자!
	// 참고로, 아직 이런 예외가 발생했을 때 처리하는 예외처리는 없습니다.
	public static void main(String[] args) {
		
//		String data = null;
//		
//		System.out.println(data.toString());

		log.trace(Arrays.toString(args));
		
		String data1 = args[0];
		String data2 = args[1];
		
		log.info("args[0]: {}" , data1);
		log.info("args[1]: {}" , data2);
		
		
		
		
		
//		if(args.length == 2) {
//			String data1 = args[0];
//			String data2 = args[1];
//			
//			log.info("args[0]" + data1);
//			log.info("args[1]" + data2);
//		}else {
//			log.info("[실행방법]");
//			log.info("값1, 값2");
//		}

		
		
		
	}
}
