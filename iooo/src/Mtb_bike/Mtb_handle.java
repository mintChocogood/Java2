package Mtb_bike;

public interface Mtb_handle {
	default void direction(boolean right, boolean left) {
		if(right) {
			System.out.println("우측으로 방향을 전환합니다.");
		} if(left) {
			System.out.println("좌측으로 방향을 전환합니다.");
		} else {
			System.out.println("정상 주행합니다.");
		}
	} // 불린타입 디폴트 메소드
	
	
	
	
	
	
} // interface
