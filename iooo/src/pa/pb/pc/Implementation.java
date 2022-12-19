package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class Implementation implements InterfaceC{		// 물론 다중상속(Implements)도 가능함

	@Override
	public void 메소드A() {	// InterfaceA의 규격이 상속으로 내려옴
		log.trace("메소드A() 호출");
	}	// 메소드A

	@Override
	public void 메소드B() { // InterfaceA의 규격이 상속으로 내려옴
		log.trace("메소드B() 호출");
	} 	// 메소드B

	@Override
	public void 메소드C() { // InterfaceA의 규격이 상속으로 내려옴
		log.trace("메소드C() 호출");
	}	// 메소드C

} // end class
