package prac025_AbstractClass;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class SmartPhone extends Phone {
	double price;		// 가격
	
	public SmartPhone(String owner, double price) {
		super(owner);  // 부모클래스의 생성자를 가장 첫줄에서 찾아
		
		log.trace("constructor({}, {}) invoked.", owner, price);
		this.price = price;	//
	} // constructor
	
	public void internetSearch() {
		log.trace("internetSearch() invoked.");
		
		// 상속받은 메소드 호출이 아니라!!! (***)
		// 직접 부모객체의 메소드를 호출한 것임!!! (***)
		super.turnOff();  // super: 무조건 객체의 주소를 가짐
	} // internetSearch
	
	@Override
	public void turnOff() {
		log.trace("smartTurnOff() invoked.");
	}
	

} // end class
