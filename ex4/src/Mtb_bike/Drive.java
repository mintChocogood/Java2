package Mtb_bike;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@NoArgsConstructor
@Log4j2
public class Drive {

	public static void main(String[] args) {

		Bike b = new Bike();
		log.trace("즐거운 주말에 운동을 위해 뒷산에 산악 자전거를 타고 "
				+ "타지역으로 가려고 합니다");
		
		b.distance();
		
//		체크리스트
		
		b.lock_Off();
		b.pedal_slow();
		log.trace("뒷산으로 향합니다");
		b.pedal_nomal();
		log.trace("비탈길을 만나 기어를 1단으로 변경합니다.");
		b.Gear_Stage(1);
		log.trace("앞서 가는 사람이 보입니다.");
		b.brake();
		b.pedal_slow();
		b.timeTaken(20, 20);
	} // main

} // end class
