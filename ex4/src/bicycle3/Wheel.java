package bicycle3;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class Wheel{
	double wheelSize;
	double meterPerMin;
	double wheelRotation;
	double kmPerHour;
	
	
	public Wheel() {
		this.wheelSize = 70.0;		// 약 29.5 inch
	} // default constructor
	
	public Wheel(int wheelSize) {
		this.wheelSize = wheelSize;
	} // constructor
	
	public void start() {
		log.trace("자전거의 현재 주행속도");
		
		this.meterPerMin = this.wheelRotation*this.wheelSize/100;
		this.kmPerHour = (int)(this.meterPerMin*6/10)/10.0;
		
		log.info("자전거가 {}km/h, 1분에 {}m씩 움직입니다.", this.kmPerHour, this.meterPerMin);
	} // start
	
} // end class
