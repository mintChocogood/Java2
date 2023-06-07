package Package1;


// DMB(지상파 방송) 을 수신할 수 있는 휴대폰 클래스 선언
// 이 DMB휴대폰은, CellPhone의 여러종류 중에 하나.
public class DmbCellPhone extends CellPhone {
	// 1. 자식클래스의 필드
	int channel; 				// 지상파방송채널
	
	
	// 2. 자식클래스의 생성자
	DmbCellPhone(String model, String color, int channel) {
		
		// 부모객체가 우선해서 먼저 초기화 되어야 하기 때문에 첫번째 문장으로
		// 나와야 함
		super(model, "하늘색"); 	// 부모클래스에 매개변수가 없다면 기본적으로 컴파일러가 부모클래스를 
					// 호출해 주지만 매개변수가 있다면 불가능 하기에 생략 불가능
					// 부모클래스의 생성자 호출 = 부모인스턴스가 초기화됨
		System.out.println("디엠비셀폰 생성자 호출");
		
		
		// 부모로부터 상속받은 필드를 초기화
		this.model = model;				// 부모객체의 필드를 초기화 하는것이 아님
		this.color = color;				// this.은 부모로부터 물려받은 객체를 초기화				
//		super.color = color;			// super.은 부모개체의 메소드를 호출
		this.channel = channel;
	} // 생성자
	
	
	// 3. 메소드
	void turnOnDmb() {			// 지상파방송수신 켜기
		System.out.println("디엠비셀폰 켜기 호출");
	} // 턴온디엠비
	
	void changeChannelDmb(int channel) {
		System.out.println("디엠비 채널변경 호출");
		this.channel = channel;
	} // 체인지 채널 디엠비
	
	void turnOffDmb() { 		// 지상파방송수신 끄기
		System.out.println("디엠비 끄기 호출");
	} // 턴오프 디엠비
} // end class
