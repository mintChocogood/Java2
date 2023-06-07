package 직렬화;

import java.io.Serializable;

public class ClassC implements Serializable{
	// Serializable 인터페이스를 implements 하는 클래스는
	// 반드시 아래의 필드(serialVersionUID)를 가져야 함 (****)
	// 만일 개발자가 아래 필드를 선언하지 않으면, 컴파일시, 자바 컴파일러가 자동으로 넣어줌! (***)
	
	
	private static final long serialVersionUID = 777l + 1l;
	
	int field1;
	int field2 = 1000;

} // end class
