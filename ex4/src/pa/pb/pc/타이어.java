package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@ToString
@Log4j2
@NoArgsConstructor
public class 타이어 {
	
	public void roll() {
		log.trace("roll() 호출됨.");
		
		log.info("기본타이어");
	} // roll
	
	
} //end class
