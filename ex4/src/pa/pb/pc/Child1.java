package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class Child1 extends A1 {

	@Override
	public void instatnceMethod() {
		log.trace("인스턴스 메소드() 호출2");
		log.info("특수한 기능 수행");
	} // 인스턴스 메소드
	

} // end class
