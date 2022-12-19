package hashmap;

import java.util.HashMap;
import java.util.Map;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class HashMapExample2 {

	// 핵심포인트: HashMap 컬렉션에, 사용자-정의 객체(Student)을 넣어보자!!
	//			   (Key에 대해서, 중복판정 알고리즘이 수행될 수 있도록 준비해야한다(***))
	public static void main(String[] args) {
//		@Cleanup("clear")
		Map<Student, Integer> map = new HashMap<>();
		
		// put 할 때, Key에 대해서, 중복판정 알고리즘 수행됨!!!
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		log.info("1. map: {}", map);
		log.info("2. 총 Entry 수 : {}", map.size());
		
		map.clear();
		map = null;
		
		System.gc();   			// GC 수행요청 (GC 강제수행이 아님!!)
		
	} // main
} // end class
