package bicycle_polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TireImpl implements Tire {
	
	String color;
	int wornOutCondition; //자전거 마모상태 --instance field  
	int airPressure; //공기압 정도 -- instance field


	@Override
	public void roll() {
		log.trace("roll() invoked.");
		log.info("기본타이어로 굴러갑니다.");
	}//roll

}//end class
