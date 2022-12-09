package bicycle3;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Gear{
	int gearTeeth;			// 기어의 톱니 개수
	int powerTransmitted;	// 전달받을 힘
	Wheel wheel = new Wheel();
	
	
	public Gear() {
		this.gearTeeth = 17;
	} // default constructor
	
	public Gear(int gearLevel) {
		this.changeGear(gearLevel);
	} // constructor
	
	public void repairWheel() {
//		log.trace("repairWheel() invoked.");
		wheel = new FixedWheel();
	} // repairWheel
	
	public void changeWheel() {
//		log.trace("repairWheel() invoked.");
		wheel = new Wheel();
	} // changeWheel
	
	public void start() {
		log.trace("자전거의 주행속도");
		
		wheel.wheelRotation = this.powerTransmitted/this.gearTeeth;
//		log.info("현재 기어수: {}", this.gearTeeth);
		wheel.start();
	} // start
	
	public void changeGear(int gearLevel) {
		log.trace("기어변경을 실행합니다.");
		
		switch(gearLevel) {
			case 1:
				this.gearTeeth =  23;
				log.info("기어를 1단으로 변경했습니다.");
				break;
			case 2:
				this.gearTeeth =  20;
				log.info("기어를 2단으로 변경했습니다.");
				break;
			case 3:
				this.gearTeeth =  17;
				log.info("기어를 3단으로 변경했습니다.");
				break;
			case 4:
				this.gearTeeth =  15;
				log.info("기어를 4단으로 변경했습니다.");
				break;
			case 5:
				this.gearTeeth =  14;
				log.info("기어를 5단으로 변경했습니다.");
				break;
			default:
				log.info("1~5단까지의 기어변경만 가능합니다");
		} // switch-case
		
	} // changeGear
	
} // end class
