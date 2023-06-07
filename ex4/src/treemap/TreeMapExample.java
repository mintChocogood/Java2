package treemap;

import java.util.Map;
import java.util.TreeMap;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TreeMapExample {
		// 핵심포인트: 키/값을 쌍으로 저장하는 Map 컬렉션으로, 키값을 기준으로
		//			   이진트리를 구성하여, 자동정렬 및 범위검색 등, 향상된 검색기능을 제공
	public static void main(String[] args) {
		// 1. TreeMap 컬렉션 생성
		// 		 Key      Vlaue
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		// 2. Map 컬렉션에 새로운 요소를 Key/Value 쌍으로 추가
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(89, "김자바");
		
		log.info("1. scores: {}", scores);
		
		// Map 컬렉션에 포함된 한 개의 요소의 실제타입은 'Map.Entry'타입의 객체임.
		// 이 'Map.Entry' 타입의 객체 안에, 우리가 넣은 Key와 Value값이 저장되어 있음.
		
		// 3. 한 개의 Map.Entry 타입의 요소를 저장하는 지역변수 선언
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		log.info("1. 가장 낮은 점수: {}, {}", entry.getKey(), entry.getValue());
		
		entry = scores.lastEntry();
		log.info("2. 가장 높은 점수: {}, {}", entry.getKey(), entry.getValue());
		
		entry = scores.lowerEntry(95);
		log.info("3. 95점 아래 점수: key {}, value {}", entry.getKey(), entry.getValue());
		
		entry = scores.higherEntry(95);
		log.info("4. 95점 높은 점수: key{}, value {}", entry.getKey(), entry.getValue());
		
		entry = scores.floorEntry(95);
		log.info("5. 95점이거나 보다 낮은 점수: key {}, value {}", entry.getKey(), entry.getValue());
		
		entry = scores.ceilingEntry(85);
		log.info("6. 85점이거나 보다 높은 점수: key {}, value {}", entry.getKey(), entry.getValue());
		
		while(!scores.isEmpty()) {
			// 가장 낮은 점수의 요소를 찾아서 반환(Map 컬렉션에서 제거도 함께)
			entry = scores.pollFirstEntry();
			
			log.info("7. key: {}, value: {}, size: {}", entry.getKey(),entry.getValue(),scores.size());
		} // while
	} // main

} // end class
