package Package1;

import Package1.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Value;
import lombok.extern.log4j.Log4j2;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

//@Getter
@Log4j2
//@NoArgsConstructor
@Value
public class 계좌이체예제 {

		
	public static void main(String[] args) {
		Account 소스계좌 = 
				new Account("123456-78-90", "680317-2345678", "홍길동", 10000.0);
		
		Account 타겟계좌 = 
				new Account("7890-654321", "770717-1123457", "김두엽", 7800.0);
		
		try {
			계좌이체예제.계좌이체(
							소스계좌,
							"680317-23456789",			// 일부러 틀림
							"123456-78-90",
							"홍길동",
							
							타겟계좌,
							"770717-1123457",
							"7890-654321",
							"김두엽",
							
							5000);
			
			log.info("계좌이체성공");
		} catch (계좌이체실패예외 e) {
			e.printStackTrace();
			
			log.error("계좌이체실패");
		} finally {
			log.debug("1. 소스계좌: {}", 소스계좌);
			log.debug("2. 타겟계좌: {}", 타겟계좌);
		} // try-catch-finally
		
	} // main
	

	// 계좌이체 수행
	// 소스계좌에서 요구금액만큼 빼서, 타겟계좌에 입금
	private static boolean 계좌이체(Account 소스계좌,
									String 소스계좌주민번호, 
									String 소스계좌번호, 
									String 소스계좌이름,
									
									Account 타겟계좌, 
									String 타겟계좌주민번호,
									String 타겟계좌번호,
									String 타겟계좌이름,
									
									double 이체금액) throws 계좌이체실패예외 {	
				
			try {
				double 요구금액 = 소스계좌.출금(소스계좌주민번호, 소스계좌번호, 소스계좌이름, 이체금액);
				타겟계좌.입금(타겟계좌주민번호, 타겟계좌번호, 타겟계좌이름, 요구금액);
				
				return true;
			} catch (유효성검증실패예외 | 잔고부족예외 | 본인확인실패예외 e) {
//				e.printStackTrace();
				throw new 계좌이체실패예외(e);		// **** : 계좌이체실패예외의 원인이 되는 예외를 생성자 매개변수에 전달
			} // try-catch
	} // 계좌이체

} // end class


//========================================================//
// 사용자-정의예외(User-defined exception): 계좌이체실패
//========================================================//
@NoArgsConstructor // 생성자#1
class 계좌이체실패예외 extends Exception {
	private static final long serialVersionUID = 1L;


	// 생성자#2
	public 계좌이체실패예외(String 예외메시지) {
		super(예외메시지);
	} // 계좌이체실패예외
	

	// 생성자#3
	// 매개변수에 전달된 예외에 의해서, 현재의 예외가 발생
	public 계좌이체실패예외(Exception 원인제공예외) {
		super(원인제공예외);
	} // 계좌이체실패예외
			
} // 계좌이체실패예외
