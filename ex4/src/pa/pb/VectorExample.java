package pa.pb;

import java.util.List;
import java.util.Vector;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ToString
public class VectorExample {

	
	// 핵심포인트: List<T> interface의 2번째 구현클래스인 Vector에 대해서
	// 			   이해하자!
	public static void main(String[] args) {
		// Vector는 ArrayList 구현클래스와 거의 대동소이하되,
		// 차이점은 Vector는 Thread-safe하고, ArrayList는 Thread-unsafe합니다.
		// 때문에, 실전 특히 불특정 다수가 사용하는 웹서비스에서는, Vector를 써야합니다.
		// (물론, 순서보장/중복허용/추가삭제의 빈도가 작은 경우에 한하여..)
		
		List<Board> list = new Vector<>();	// 어떤 구현클래스로 객체를 생성하든,
											// 초기용량(capacity)이 10입니다.
		
//		---
		// 게시글을 Vector 구현객체로 관리하자!
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
//		log.info(list);
		
//		---
		
		// try-with-resource block은 반드시, 자원객체가 AutoCloseble 인터페이스를
		// 구현하고 있어야 합니다!! ==> List 컬렉션은 사용불가!!
		
//		try(list){
//			;;
//		} // try-with-resources
		
//		---
		
		// 인데스에 기반한 요소의 삭제가 발생하면 => 반드시 밀고/땡기는 밀땅현상 발생
		list.remove(2);		// 땡기는 현상발생
		list.remove(3);		// 땡기는 현상발생
		
		// 순회
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			
			log.info(board);
//			log.info(board.subject, "\t", board.content, "\t", board.writer);
		} // classical for
		
		
		
		
		
	} // main

} // end class
