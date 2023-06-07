package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class RemoteControlExample {

	// 핵심포인트: 다형성 구현을 인터페이스로 하자! => Loosely Coupled 관계를 만들 수 있고
	// 좀 더 유연한 클래스 설계가 가능합니다.
	// 그래서, 실전에서 다형성 구현은 모두 인터페이스 기반으로 합니다.
	public static void main(String[] args) {
		
		RemoteControl rc;			// 부모(인터페이스) 타입의 참조변수
		
		// 부모타입(인터페이스)의 참조변수에, 자식객체(구현객체)를 생성/대입
		rc = new Television();		// 다형성-1 : 자동형변환(Promotion)
		log.info("1. rc: " + rc);
		
		rc.turnOn();				// 다형성-2 : 대입된 자식(구현)객체가 오버라이딩
		rc.setVolume(3);
//		==================
		
		rc = new Audio();			// 다형성-1 : 자동형변환(Promotion)
		log.info("2. rc: " + rc);
								
		rc.turnOn();				// 다형성-2 : 대입된 자식(구현)객체가 오버라이딩
		
		rc = new Television();
		rc.setVolume(5);
		rc.setMute(false);
		RemoteControl.changeBattery();
		
	}	// main

}	// end class
