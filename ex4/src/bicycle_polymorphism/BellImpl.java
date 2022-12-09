package bicycle_polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BellImpl implements Bell {

	@Override
	public void ring() {
		log.trace("ring() invoked.");
		log.info("벨이 울립니다.");
	}//ring

}//end class
