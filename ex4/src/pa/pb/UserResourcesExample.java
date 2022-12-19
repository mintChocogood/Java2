package pa.pb;


import lombok.extern.log4j.Log4j2;

@Log4j2
public class UserResourcesExample {

	public static void main(String[] args) {
		// 1. 자원객체 생성(예: Scanner 객체 생성)
		UserResource1 res1 = new UserResource1();
		
		// 예외처리
		// 2. 자원객체 사용
		// ......
		// 여기서 예외가 만일 발생하면... 아래의 3번은
		// 수행될까여?! 안될까영!?
		
//		==============================================
//		case1. try 블록에서, 예외가 발생하든/안하든,
//			   개발자가 직접 반드시 자원객체를 닫아준다.
//		==============================================
		try {	
		
//		res1.close(); // 자원해제(반납)
		}catch(Exception e){
			e.printStackTrace();
		} finally{ // 반드시 이 중광호 실행블록의 코드실행은 보장됨
			// 3. 사용이 끝난 자원객체는 반드시 close 해줘야 합니다.
			//    왜? 공용자원이기 때문에...
//			try{res1.close();} // 자원해제(반납)
//			catch(Exception e){;;}
		} // try-catch-finally
		
//		==============================================
//		case2. try-with-resources 구문에, 자원객체의 해제를
//			   맡기자!(try블록에서 예외가 발생하든/안하든)
//		==============================================
//		문법: try(자원객체의 참조변수1; 참조변수2; ...) {...}
//		
//		try(	UserResource1 res4 = new UserResource1();
//				UserResource1 res3 = new UserResource1();
//				UserResource1 res2 = new UserResource1();) { // @till JAVA 7
		UserResource1 res4 = new UserResource1();
		UserResource1 res3 = new UserResource1();
		UserResource1 res2 = new UserResource1();
		
		
		
		try(
				res2;
				res3;
				res4;
				) {		// @since JAVA 8
			// 자원객체 사용해서, 비지니스 로직 수행
			// ...
			
			// 비지니스 로직처리 중간에, 예외가 발생하는 것을
			// 시뮬레이션 수행
			throw new RuntimeException("삐융삐융 예외발생 삐융삐융");
		} catch(Exception e){
			e.printStackTrace();
		} // try-with-resources
		
		
		
		} // main

} // end class
