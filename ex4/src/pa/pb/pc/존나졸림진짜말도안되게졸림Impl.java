package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class 존나졸림진짜말도안되게졸림Impl implements IPerson{

	@Override
	public void sleep() {
		log.trace("와 ㄹㅇ 진짜 미쳤따 개졸려() 호출.");
	} // sleep
	
	public void goodSleep() {
		log.trace("개꿀잠 잤다 도랏다() 호출.");
	}
	
	
} // end class
