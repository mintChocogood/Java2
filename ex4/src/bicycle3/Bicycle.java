package bicycle3;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class Bicycle implements IBicycle {
	String model;  // 자전거의 모델
	int speed;     // 자전거의 현재 속력
	int gearLevel; // 자전거의 현재 기어 단수
	boolean lock = true;	// 잠금상태(잠긴 상태가 true)
	boolean stand = true;	// 지지대상태(세워진 상태가 true)
	Pedal pedal = new Pedal();	// 페달
	Gear gear = pedal.gear;		// 기어
	Wheel wheel = gear.wheel;	// 바퀴
	
			
	public void countTime(int averageSpeed, int distance) {
		int moveLength=0;
		int minute = 0;
		while ((distance*1000) > moveLength) {
			int meterPerMinute = averageSpeed*1000/60;
			moveLength += meterPerMinute;
			minute++;
		} // while
		log.trace(minute + "분 후 도착예정입니다.");
		
//		log.trace(minute + "분 후, " + distance +"km 떨어진 목적지에 도착하였습니다.");
	} // countTime-1
	
	public void countTime(int distance) {
		int moveLength=0;
		int minute = 0;
		while ((distance*1000) > moveLength) {
			moveLength += wheel.meterPerMin;
			minute++;
		} // while
		System.out.println(minute + "분 후, " + distance +"km 떨어진 정비소에 도착하였습니다.");
	} // countTime-2
	
	public void repairWheel() {
		log.trace("자전거의 바퀴를 간이수리합니다.");
		wheel = new FixedWheel();
	} // repairWheel
	
	public void changeWheel() {
		log.trace("바퀴를 교체합니다.");
		wheel = new Wheel();
	} // changeWheel
//	---------------------------------
	
	public void changeGearBody() {
	      log.trace("changeGear() invoked.");
	      pedal.changeGearBody();
	   } // changeGearBody
	   
	   public void changeGearBody(int gearLevel) {
	      log.trace("changeGear() invoked.");
	      pedal.changeGearBody(gearLevel);
	   } // changeGearBody(int)
	   
	   public void changeGear8thBody() {
	      log.trace("changeGear8th() invoked.");
	      pedal.changeGear8thBody();
	   } // changeGear8thBody
	   
	   public void changeGear8thBody(int gearLevel) {
	      log.trace("changeGear8th() invoked.");
	      pedal.changeGear8thBody(gearLevel);
	   } // changeGear8thBody(int)
	
//	-------------------------------
	
	@Override
	public void ring() {
		log.info("자전거 벨을 울립니다.");
	} // ring(IBell)
	
	@Override
	public void turnLeft(double menu) {
		log.info("핸들을 좌측으로 {}만큼 돌립니다.", menu);
	} // turnLeft(IHandle)

	@Override
	public void turnRight(double menu) {
		log.info("핸들을 우측으로 {}만큼 돌립니다.", menu * 5);
	} // turnRight(IHandle)

	@Override
	public void holdCenter() {
		log.info("핸들을 중앙으로 둡니다.");
	}
	
	
	@Override
	public void kickStand() {
//		log.trace("kickStand() invoked.");
		
		this.stand = !this.stand;
		
		if(this.stand) {
			log.info("자전거 지지대를 내립니다.");
		} else {
			log.info("자전거 지지대를 올립니다.");
		} // if-else
		
	} // kickStand(IKickStand)

	@Override
	public void lock() {
//		log.trace("lock() invoked.");
		
		this.lock = !this.lock;
		
		if(this.lock) {
			log.info("자전거의 자물쇠를 잠궜습니다.");
		} else {
			log.info("자전거의 자물쇠를 풀었습니다.");
		} // if-else
		
	} // lock(ILock)

	@Override
	public void moveSlow() {
		pedal.pedalRPM = 50;
		pedal.start();
		
	} // moveSlow(IPedal)

	@Override
	public void moveNormal() {
		pedal.pedalRPM = 120;
		pedal.start();
		
	} // moveNormal(IPedal)

	@Override
	public void moveFast() {
		log.info("빠른속도로 주행합니다");
		pedal.pedalRPM = 140;
		pedal.start();
		
	} // moveFast(IPedal)
	
	@Override
	public void stop() {
//		log.trace("stop() invoked.");
		
		pedal.pedalRPM = 0;
		log.info("자전거를 정지합니다.");
		
	} // stop(IBrake)

	@Override
	public void changeGear(int gearLevel) {
		log.trace("기어를 변경합니다.");
		
		gear.changeGear(gearLevel);
		
	} // changeGear(IGear)

	@Override
	public void move() {
		log.trace("자전거 주행을 시작합니다.");
		
		if(stand!=true&&lock!=true) {
			this.moveNormal();
		} else {
	         log.info("자전거를 정상적으로 운행할 수 없는 상태입니다.");
	         if(stand==true) {
	            log.info("지지대를 풀어주세요.");
	         } // if
	         if(lock==true) {
	            log.info("자물쇠를 풀어주세요.");
	         } // if
	         System.exit(0);
	         
	      }// if-els
		
	} // start(IBicycle)

	@Override
	public void Saddle(int a) {
		log.trace("안장의 높이를" + a + "만큼 조절하였습니다.");
	}
	
	@Override
	public void stepOff() {
		log.info("페달에서 발을 뗍니다.");
	} // stepOff
	
	@Override
	public void stepOn() {
		log.info("페달에 발을 올립니다.");
	} // stepOff
	
	@Override
	public void getOn() {
		log.info("자전거를 탑니다.");
	}
	
	public void getOff() {
		log.info("자전거에서 내립니다.");
	}
	
	
} // end class
