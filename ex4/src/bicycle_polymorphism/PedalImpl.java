package bicycle_polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PedalImpl implements Pedal {
	
	@Override
	public void stepOn(String degreeOfPedaling) {
		log.trace("stepOn() invoked.");
		log.info("페달을 {} 밟습니다.",degreeOfPedaling);
	}//stepOn

}//end class
