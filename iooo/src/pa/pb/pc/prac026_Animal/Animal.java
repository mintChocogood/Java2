package prac026_Animal;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public 
	abstract
	class Animal {
	
	public String kind;
	
	
	public void breathe() {
		log.trace("breathe() invoked.");
		
	} // breathe
	
	// =====================================
	// 추상메소드란?
	// =====================================	
	// 구현block이 없이 메소드 선언부만 있는 경우를 의미
	
	// 강제규격으로 자식클래스에서, 반드시 메소드 재정의(Overriding) 해야 합니다.
	public abstract void sound();	// abstract메소드는 ;대신 {}를 넣으면 오류
	
} // end class
