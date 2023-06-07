package pa.pb;

import lombok.extern.log4j.Log4j2;

// 공용 클래스(다른 외부 클래스에서 공용으로 사용되는 메소드를 가지는 클래스)
// Common Class
@Log4j2
public class Util<T> {

	
	// 핵심포인트: Generic Method
	
	// 		  <타입파라미터선언부> 리턴타입
	//			   ---------- 	  -----------
	public static     <T> 			 Box<T> 	      boxing(Integer t)      {
			log.trace("boxing({}) 실행됨.", t);
			
//			Box<T> box = new Box<T>();
			Box<T> box = new Box<>();
			
//			box.set(t);
			
			return box;
		} // boxing
	
	
	
	
	
	
	
} // end class
