package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class MyClassA implements MyInterface{

	@Override
	public void 메소드1() {
		log.trace("메소드1() 실행됨2.");
	} // 메소드1

	
	
} // end class
