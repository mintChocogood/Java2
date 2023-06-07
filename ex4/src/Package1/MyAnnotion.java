//@MyAnnotion					// XX
//@MyAnnotion package           // XX
package Package1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({
	ElementType.FIELD,
	ElementType.METHOD,
	ElementType.PARAMETER, 		// 파라미터 == 매개변수
	ElementType.CONSTRUCTOR,
	ElementType.LOCAL_VARIABLE, // 로컬바리에이블 == 지역변수
	ElementType.TYPE,			// 참조타입의 선언부(클래스/인터페이스/열거)
	ElementType.ANNOTATION_TYPE,// 어노테이션의 선언부
	ElementType.PACKAGE,		
})
//@MyAnnotion						// OK
//public @MyAnnotion 				// OK 
//public @interface @MyAnnotion 	// XX
public @interface MyAnnotion {
	
	
	
	
	
	
} // end @interface
