
public class SingletonEx1 {
public static SingletonEx1 싱글톤;
	
	
	static {
		싱글톤 = new SingletonEx1();
	} // 스태틱 이니셜라이져
	
	// 핵심-1
	// 외부 클래스에서 임의로 객체를 생성하지 못하도록,
	// private 생성자로 선언 -> new 생성자(); 구문이 성립하지 못함! (왜? 생성자가 안보이니까)
	public SingletonEx1() {
		// 호출코드
	} // 기본생성자
	
	// 클래스의 필드인 싱글톤의 값을 반환
	 public static SingletonEx1 getInstance() {
		 // 호출코드
		 return SingletonEx1.싱글톤;
	 } // getInstance
	
} // end class


