package prac025_AbstractClass;

import lombok.extern.log4j.Log4j2;

// 핵심포인트: 추상 클래스(abstract class)에 대해서 알자!!!
// 추상클래스란?
//	(1) 인스턴스를 직접 생성할 수 없습니다(즉, new연산자 사용불가!)
//	(2) "같은 종류"의 객체들의 공통의 성질(즉, 속성과 메소드)을
//		가지고 있습니다.	=> 즉, a kind of something (어떤 종류를 의미)
//		=> 여러객체의 공통의 성질을 추출하는 행위 => 추상화
//	(3) 주로 상속관계에서 "부모타입"으로 사용됩니다.
//	(4) 클래스 선언부에 "abstract" 이란 키워드(한정자, Qualifier)를
//		붙입니다.
//	(5) "추상메소드"(abstract method)를 멤버로 가질 수 있습니다.
//	(6) 다형성에서, "규격"의 역할을 수행합니다.
//		이때 규격은 "추상메소드"(abstract method)를 통해서, 자식클래스에
//		"강제로" 메소드 재정의(overriding)하게 할 수 있습니다.
//	(7) 하지만, 추상메소드(abstract method)가 하나도 없더라도,
//		추상클래스로 선언가능합니다!
//	(8) 자식클래스로부터, 자식인스턴스 생성시, 여러분도 이미 아시다시피,
//		"부모없는 자식없다"라는 대전제로, 힙 영역에는 이 추상클래스의
//		인스턴스가 먼저 생성 및 초기화되어야 하므로, 자식클래스의 생성자
//		의 "가장 첫 줄"에, 이 부모역할을 하는 추상 클래스의 생성자를 호출
//		해줘야 합니다(Using super(...))

@Log4j2
public abstract class Phone {	// "추상" 클래스
	public String owner;
	
	
	public Phone(String owner) {
		log.trace("constructor({}) invoked.", owner);
		
		this.owner = owner;
	} // constructor

	// 아래에 선언된 모든 메소드는, 모든 종류의 전화기라면,
	// 당연히 가지는 공통의 행위(기능)입니다!! (***)
	public void turnOn() {
		log.trace("turnOn() invoked.");
		log.info("\t+ this: {}", this);
	} // turnOn
	
	public void turnOff() {
		log.trace("turnOff() invoked.");
		log.info("\t+ this: {}", this);
	} // turnOff
	
} // end class
