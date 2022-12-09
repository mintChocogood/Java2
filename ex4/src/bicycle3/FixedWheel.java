package bicycle3;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class FixedWheel extends Wheel{

	
	public FixedWheel() {
		super();
	} // default constructor
	
	public FixedWheel(int wheelSize) {
		super(wheelSize);
	} // constructor
	
	
	@Override
	public void start() {
		log.trace("start 수행합니다.");
		
		this.meterPerMin = this.wheelRotation*this.wheelSize/100*0.8;
		this.kmPerHour = (int)(this.meterPerMin*6/10)/10.0;
		
		log.info("자전거가 {}km/h, 1분에 {}m씩 움직입니다.", this.kmPerHour, this.meterPerMin);
	} // start
	
} // end class
