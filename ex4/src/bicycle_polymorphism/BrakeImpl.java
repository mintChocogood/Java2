package bicycle_polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BrakeImpl implements Brake {

	@Override
	public void stop() {
		log.trace("stop() invoked.");
		log.info("브레이크를 겁니다.");

	}//stop

}//end class
