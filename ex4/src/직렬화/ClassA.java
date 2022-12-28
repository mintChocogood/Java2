package 직렬화;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class ClassA implements Serializable{
	
	int field1;
	
	ClassB field2 = new ClassB();
	
//	transient				// 아무런 의미가 없음 
	static int field3;		// 정적필드는 인스턴스필드가 아니라 직렬화에 포함되지 않음
	
	// 객체의 직렬화에서 제외시키고싶은 필드 앞에
	// transient란 키워드를 붙일 것!
	transient int field4;			// 직렬화에서 제외

} // end class
