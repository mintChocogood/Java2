package pa.pb;

import java.util.ArrayList;

import java.util.List;

import lombok.Cleanup;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@NoArgsConstructor
@Log4j2
public class ArrayListExample {
	
	
	// 핵심포인트: List 컬렉션의 구현클래스 중에, ArrayList를 이용하여
	//			   List 컬렉션을 생성하고, 요소객체들을 관리(CURD)해보즈아!
	public static void main(String[] args) {
//		제네릭타입인터페이스   구현클래스의객체
//		-----------				-----------
		@Cleanup("clear")
		List<String> list = new ArrayList<>();
//		(1) 요소객체의 순서를 보장하고 => 때문에, 배열과 비슷 
//			=> 그래서, 인덱스가 존재 => 인덱싱을 통해, 특정위치의 요소를 CRUD할 수 있음
//		(2) 중복을 허용한다
		
		
//		---
		
		// 새로운요소(문자열)객체를 List 컬렉션에 "추가"하자!!
		list.add("Java");			// List의 맨 끝에 계속 추가!
		list.add("JDBC");
		list.add("Servlet/JSP");
		
		// 지정된 2번 인덱스의 위치에, 새로운 요소 추가(***)
		// ********* 이미 2번 인덱스 위치에는 "Servlet/JSP" 문자열 객체가 들어 있는데,
		// 아래의 지정된 2번 인덱스에 "Database"라는 새로운 문자열 객체를 요소로
		// 넣기 위해서, 밀고/땡기는 현상(****)이 발생합니당!
		list.add(2, "Database");
		list.add("MyBatis");
		
		log.info(list);
		
//		-----------------
//		2. 컬렉션의 요소 검색 메소드
		
		int size = list.size();
		log.info("총 객체수: {}" , size);
		
//		---
		
		String skill = list.get(2);	// 2번 인덱스의 요소객체 반환
		log.info("skill: {} " , skill);

//		---
		
//		3. List 컬렉션의 순회(Traverse)
		
		// 외부순회(External Traverse) <-> 내부순회(Internal Traverse)
		for(int index=0; index<list.size(); index++) {	
			String str = list.get(index);
			
			log.info("list[{}] : {}", index, str);
		} // Classical for
		
		// Enhanced for 몬으로 순회시키시오
		
//		int index = 0;
//		
//		for ( String element : list ) {
//			log.info("list[{}] = {}", index++, element);
////			++index;
//        } // Enhanced for
		
		// Lambda expression 과 컬렉션의 자동순회를 이용한 요소객체의 출력
//		list.forEach(log::info);
		
//		---
		
//		4. 요소객체의 삭제
		
		list.remove(2);			// 지정된 index 요소삭제
		list.remove(2);			// 지정된 index 요소삭제
		list.remove("iBATIS");	// 지정된 객체가 List안에 있으면! 삭제
		list.remove("Java");	// 지정된 객체가 List안에 있으면! 삭제
		
		log.info(list);
		
//		
		
//		5. 자원해제 - 컬렉션은 엄청 큰 요소들을 가지기 때문에, 사용이 다 끝나면,
//		 			  반드시 clear 시켜서 (요소객체들을 모두 한번에 삭제시킴),
//		   			  자원해제가 되도록 해줘야함
		
		// List 컬렉션을 모두 사용하고 나면, 반드시 자원해제 해줘야
		// 빠르게 Garbage Collection 될 수 있음
		
		// (1) 첫번째 방법
		list.clear();
		log.info("list.clear(): {}", list);
		list = null;		// ***
		log.info("list = null: {}", list);
		
		// (2) 두번째 방법(lombok)
		//		@Cleanup
		
		
		
	} // main
	
} // end class
