package pa.pb;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@NoArgsConstructor
// 자바 표준에서는, 소위 "자원객체"가 되려면,
// 반드시 java.lang.Autoloseable 인터페이스를 구현해야 한다!!(**조건**)

// 개발자가 직접 만든 "자원객체"를 생성할 "자원클래스" 선언
public class UserResource1
	implements AutoCloseable{

	@Override
	public void close() {
		log.trace("close() 실행됨.");
		
	} // close
	
	
	
	
	
} // end class