package comparable;

import java.util.Comparator;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@NoArgsConstructor
// 핵심포인트: 소스가 없는 어떤 참조타입을, 이진트리 기반의
//			   TreeSet의 요소타입이나, TreeMap의 키의 타입으로 사용하고자
//			   할 때에는, 소스가 없는 Fruit 타입의 객체의 대소를 비교해주는
//			   비교자(Comparator)를 별도로 아래와 같이 만들어, TreeSet/TreeMap에
//			   제공해주면, Fruit 타입을 요소타입으로 사용가능
public class DescendingComparator 
	implements Comparator<Fruit>{

	@Override		// 기준객체, 비교객체
	public int compare(Fruit o1, Fruit o2) {
		log.trace("compare({}, {}) 실행됨.", o1, o2);
		
		// 자바언어에서 비교자의 리턴규칙(오름차순을 기본으로 함)에 맞게 구현
		// 하지만, 아래 구현은 비교자 리턴규칙을 반대로 구현
		// 왜? 현재의 비교자는 내림차순 정렬결과를 받기를 원하기 때문(기본: 오름차순)
		if(o1.price < o2.price) return +1;
		else if (o1.price == o2.price) return 0;
		else return -1;
		
	} // compare

} // end class
