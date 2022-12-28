package treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class TreeMapExample3 {

	
	// 핵심포인트: 이진트리 기반의 Map 컬렉션의 "부분범위검색"
	public static void main(String[] args) {
		// 1. 이진트리 기반의 Map 컬렉션 생성
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		// 2. 요소추가
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 10);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);

		log.info("1. treeMap: {}" , treeMap);
		
		// Range Scan
		log.info("[c~f 사이의 단어 검색]");
		
		NavigableMap<String,Integer> rangeMap =
				treeMap.subMap("cherry", false, "forever", false); // Full-open
		
		log.info("2. rangeMap: {}", rangeMap);
		
		rangeMap.forEach(log::info);	// 모든 키만 순회
		
//		rangeMap.entrySet();
		Set<Map.Entry<String, Integer>> entrySet=rangeMap.entrySet();
		
		entrySet.forEach(log::info);	// 모든 키/값 쌍으로 순회
		
	} // main

} // end class
