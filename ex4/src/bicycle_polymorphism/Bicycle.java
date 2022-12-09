package bicycle_polymorphism;





import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ToString
@NoArgsConstructor
public class Bicycle {
	
	String type;
	String color;
	
	String degreeOfPedaling;	
			//페달링정도(빠른속도/보통속도/느린속도)
	
	
	//부품객체 조립
	Tire tire = new TireImpl(); 
	Pedal pedal = new PedalImpl();
	Bell bell = new BellImpl();
	KickStand kickStand = new KickStandImpl();
	Lock lock = new LockImpl();
	Handle handle = new HandleImpl();
	Brake brake = new BrakeImpl();
	Chain chain = new Chain();
	
	

	public void move(String degreeOfPedaling) {
		log.trace("move() invoked.");
		pedal.stepOn(degreeOfPedaling);
		chain.chainRotate();
		tire.roll();
		log.info("주행 중입니다.");
	}//move
	
	public void turnleft1() {
		log.trace("turnleft1() invoked.");
		handle.turnleft();
		log.info("방향을 왼쪽으로 돌립니다.");
	}//turnleft1
	
	public void turnright1() {
		log.trace("turnright1() invoked.");
		handle.turnright();
		log.info("방향을 오른쪽으로 돌립니다.");
	}//turnright1
	
	public void turnback1() {
		log.trace("turnback1() invoked.");
		handle.turnback();
		log.info("방향을 원래대로 돌립니다.");
	}//turnback1
	
	public void stop1() {
		log.trace("stop1() invoked.");
		brake.stop();
		log.info("정지합니다.");
	}//stop1
	
	
	
	
	
	

}//end class
