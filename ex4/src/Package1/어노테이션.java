package Package1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Retention(RetentionPolicy.SOURCE)  // 컴파일까지만 유지
//@Retention(RetentionPolicy.CLASS) // *.class 파일안에 유지/사용불가
@Retention(RetentionPolicy.RUNTIME) // 실행중에 어노테이션 사용가능
@Target({ 
	ElementType.TYPE
	
	
	// 참조타입 선언부에만 어노테이션을 적용가능
})
public @interface 어노테이션 {
	
	// 어노테이션에 제공하는 메타데이터 정보를 저장하는 
	// 엘리먼트 선언
	
	// 어노테이션의 속성 중에, 기본값을 가지지 않는 속성이 있다면,
	// 어노테이션 "사용시", 반드시 해당 속성에는 데이터를 제공해야합니다!!
	String value(); // value란 이름의 "속성"이라고 합니다.
					// 속성 이름이 "value"인 속성 => 해당 어노테이션의
					// "기본속성(default attributes)" 이라고 합니다.
	
	int elementName() default 5; // <- 기본값 = 5
	
} // end annotation
