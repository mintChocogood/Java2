package pa.pb.pc;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ToString
@RequiredArgsConstructor
public class 자동차 {
	final String 제조사;
	final String 컬러;
	final int cc;
	
	
	
	// 부품필드
	타이어 tire = new 타이어();		// 기본타이어 장착, 다형성-1의 발현지점
//	한국타이어 tire = new 한국타이어();
	
	public void 주행() {
		log.trace("주행중 호출");
		log.info("부아아아앙");
		
		// 기능구현을 위해, 부품객체를 사용
		this.tire.roll();		// 다형성-2의 발현지점
	} // 주행
	
	
	
	
	
	
} // end class
