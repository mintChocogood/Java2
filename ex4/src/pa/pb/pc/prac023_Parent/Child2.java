package pa.pb.pc.prac023_Parent;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;


@ToString
@Log4j2
@NoArgsConstructor
public class Child2 extends Parent {
	public String field3;					// 자식만의 필드 선언
	
	
	public void method4() {
		log.trace("method4() invoked.");	// 자식만의 메소드 선언
		
	} // method4
	
} // end class
