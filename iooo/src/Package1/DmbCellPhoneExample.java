package Package1;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// 1. DmbCellPhone 객체 생성(***)
		DmbCellPhone phone = new DmbCellPhone("모토로라", "검은색", 5);
		
		// 2. CellPhone으로부터 상속 받은 필드
		System.out.println("모델명: " + phone.model);
		System.out.println("색깔: " + phone.color);
		
		// 3. DmbCellPhone의 필드
		System.out.println("채널: " + phone.channel);
		
		// 4. CellPhone으로부터 상속 받은 메소드 호출
		phone.powerOn();
		phone.bell();
		phone.sendVoice("ㅎㅇ");
		phone.receiveVoice("ㅎㅇㅎㅇ");
		phone.sendVoice("피방 ㄱ?");
		phone.hangUp();
		phone.powerOff();
		
		// 5. DmbCellPhone의 메소드 호출
		phone.turnOnDmb();
		phone.changeChannelDmb(1);
		phone.turnOffDmb();
		
		// 넘모 졸려
		
	} // main

} // end class
