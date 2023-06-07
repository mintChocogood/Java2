package Package1;

public class Car {
//	1. 필드
	private int speed;
	private boolean stop;
	
	// 2. 생성자
	public Car() {
		;;
	} // 기본 생성자

	public int getSpeed()throws Throwable {
		return speed;
	}

	public void setSpeed(int speed)throws Throwable {
		this.speed = speed;
	}

	public boolean isStop() throws Throwable {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	
} // end class
