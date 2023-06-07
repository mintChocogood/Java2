package bicycle3;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Gear8th extends Gear{
	
	
	public Gear8th() {
		super();
		this.gearTeeth = 18;
	} // default constructor
	
	public Gear8th(int gearLevel) {
		this.changeGear(gearLevel);
	} // constructor
	
	@Override
	public void start() {
//		log.trace("start() invoked.");
		
		wheel.wheelRotation = this.powerTransmitted/this.gearTeeth;
//		log.info("현재 기어수: {}", this.gearTeeth);
		wheel.start();
	} // start
	
	@Override
	public void changeGear(int gearLevel) {
//		log.trace("changeGear8th() invoked.");
		
		switch(gearLevel) {
			case 1:
				this.gearTeeth =  24;
				log.info("기어가 1단으로 변경되었습니다.");
				break;
			case 2:
				this.gearTeeth =  21;
				log.info("기어가 2단으로 변경되었습니다.");
				break;
			case 3:
				this.gearTeeth =  18;
				log.info("기어가 3단으로 변경되었습니다.");
				break;
			case 4:
				this.gearTeeth =  16;
				log.info("기어가 4단으로 변경되었습니다.");
				break;
			case 5:
				this.gearTeeth =  14;
				log.info("기어가 5단으로 변경되었습니다.");
				break;
			case 6:
				this.gearTeeth =  12;
				log.info("기어가 6단으로 변경되었습니다.");
				break;
			case 7:
				this.gearTeeth =  11;
				log.info("기어가 7단으로 변경되었습니다.");
				break;
			case 8:
				this.gearTeeth =  10;
				log.info("기어가 8단으로 변경되었습니다.");
				break;
			default:
				log.info("1~8단까지의 기어변경만 가능합니다");
		} // switch-case
		
	} // changeGear
	
	
	
	
	
	
} // end class
