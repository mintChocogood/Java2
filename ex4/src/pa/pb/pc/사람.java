package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class 사람 extends 동물 {
	
	@Override
	public void 사운드() {
		log.trace("사람 울음소리 호출");
		
		log.info("악!");
	} // 사운드

}
