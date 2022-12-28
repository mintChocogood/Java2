package comparable;

import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ComparatorExample {

	
	
	
	
	
	
	
	// 핵심포인트: 우리가 직접 만든, Fruit 객체의 대소를 비교해주는 "비교자"
	//			   를 TreeSet의 생성자 매개변수로 전달하면 됩니다!!!(***)
	public static void main(String[] args) {
		// Fruit이 Comparble을 구현하지 않았기 때문에 예외 발생
		// 우리가 만든 비교자(Comparator객체)를 생성자의 매개변수로 전달하지 않았기 때문
//		TreeSet<Fruit> treeSet = new TreeSet<>();
//		
//		treeSet.add(new Fruit("포도", 3000));
//		treeSet.add(new Fruit("수박", 10000));
//		treeSet.add(new Fruit("딸기", 6000));
		
		TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingComparator());
		
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		treeSet.forEach(log::info);
	} // main

} // end class
