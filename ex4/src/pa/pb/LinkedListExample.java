package pa.pb;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
@Log4j2

public class LinkedListExample {
	
	
	// 핵심포인트: 데이터의 성격에 맞는 컬렉션을 선택한 경우와
	//			   그렇지 않은 경우의 성능의 차이를 직접 경험해보자!
	public static void main(String[] args) {
		
		// --테스트 조건------------------------------------------------ //
		// ArrayList에 새로운 요소를 목록의 가장 처음위치(인덱스0번)에
		// 계속 넣을때의 소요시간을 측정하자!!!
		// ------------------------------------------------------------- //
		
		@Cleanup("clear")
		List<String> list2 = new ArrayList<>();
		// 실행소요시간 측정 (단위: 10억분의1초 = Nano Seconds)
		long startTime = System.nanoTime();	// 현재시간 측정(나노초)
		
		// 성능을 측정할 테스트 코드
		for(int i=0; i < 5; i++) {
			// 핵심: 새로운 요소객체를 0번 인덱스 지속적으로 추가
			//			=> 기존 컬렉션 요소들은 뒤로 밀림 => 더불어, 밀리는 요소갯수가 증가
			list2.add(0, String.valueOf(i));
		} // for
		
		long endTime = System.nanoTime();
		log.info("걸린시간: {}",(endTime-startTime) , "ns");
		
//		------------------------------------------------------------
		
		@Cleanup("clear")
		List<String> list1 = new LinkedList<>();	// 3번째 구현 클래스의 객체 생성
		
		startTime = System.nanoTime();
		
		// 성능을 측정할 테스트 코드
				for(int i=0; i < 5; i++) {
					// 핵심: 새로운 요소객체를 0번 인덱스 빈번히 넣어도,
					//			=> 밀땅현상 자체가 발생하지 않음(if LinkedList 구현객체인 경우)
					list1.add(0, String.valueOf(i));
				} // for
		
		endTime = System.nanoTime();
											// 현재시간측정 (나노초)
		log.info("걸린시간: {}",(endTime-startTime));
		
		
		
		
	}
	
	
	
	
	
} // end class
