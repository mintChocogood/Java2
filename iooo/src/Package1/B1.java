package Package1;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class B1 {

	// 같은 패키지에 있는 B1 클래스가, 모든 멤버가 protected인 A1 클래스의
	// 멤버를 아래와 같이 사용합니다. 어떻게 사용하는지 잘 봅시다!!
	
	// 핵심포인트: protected == default + alpha 중, 이번 예제는 "default"입니다.
	public void method() {
		// A1 클래스는 public 이기 때문에, 변수/필드의 타입으로 어디서든 사용가능
		A1 a = new A1();		// 생성자 호출 OK: 같은 패키지에 있으니까!
		
		a.field = "value";		// 필드 호출 OK: 같은 패키지에 있으니까!
		a.method();				// 메소드 호출OK: 같은 패키지에 있으니까!
	} // 메소드
	
} // end class
