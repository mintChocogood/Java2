package bicycle3;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MTB extends Bicycle{
	
	public MTB() {
		super();
	
		pedal.changeGear8thBody();	
		super.gear = pedal.gear;
	} // default constructor
	
	@Override
	public void changeGear(int gearLevel) {
//		log.trace("changeGear() invoked.");
		
		gear.changeGear(gearLevel);
		super.gear = pedal.gear;
	} // changeGear(IGear)
	
} // end class
