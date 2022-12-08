package prac023_Parent;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;


@ToString
@Log4j2
@NoArgsConstructor
public class Child extends Parent {
	public String field2;					// 자식만의 필드 선언
	
	
	public void method3() {
		log.trace("method3() invoked.");	// 자식만의 메소드 선언
		
	} // method3
	
} // end class
