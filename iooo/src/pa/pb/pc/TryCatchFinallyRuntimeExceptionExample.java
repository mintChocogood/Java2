package pa.pb.pc;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TryCatchFinallyRuntimeExceptionExample {

	
	// 핵심포인트: 	더이상 try-catch-finally절의 문법이 아니라,
	//				컴파일러가 개입하지 않는, 소위 Runtime Exception은
	//				어떻게 예외처리 할 수 있는가?
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		String number = "100";
		
		try {
			
			int num = 100;
			int result = num / 0;
			
			
			// main 메소드의 매개변수인 args 배열이 가지고 있는 원소를
			// String 타입의 두 참조변수에, 첫번째 원소/두번째 원소를 각각
			// 저장함. 과연 이 try 블록 안의 코드라인에서 발생가능한 예외가 무엇일까
			data1 = args[0];
			data2 = args[1];
			
//			---------------
			int intNumber = Integer.parseInt(number);
			
//			---------------
			
			try {
				Class clazz = Class.forName("java.lang.String");
				//      멀티 catch      >>  |  << = 그리고, 또는
				//		발생가능한 예외타입들이, 같은 예외처리로직을 가질 때 사용
			} catch (ClassNotFoundException | ArithmeticException e) {
				e.printStackTrace();
				
				log.info("익셉션 1");
			}
			
			
			
		} 
//			e.printStackTrace();
//			log.info("익셉션 1");
//		}
//		catch (ClassNotFoundException e) {
//			e.printStackTrace();
			
//		} // try-catch
		
//		----------------
		
		// 다중 catch: 발생가능한 예외타입별로, 예외처리 로직이 틀릴 때 사용
		catch(NumberFormatException e) {
			e.printStackTrace();
		} // try-catch
		catch(ArrayIndexOutOfBoundsException e) {
			log.error("실행 매개값의 수가 부족합니다.");
			log.error("[실행 방법]");
			log.error("자바 런타임 익셉션 오류떳으면 num1이나 num2 입력하세염.");
			e.printStackTrace();
			
			return;
		} 
		
		// 모든 예외 타입중 제일 대가리는 Exception이기에 다형성-1의 따라
		// 모든 예외는 아래 catch문에서 처리되기 때문에 Exception의 하위
		// 예외타입들이 존재한다면 오류가 발생함, 따라서 제 역할을 하기
		// 위해서는 catch문중에 마지막에 두는것이 정석
		catch (Exception e) {
			e.printStackTrace();
			
			log.info("나머지 모든 예외처리는 여기서 합니다.");
		} finally {
			
		log.info("Done.");
		}// try-catch-finally
	
		} // main
		
	
	} // end class

 
