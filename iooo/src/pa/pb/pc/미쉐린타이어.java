package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

public class 미쉐린타이어 extends 타이어 {
	@Override
	public void roll() {
		log.trace("떼굴떼굴떼굴떼굴");
		
		log.info("미쉐린타이어- 경주용 광폭타이어에 특화");
	}
	
	
	
} // end class
