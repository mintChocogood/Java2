package bicycle3;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Pedal{
	int pedalTeeth;
	int pedalRPM;
	Gear gear = new Gear();
	
	
	public Pedal() {
		this.pedalTeeth = 54;
	} // default constructor
		
	public Pedal(int pedalTeeth) {
		this.pedalTeeth = pedalTeeth;
	} // constructor
	
	public void changeGearBody() {
//		log.trace("");
		gear = new Gear();
	} // changeGearBody
	
	public void changeGearBody(int gearLevel) {
//		log.trace("");
		gear = new Gear(gearLevel);
	} // changeGearBody(int)
	
	public void changeGear8thBody() {
//		log.trace("");
		gear = new Gear8th();
	} // changeGear8thBody
	
	public void changeGear8thBody(int gearLevel) {
//		log.trace("");
		gear = new Gear8th(gearLevel);
	} // changeGear8thBody(int)
	
	
	
//	@Override
	public void start() {
//		log.trace("start() invoked.");
		
		gear.powerTransmitted = this.pedalTeeth*this.pedalRPM;
//		log.info("분당 기어에 전해주는 톱니수: {}", this.powerTransmitted);
		gear.start();
	} // start
	
} // end class
