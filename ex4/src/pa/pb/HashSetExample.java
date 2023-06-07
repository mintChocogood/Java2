package pa.pb;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class HashSetExample {

	// 핵심포인트: Set<E> 인터페이스의 구현클래스로, HashSet의 용법을 알자!
	public static void main(String[] args) {
		// 1. Set 컬렉션 생성 using HashSet(구현클래스)
		Set<String> set = new HashSet<>(); 		// 다형성-1
		
		// 2. 구슬주머니에, 구슬을 넣자!
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");			// 중복은 허용하지 않음
		set.add("iBATIS");
		
		log.info("set: {}", set);
		
//		---
		
		int size = set.size();
		log.info("총 구슬수: {}" , size);
		
//		---
		
		// 2. 순회에 사용되는 Iterator 제네릭 인터페이스 타입의 객체를 획득
		Iterator<String> iterator = set.iterator();		// 다형성-1
		log.info("2. iterator: {}", iterator.getClass().getName());
		
		// 3. 순회(Iterator 객체를 이용한) ==> 낮은 버전의 자바에서 사용하던 순회방식
		// 	  지금은 enhanced for 문으로 대체됨
		while(iterator.hasNext()) {	// 다음으로 얻을 구슬이 있습니까!? (hasNext)
			String element = iterator.next();	// 있다면 주세염!(next)
			
			log.info("element: {}", element);
		} // while
		
//		---
		
		// 4. 구슬 주머니에서 구슬을 삭제
		set.remove("JDBC");				// "JDBC" 문자열(구슬)이 있다면, 삭제하라!
		set.remove("iBATIS");			// Ditto
		
		log.info("총 객체수: {}" , set.size());
		
//		---
		
		// 5. enhanced for 문을 이용한 순회 (현재의 순회방법)
//		for(String element : set) {
//			log.info("\t- element: {}", element);
//		} // enhanced for
		
		set.forEach(log::info);
//		---
		
		// 6. 자원객체 해제
		set.clear();
		
		if(set.isEmpty()) {
			log.info("비었읍니다.");
		} // if
		
		
	} // main

} // end class
