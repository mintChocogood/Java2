package pa.pb;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Board {	// 게시판을 모델링한 클래스
	String subject;		// 게시글의 제목
	String content;		// 게시글의 내용
	String writer;		// 게시글의 작성자
	
	
	
} // end class
