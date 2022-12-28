package treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;
@Log4j2
public class TreeSetExample3 {

	public static void main(String[] args) {

		TreeSet<String> str = new TreeSet<>();
		
		str.add("apple");
		str.add("forever");
		str.add("description");
		str.add("ever");
		str.add("zoo");
		str.add("base");
		str.add("guess");
		str.add("cherry");
		
		log.info("1. treeSet:{}" , str);
		
		//3. 범위검색(Range Scan) 수행
		log.info("2. [c~f 사이의 단어 검색]");
		
		NavigableSet<String> rangeSet =
//									 포함			  포함
//									 여부			  여부		
				str.subSet("cherry", true, "forever", true); // Full Closed
		rangeSet.forEach(log::info);
	} // main

} // end class
