package pa.pb;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;
@Log4j2
public class UserResourcesExample2 {

	public static void main(String[] args) throws Exception{
		
		
		// =========================== //
		// 1st. method : using try-with-resources
		// =========================== //
		// 자원객체를 자동으로 close 할 때에 발생가능한 예외(Exception)만
		// 위로 던진다면(즉, 메소드 시그니처 오른쪽에 throws 절 추가)
		// "단독"으로도 사용가능한게, try-with-resources 블록임
		
		// 자원객체를 닫는순서: 소괄호 안에 기재된 순서의 반대로 닫음
		// 						즉, 오른쪽 => 왼쪽으로 닫는다!!
		
//		 AutoCloseable res1 = new UserResource1();	// 다형성-1
//		 AutoCloseable res2 = new UserResource2();	// 다형성-1
//		 AutoCloseable res3 = new UserResource3();	// 다형성-1
		
//		try(res2; res1; res3;) { 
//			;;
//		} // try-with-resources
		
		// =========================== //
		// 2st. method : using lombok
		// =========================== //
		
		{
			
		@Cleanup AutoCloseable res1 = new UserResource1();	// 다형성-1
		@Cleanup AutoCloseable res2 = new UserResource2();	// 다형성-1
		@Cleanup AutoCloseable res3 = new UserResource3();	// 다형성-1
			throw new RuntimeException("삐융삐융");
			
		} // User-defined block
//		log.info("Done.");
		
		
	} // main

} // end class
