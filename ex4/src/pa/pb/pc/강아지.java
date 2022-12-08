package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class 강아지 extends 동물{
	
	@Override
	public void 사운드() {
		log.trace("강아지 울음소리 호출");
		
		log.info("멍멍!");
		
	}

	
}
