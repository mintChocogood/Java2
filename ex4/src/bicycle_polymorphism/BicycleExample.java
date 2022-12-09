package bicycle_polymorphism;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@ToString
@Log4j2
public class BicycleExample {

	public static void main(String[] args) {
		
		Bicycle bicycle = new Bicycle();
		
		
		log.info("오늘은 즐거운 주말! 운동을 위해 산으로 자전거를 타러 갑니다.");
		bicycle.lock.unlock();
		bicycle.kickStand.upper();
		bicycle.move("보통속도로");
		log.info("=================================================================");
		log.info("산에서 등산객을 만났습니다. 어떻게 할까요?");
		bicycle.move("느린속도로");
		bicycle.bell.ring();
		log.info("=================================================================");
		log.info("지그재그 커브길 시작 ~ ");
		bicycle.turnleft1();
		bicycle.turnright1();
		bicycle.turnback1();
		log.info("=================================================================");
		log.info("드디어 정상에 도착했습니다!");
		bicycle.stop1();
		bicycle.kickStand.lower();
		log.info("잠깐 휴식을 취합니다.");
		log.info("=================================================================");
		bicycle.kickStand.upper();
		bicycle.move("빠른속도로");
		log.info("=================================================================");
		log.info("가다가 고라니와 마주쳤습니다.어떻게 할까요?");
		bicycle.turnleft1();
		log.info("방향을 틀다가 넘어지고 말았습니다...");
		log.info("확인결과, 타이어에 펑크가 났습니다.");
		bicycle.tire = new FixedTireImpl();
		log.info("=================================================================");
		log.info("타이어를 임시로 고친 후, 산 아래의 정비소를 향해 달립니다.");
		bicycle.move("빠른속도로");
		log.info("정비소에 도착하였습니다.");
		log.info("=================================================================");
		bicycle.tire = new NewTireImpl();
		bicycle.move("보통속도로");
		log.info("목적지에 도착하였습니다.");
		bicycle.stop1();
		bicycle.kickStand.lower();
		bicycle.lock.lock();
		log.info("=================================================================");
		

	}//main

}//end class
