package bicycle_polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class NewTireImpl implements Tire {

	@Override
	public void roll() {
		log.trace("roll() invoked.");
		log.info("교체된 타이어로 굴러갑니다.");
	}//roll

}//end class
