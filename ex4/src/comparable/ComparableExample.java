package comparable;

import java.util.Iterator;
import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ComparableExample {

	public static void main(String[] args) {
		// 1. 이진트리 기반의 Set 컬렉션 생성 - 요소타입은 우리가 만든 클래스
		TreeSet<Person> set = new TreeSet<Person>();
		
		// 2. 요소추가시, 아래의 2개 동작수행 in add() 메소드:
		//    (1) Comparable 타입으로 형변환 (다형성-1) => if 오류, ClassCastException 발생
		//    (2) Comparable 인터페이스의 compareTo() 메소드 호출하여,
		//        대소 확정하고, 이진트리 구성
		set.add(new Person("홍길동", 45));
		set.add(new Person("김자바", 25));
		set.add(new Person("박지원", 31));
		
		log.info("1. set: {}", set);
		set.forEach(log::info);
		
//		Iterator<Person> iter = set.iterator();
	} // main

} // end class
