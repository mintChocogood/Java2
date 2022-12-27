package prac022_Vehicle;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;


@ToString
@Log4j2
@NoArgsConstructor
public class Taxi extends Vehicle {
	
	
	@Override
	public void run() {
		log.trace("run() invoked.");
		
	} // run
	
} // end class
