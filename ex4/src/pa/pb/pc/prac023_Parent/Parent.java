package prac023_Parent;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;


@ToString
@Log4j2
@NoArgsConstructor
public class Parent {
	public String field1;
	
	
	public void method1() {
		log.trace("method1() invoked.");
	} // method1
	
	public void method2() {
		log.trace("method2() invoked.");
	} // method2

} // end class
