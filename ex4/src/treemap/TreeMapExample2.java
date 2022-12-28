package treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TreeMapExample2 {

	// 핵심포인트: TreeMap 컬렉션에 포함된 모든 요소를
	//			   내림차순/오름차순으로 얻어내는 예제
	public static void main(String[] args) {
		// 1. 이진트리 기반의 Map 컬렉션 생성
		//		 Key	  Val
		TreeMap<Integer, String> scores = new TreeMap<>();
		
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길순");
		scores.put(95, "신용권");
		scores.put(89, "김자바");
		
		// 2. 내림차순 정렬결과 얻어내기 by TreeSet.descendingMap() method.
		NavigableMap<Integer,String> desMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> des = desMap.entrySet();
		
		des.forEach(log::info);		// 순회
		
		// 3. 오름차순 정렬결과 얻어내기 by descendingMap.descendingMap() method.
		NavigableMap<Integer,String> adesMap = desMap.descendingMap();
		Set<Map.Entry<Integer, String>> asEn = adesMap.entrySet();
		
		asEn.forEach(log::info);	// 순회
		
		
		
		
	} // main

} // end class
