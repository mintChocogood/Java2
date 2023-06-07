package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class MyClassB implements MyInterface {

	@Override
	public void 메소드1() {
		log.trace("메소드1() 실행됨");
	} // 메소드1

	// 디폴트 메소드도 상속된다! (***)
	// 더불어 마음에 안들면, 아래와 같이 재정의가 가능하다!!! (***)
	// 원래 있었던 "default"란 키워드가 없어짐(***)
	@Override
	public void 메소드2() {
		log.trace("메소드2() 실행됨");
	}	// (디폴트)메소드2
	
	// 디폴트 메소드를 아예 추상메소드로 만들어 버릴 수 도있음
	
	
	
	
} // end class
