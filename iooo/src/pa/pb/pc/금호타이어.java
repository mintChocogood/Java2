package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor


public class 금호타이어 extends 타이어 {
	@Override
	public void roll() {
		log.trace("떼굴떼굴 굴러가유~~");
		log.info("금호타이어 - 4계절 주행에 특화");
	}
	
	
	
	
} // end class
