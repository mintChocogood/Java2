package pa.pb.pc;


// 1st.member : static final 상수 선언
// 2nd.member : 추상메소드 선언
// 3rd.member : default 메소드 (기본 메소드)
// 4th.member : static 메소드 (공용 메소드)
// 5th.member : private 메소드 ( 인스턴스/정적 )
public interface RemoteControl {
	
	public static final int 최대_볼륨 = 10;
	public static final int 최소_볼륨 = 0;
	
	
	// 추상 메소드 : 자식클래스에서 반드시 재정의시킬 강제규격
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	
	// 디폴트 메소드
	public default void setMute(boolean mute) {		// ** 인스턴스 메소드 **
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		} // if else
//		인스턴스메소드1();
//		인스턴스메소드2();
//		인스턴스메소드3();
		
		
		
	} // setMute
	
	// 정적 메소드
	public static void changeBattery() { 			// 정적 메소드
		System.out.println("건전지를 교환합니다.");
		
//		RemoteControl.스태틱메소드1();
//		RemoteControl.스태틱메소드2();
//		RemoteControl.스태틱메소드3();
	} // changeBattery
	
	// private 인스턴스 메소드
	// lengthy(기다란) default 구현을 하위메소드로 쪼개서 구현할 수
	// 있도록 추가된 멤버
	private void 인스턴스메소드1() {;;} // 인스턴스 메소드1
	private void 인스턴스메소드2() {;;} // 인스턴스 메소드2
	private void 인스턴스메소드3() {;;} // 인스턴스 메소드3
	
	// private 정적 메소드
	// lengthy(기다란) static 구현을 하위메소드로 쪼개서 구현할 수
	// 있도록 추가된 멤버
	private static void 스태틱메소드1() {;;} // 스태틱메소드1
	private static void 스태틱메소드2() {;;} // 스태틱메소드2
	private static void 스태틱메소드3() {;;} // 스태틱메소드3
} // end interface
