package bicycle_polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LockImpl implements Lock {

	@Override
	public void lock() {
		log.info("자물쇠를 채웠습니다.");
	}//lock

	@Override
	public void unlock() {
		log.info("자물쇠를 풀었습니다.");
	}//unlock

}//end class
