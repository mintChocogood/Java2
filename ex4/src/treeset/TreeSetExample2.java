package treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TreeSetExample2 {

	// 정렬결과를 얻자! (오름차순/내림차순 모두)
	public static void main(String[] args) {
		// 1. 이진트리기반의 TreeSet 생성
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 2. 새로운 요소 추가 -> 이진트리 노드로 자동편입 -> 자동정렬
		
		scores.add(87);
		scores.add(47);
		scores.add(85);
		scores.add(83);
		scores.add(24);
		scores.add(68);
		
		log.info("1.scores: {}", scores);
		// 3. 내림차순으로 정렬결과를 Set으로 반환해주는 메소드(descendingSet) 호출
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		descendingSet.forEach(log::info);
		
		// 4. 오름차순으로 정렬결과를 Set으로 반환해주는 메소드(descendingSet ???) 호출
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		ascendingSet.forEach(log::info);
		
	}

}
