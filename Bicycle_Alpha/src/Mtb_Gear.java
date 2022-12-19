import bicycle3.Wheel;

public class Mtb_Gear {
	int gearTeeth;				// 톱니의 개수
	int powerTransmitted;		// 전달되는 동력
	Wheel wheel = new Wheel();	// 바퀴
	
	
	public Gear() {
		this.gearTeeth = 17;
	} // default constructor
	
	
	public void start() {
		log.trace("start() invoked.");
		
		wheel.wheelRotation = this.powerTransmitted/this.gearTeeth;
//		log.info("현재 기어수: {}", this.gearTeeth);
		wheel.start();
	} // start
	
	public void changeGear(int gearLevel) {
		log.trace("changeGear() invoked.");
		
		switch(gearLevel) {
			case 1:
				this.gearTeeth =  23;
				log.info("기어가 1단으로 변경되었습니다.");
				break;
			case 2:
				this.gearTeeth =  20;
				log.info("기어가 2단으로 변경되었습니다.");
				break;
			case 3:
				this.gearTeeth =  17;
				log.info("기어가 3단으로 변경되었습니다.");
				break;
			case 4:
				this.gearTeeth =  15;
				log.info("기어가 4단으로 변경되었습니다.");
				break;
			case 5:
				this.gearTeeth =  14;
				log.info("기어가 5단으로 변경되었습니다.");
				break;
			default:
				log.info("1~5사이의 값을 입력해주세요");
		} // switch-case
		
	} // changeGear
}
