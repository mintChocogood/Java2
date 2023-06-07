package Package1;

public class CellPhone {
	// 1. 필드 (고유속성)
	String model;
	String color;
	
	// 2. 생성자
	public CellPhone(String model, String color) {
		System.out.println("셀폰 :: 기본생성자 호출됨");
		
		this.model = model;
		this.color = color;
	} // 기본 생성자
	
	// 3. 메소드
	void powerOn() {System.out.println("전원을 켭니다"); }
	void powerOff() {System.out.println("전원을 끕니다"); }
	void bell() {System.out.println("벨이 울립니다"); }
	void sendVoice(String message) {System.out.println("자신: " + message); }
	void receiveVoice(String message) {System.out.println("상대방: " + message);}
	void hangUp() {System.out.println("전화를 끊습니다");}
	
	
} // end class
