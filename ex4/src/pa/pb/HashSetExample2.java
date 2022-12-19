package pa.pb;

import java.util.HashSet;
import java.util.Set;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class HashSetExample2 {

	public static void main(String[] args) {
		// 비어있는 구슬주머니 생성(초기용량: 10)
		Set<Member> set = new HashSet<>();		// Set 컬렉션 생성
		
		// 구슬주머니에 구슬(회원객체) 추가
		set.add(new Member("홍길동", 30));		// 이름, 나이
		set.add(new Member("홍길동", 31));		// Ditto
		
//		log.info(set.getClass().getName());
		log.info(set);
		log.info("총 객체수: {}", set.size());
		
	} // main

} // end class
