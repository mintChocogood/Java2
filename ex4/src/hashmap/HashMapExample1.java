package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
@Log4j2
public class HashMapExample1 {

	// 핵심포인트: 실전에서 가장 많이 사용하는 
	// Thread-safe한 Map 컬렉션(HashMap)사용
	public static void main(String[] args) {
		// 1. Map 컬렉션 생성
		// 	  제네릭타입의 인터페이스 : Map<Key, Value>
		@Cleanup("clear")
		Map<String, Integer> map = new HashMap<>();
//		    ------  -------
//			 key      Value
		
//		---
		
		// 2. 요소객체를 (키, 값) 쌍으로 저장(키는 중복판정수행)
		map.put("리오넬메시", 86);	// 키 객체에 대해서, 이중판정알고리즘 수행
		map.put("한반두", 90);		// 키 객체에 대해서, 이중판정알고리즘 수행 (**)
		map.put("홍기서", 94);		// 키 객체에 대해서, 이중판정알고리즘 수행
		map.put("한반두", 95);  	// 동일키의 값을 변경하게 된다! 
									// (단순히 튕겨내는게 아니다)
		
		log.info("1. 총 Entry 수: " + map.size());
		log.info("2. map: {}" , map);
		
//		---
		
		// 3. 원하는 요소객체 얻기
		log.info("3. 한반두: {}" , map.get("한반두"));
		
//		---
		
		// 4. 객체를 하나씩 처리
		{
		@Cleanup("clear")	
		Set<String> keySet = map.keySet();	// ****
		
		for(String key : keySet) {
			int value = map.get(key);
			
			log.info("4. key: {}, value: {}", key, value);
		} // enhanced for
	} // User-defined block
		
//		---
		
		// 5. 요소객체 삭제
		map.remove("한반두");
		
		log.info("5. 총 Entry 수 : {}", map.size());
		log.info("6. map: {}" , map);
		
//		---
		
		// 6. 요소객체를 하나씩 처리
		// map.entrySet() 메소드 : Map 컬렉션의 모든 엔트리를 그대로 끄집어 내서,
		// 						   Set 컬렉션으로 담아서 반환
		{
		@Cleanup("clear")
		Set< Map.Entry<String, Integer> > entrySet = map.entrySet();
		
		for(Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			int val = entry.getValue();
			
			log.info("7. key: {}, value: {}", key, val);
		} // enhanced for
		} // User-defined block
		
//		---
		
		// 7. 자원해제 => 대체: 여기까지 중간에 예외가 발생하든, 안하든,
		//						반드시 Map 컬렉션이 clear될 수 있도록 해야한다
//		map.clear();			@Cleanup("clear") 사용
//		log.info("8. 총 Entry 수: {}", map.size());
		
//		---
		
		// 8. 요소객체의 값만 반환받아서 출력
		{
		@Cleanup("clear")
		Collection<Integer> values = map.values();
		
		for(int val :values) {		// if Iterable
			log.info("9. value: {}", val);
		} // enhanced for
		} // User-defined block
		
	} // main

} // end class
