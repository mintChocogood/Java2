package treeset;

import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;
@Log4j2
public class TreeSetExample1 {

	// 핵심포인트: 이진트리 기반의 노드순회로,
	// "아주 빠른 검색"을 수행할 수 있는 컬렉션
	// TreeSet 컬렉션을 이용하여, (1) 자동정렬 및 (2) "범위스캔"등
	// 검색을 아주 빠르게 수행합니다!!
	
	public static void main(String[] args) {
		// Step.1 이진트리 기반의 TreeSet 컬렉션 생성
		//		  이 이진트리가 바로 데티어베이스의 인덱스 구현의
		// 		  기본 알고리즘이 됨
		//		  (Binary Tree -> 좌/우 균형감이 되도록 개선한
		//		  B+ Tree 알고리즘
		TreeSet<Integer> scores = new TreeSet<>();
		
		// Step.2 Auto-Boxing 이용해서, 요소값 추가
		scores.add(87);		// Integer e = 87; Auto-boxing
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		log.info("1. scores: {}", scores);
		
		// Step.3 다양한 검색 메소드로, 이진트리로부터 원하는 값을 얻어내보자!
		Integer score = null;
		
		score = scores.first();					// 최소값(min)
		log.info("2. Min: {}", score);
		
		score = scores.last();					// 최대값(max)
		log.info("3. Max: {}", score);
		
		score = scores.lower(96);	// 지정된 점수보다, 한 단계 낮은 점수를 구하라!
		log.info("4. 95점 하나 아래 점수: {}", score);
		
		score = scores.higher(96);
		log.info("5. 95점 하나 위의 점수: {}", score);	// 지정된 점수보다, 한 단계 높은 점수를 구하라!
		
		score = scores.floor(95);
		log.info("6. 95점이거나 바로 아래 점수: {}", score);	// 지정된 점수거나, 한 단계 낮은 점수를 구하라!
		
		score = scores.ceiling(85);	// 지정된 점수거나, 같거나 한 단계 높은 점수를 구하라
		log.info("7. 85점 이거나 바로 위의 점수: {} ", score);
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			
			log.info("score: {}, size: {}", score, scores.size());
		} // while
	} // main
} // end class
