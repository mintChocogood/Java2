package prac022_Vehicle;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;


@ToString
@Log4j2
@NoArgsConstructor
public class Vehicle {
	
	
	public void run() {
		log.info("run() invoked.");
		
		log.info(" \t+ vehicle: {}", this);
	} // run
	
} // end class
