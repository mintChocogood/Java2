package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor



public class 한국타이어 extends 타이어 {
	
	// 완성차 업체의 타이어 규격을 지키자
 	// 타이어의 규격을 재정의 합니다!
	
	@Override
	public void roll() {
	log.trace("떼굴떼굴 굴러가유");
	
	log.info("한국타이어 - 고속주행에 특화");
	} // roll

	
	
	
} // end class
