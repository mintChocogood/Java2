package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class Child extends Parent{
	// 핵심포인트: 상속을 전제로, 부모객체에서 상속받은 메소드를 "재정의"합니다.
	
	@Override
	public void method1() {				// 재정의
		log.trace("method1() invoked.");
		
	} // 메소드1

	@Override
	public void method2() {				// 재정의
		log.trace("method2() invoked.");
	} // 메소드2

	public void method3() {				
		log.trace("method3() invoked.");
	} // 메소드3
	
} // end class
