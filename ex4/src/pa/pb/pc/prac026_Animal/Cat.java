package prac026_Animal;

import lombok.extern.log4j.Log4j2;


@Log4j2
public
//	abstract
	class Cat extends Animal {
	
	public Cat() {
		log.trace("Default constructor invoked.");
		
		this.kind = "포유류";
	} // default constructor
	
//	 무조건 재정의 해야 함.
	@Override
	public void sound() {
		log.trace("sound() invoked.");
		log.info("\t+ 야옹");
	} // sound

} // end class
