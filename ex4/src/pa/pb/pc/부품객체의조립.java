package pa.pb.pc;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class 부품객체의조립 {

	public static void main(String[] args) {

		
		자동차 car = new 자동차("현대자동차", "흰색", 1600);
		log.info("1. car: {} ", car);
		
		car.주행();
		
		
		
		//  부품인 타이어를 교체합니다. 즉, 다른 타이어 부품객체를
		// 완성차에 조립합니다. 물론, 다형성을 이용합니다
		car.tire = new 한국타이어();		// 다형성-1 : 부품객체의 교체 및 조립
		car.주행();							// 다형성-2
		
		car.tire = new 금호타이어();		// 다형성-1
		car.주행();							// 다형성-2
		
		car.tire = new 미쉐린타이어();		// 다형성-1
		car.주행();							// 다형성-2
	} // main

} // end class
