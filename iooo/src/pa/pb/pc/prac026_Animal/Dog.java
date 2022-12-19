package prac026_Animal;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class Dog extends Animal {
	
	
	public Dog() {
		log.trace("Default constructor invoked.");
		
		// 물려받은 필드의 값을 변경
		this.kind = "포유류";
	} // default constructor
	
	// 무조건 재정의 해야 함.
	@Override
	public void sound() {
		log.trace("sound() invoked.");
		log.info("\t+ 멍멍");
	} // sound

} // end class
