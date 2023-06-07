package bicycle_polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class FixedTireImpl implements Tire {

	@Override
	public void roll() {
		log.trace("roll() invoked.");
		log.info("수리된 타이어로 굴러갑니다.");
	}//roll

}//end class
