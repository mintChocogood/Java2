package bicycle_polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class HandleImpl implements Handle {

	@Override
	public void turnright() {
		log.trace("turnright() invoked.");
		
	}//turnright

	@Override
	public void turnleft() {
		log.trace("turnleft() invoked.");
		
	}//turnleft

	@Override
	public void turnback() {
		log.trace("turnback() invoked.");
		
	}//turnback

}//end class
