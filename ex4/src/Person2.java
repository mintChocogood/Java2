// final - (1) 필드 (2) 매개변수 (3) 지역변수 | (4) 타입선언부 (5) 메소드 (***)
public class Person2 {
	// 이 클래스에서 생성하는 모든 사람은 국적이 한국인이어야 할 때!
	final String nation = "Korea";
	final String ssn;
	String name;
	final int age;
	// 매개변수도 지역변수로 간주된다!!
	public Person2(final String ssn, final String name, final int age) {
		this.ssn = ssn;
		this.name = name;
		this.age = age;
		
//		this.age = age;  // 지역변수
//		age = 18;
	} // 기본생성자
	
	public final String getName() {
		return this.name;
	} // getName 메소드
	
	
	
} // end class
