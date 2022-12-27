package prac022_Vehicle;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor
public class Driver {

	
	// 이 메소드 내에서, "매개변수의 다형성" 발현
	public void drive(Vehicle vehicle) { // 매개변수의 다형성-1
		log.trace("drive({}) invoked.", vehicle);
		
		vehicle.run();	// 매개변수의 다형성-2 <=== ***
	} // drive

} // end class
