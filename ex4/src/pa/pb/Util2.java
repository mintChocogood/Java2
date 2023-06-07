package pa.pb;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Util2 {
	
	// 제네릭 메소드(제한된 타입파라미터 T를 가지는)
	public static <T extends Number> int compare(T t1, T t2) {
		log.trace("compare({}, {}) 실행됨" , t1, t2);
		log.debug("\t+ T: {}" , t1.getClass());
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		// 두 객체를 비교해서, 아래와 같이 크기 비교값을 반환하도록 이미 결정
		// if v1 < v2, return 음수값 반환(기본적으로,-1 반환)
		// if v1 == v2, return 0
		// if v1 > v2, return 양수값(기본적으로, +1 반환
		return Double.compare(v1, v2);
		
		
	} // compare
	
} // end class
