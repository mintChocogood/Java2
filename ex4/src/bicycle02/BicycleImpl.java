package bicycle02;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BicycleImpl implements IRideTheBicycle {
	
	Tire tire = new Tire();
	KickStand kickStand = new KickStand();
	
	
	@Override
	public void getOn() { // 안장에 올라타다
		log.info("안장에 올라탔습니다.");
	} // getOn

	@Override
	public void getOff() { // 안장에서 내리다
		log.info("안장에서 내렸습니다.");
	} // getOff

	@Override
	public void stepOn() { // 페달을 밟다
		log.info("페달을 밟습니다.");
	} //stepOn

	@Override
	public void ring() { // 벨을 울리다
		log.info("벨을 울립니다.");
	} // ring

	@Override
	public void hold() { // 브레이크를 잡다
		log.info("브레이크를 잡습니다.");
	} // hold

	@Override
	public void turnRight(int menu) { // 핸들 우향
		log.info("핸들을 우측으로 {}만큼 돌립니다.", menu * 5);
	} // turnRight

	@Override
	public void turnLeft(int menu) { // 핸들 좌향
		log.info("핸들을 좌측으로 {}만큼 돌립니다.", menu * 5);
	} // turnLeft

	@Override
	public void holdCenter() { // 핸들 중앙
		log.info("핸들을 중앙으로 돌립니다.");
	} // holdCenter

	@Override
	public void changeTire() {
		this.tire = new Tire(27, 28, "MTB");
		log.info("타이어를 교체했습니다.");
	} // changeTire

	@Override
	public void changeKickStand(boolean onKickStand) {
		if(onKickStand) {
			this.kickStand.upper(); // 지지대 접기	
		} else {
			this.kickStand.lower(); // 지지대 세우기
		} // if-else
	} // changeKickStand

	@Override
	public void stepOff() {
		log.info("페달에서 발을 뗍니다.");
	} // stepOff

	@Override
	public void isLock(boolean lock) {
		if(lock) {
			log.info("자전거의 잠금 장치를 잠금니다.");
		} else {
			log.info("자전거의 잠금 장치를 해제합니다.");
		} // if-else
	} // isLock

	@Override
	public void setSaddle(int height) {
		if(height < MIN_SADDLE_HEIGHT) {
			log.info("안장의 높이를 {}에 맞췄습니다.", ISaddle.MIN_SADDLE_HEIGHT);
		} else if(height > MAX_SADDLE_HEIGHT) {
			log.info("안장의 높이를 {}에 맞췄습니다.", ISaddle.MAX_SADDLE_HEIGHT);
		} else {
			log.info("안장의 높이를 {}에 맞췄습니다.", height);
		} // if-else
	} // setSaddle

} // end class
