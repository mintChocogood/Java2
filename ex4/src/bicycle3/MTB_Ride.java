package bicycle3;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MTB_Ride {

	public static void main(String[] args) {
		Bicycle mtb = new MTB();
	
		
		// 출발 전
		mtb.getOnOff(false);
		log.info("오늘은 즐거운 주말! 운동을 위해 산으로 자전거를 타고 넘어가 20km 거리에있는 목적지로 향합니다.");
		log.info("목적지까지 얼마나 걸리는지 계산합니다.");
		
		mtb.countTime(18, 20); // 목적지 시간 계산(평균시속, 목적지의 거리(km)
		mtb.Saddle(5);
		mtb.lock();			// lock과 kickStand 둘중 하나라고 풀려있지 않다면 운행할수 없음
		mtb.kickStand();	// 모두가 풀려있어야함
		mtb.getOn();		// 자전거에 올라탐
		mtb.stepOn();		// 페달에 발을 올림
		mtb.move();		// 일반속도로 운행시작
		
		// 언덕 오르기
		log.info("언덕을 올라 기어를 변경합니다.");
		
		mtb.changeGear(2);	// 단수 입력
		mtb.moveNormal();	// 현재속도 변경
		
		// 등산객을 만남
		log.info("등산객을 만나 속도를 줄입니다.");
		mtb.moveSlow();		// 현재속도 변경
		mtb.ring();			// 자전거벨 울리기
		log.info("다시 원래 속도로 변경합니다.");
		mtb.moveNormal();	// 현재속도 변경
		
		// 커브길
		log.info("커브길에서 방향을 전환합니다.");
		mtb.turnRight(1.3);		// 방향을 전환합니다
		
		// 정상도착
		log.info("정상에 도착하여 잠시 휴식을 취합니다.");
		mtb.stop();
		mtb.kickStand();
		
		// 휴식
		log.info("휴식 후, 다시 출발합니다.");
		mtb.kickStand();
//		mtb.move();
		mtb.moveSlow();			// 내리막에선 천천히
		mtb.changeGear(4);		// 기어는 고단으로 변경
		
		// 돌뿌리를 밟아 타이어가 펑크... 수리하여 재운행
		log.info("돌뿌리를 밟아 타이어가 터졌습니다. 긴급조치를 합니다.");
		mtb.stop();
		mtb.repairWheel();  // 타이어 객체 변경
		mtb.move();
		mtb.changeGear(5);
		mtb.moveFast();		// 정비소까지 빠르게 이동
//		mtb.countTime(3);	// 정비소까지의 거리
		
		// 정비소 도착 타이어 교환
		log.info("정비소에 도착하여 타이어를 교환합니다.");
		mtb.stop();
		mtb.changeWheel();  // 타이어 객체 변경
		mtb.move();
		
		// 목적지 도착
		log.info("목적지에 도착하였습니다.");
		mtb.stop();
		mtb.getOff();
		mtb.stepOff();
		mtb.kickStand();
		mtb.lock();
		
	} // main

} // end class
