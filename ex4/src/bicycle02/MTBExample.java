package bicycle02;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MTBExample {
	
	public static void main(String[] args) {
		
		IRideTheBicycle mtb = null;
		// 인터페이스 타입의 변수 선언
		
		mtb = new MTB();
		
		mtb.isLock(false);
		mtb.setSaddle(30);
		mtb.changeKickStand(true); 
		mtb.getOnOff(true); 
		mtb.holdHandle(0);
		mtb.stepOnOff(true);
		log.trace("--------------------------------------");
		log.trace("산을 오릅니다. 오르다가 등산객을 만났습니다.");
		mtb.hold();
		int soundSize = mtb.ringTheBell(true);
		log.trace("벨의 소리 크기는 {}Db 입니다.", soundSize);
		log.trace("등산객을 피했습니다.");
		log.trace("커브길에 도달했습니다.");
		mtb.holdHandle(1);
		mtb.holdHandle(0);
		log.trace("--------------------------------------");
		log.trace("산 정상에 도달하였습니다.");
		mtb.hold();
		mtb.stepOnOff(false);
		mtb.getOnOff(false);
		mtb.changeKickStand(false);
		mtb.isLock(true);
		log.trace("휴식.");
		log.trace("--------------------------------------");
		mtb.isLock(false);
		mtb.changeKickStand(true);
		mtb.getOnOff(true);
		mtb.stepOnOff(true);
		log.trace("--------------------------------------");
		log.trace("고라니를 만났습니다.");
		mtb.holdHandle(10);
		log.trace("핸들을 급하게 꺾다가 무게 중심을 잃고 넘어졌습니다.");
		mtb.getOnOff(false);
		log.trace("자전거를 점검합니다...");
		mtb.changeTire();
		log.trace("--------------------------------------");
		mtb.getOnOff(true);
		mtb.holdCenter();
		mtb.stepOnOff(true);
		log.trace("목적지 도착...");
		mtb.stepOnOff(false);
		mtb.getOnOff(false);
		mtb.changeKickStand(false);
		mtb.isLock(true);
		
	} // main

} // end class
