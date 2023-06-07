package Package1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@ToString
@Log4j2
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	
	private String 계좌번호;
	private String 주민번호;
	private String 예금주;
	private double 잔고;
	
	
	
	private boolean 유효성검증(String 계좌번호, String 예금주) {
		log.trace("유효성검증({}, {}) invoked.", 계좌번호, 예금주);
		
		return (this.계좌번호 == 계좌번호) && (this.예금주 == 예금주);
	} // 유효성검증
	
	
	private boolean 잔고검증(double 잔액) {
		log.trace("잔고검증({}) invoked.", 잔액);
		
		return (this.잔고 >= 잔액);
	} // 잔고검증
	
	
	public double 출금(String 주민번호, String 계좌번호, String 이름, double 요구금액)
			throws 잔고부족예외, 유효성검증실패예외, 본인확인실패예외 {
		log.trace("출금({}, {}, {}) invoked.", 주민번호, 예금주, 요구금액);

		// ========================================== //
		// 1. 본인확인
		// ========================================== //
		if(!this.본인확인(주민번호, 이름)) {			// 예외발생: 본인확인실패!
			throw new 본인확인실패예외( "주민번호: %s, 이름: %s".formatted(주민번호, 이름) );
		} // if

		// ========================================== //
		// 2. 계좌의 유효성 검증
		// ========================================== //		
		if(!this.유효성검증(계좌번호, 이름)) {	// 예외발생: 유효성검증실패!
			throw new 유효성검증실패예외( "계좌번호: %s, 예금주: %s".formatted(계좌번호, 예금주) );
		} // if

		// ========================================== //
		// 3. 현재 계좌의 잔고검증
		// ========================================== //		
		if(this.잔고검증(요구금액)) {

			// ========================================== //
			// 4-1. 현재 계좌에서 요구금액만큼 출금수행
			// ========================================== //
//			this.잔고 -= 요구금액;
			this.잔고 = this.잔고 - 요구금액;
		
			return 요구금액;
			
		} else {	// 예외발생 : 잔고부족!!	

			// ========================================== //
			// 4-2. 현재계좌 잔고부족으로 비지니스 예외발생
			// ========================================== //			
			throw new 잔고부족예외("요구금액: %s, 잔고: %s ".formatted(요구금액, this.잔고));
		} // if-else
	} // 출금
	
	
	public void 입금(String 주민번호, String 계좌번호, String 이름, double 요구금액)
			throws 유효성검증실패예외, 본인확인실패예외 {
		log.trace("입금({}, {}, {}) invoked.", 주민번호, 예금주, 요구금액);

		// ========================================== //
		// 1. 본인확인
		// ========================================== //		
		if(!this.본인확인(주민번호, 이름)) {			// 예외발생: 본인확인실패!
			throw new 본인확인실패예외( "주민번호: %s, 이름: %s".formatted(주민번호, 이름) );
		} // if

		// ========================================== //
		// 2. 계좌의 유효성 검증
		// ========================================== //		
		if(!this.유효성검증(계좌번호, 이름)) {	// 예외발생: 유효성검증실패!
			throw new 유효성검증실패예외( "계좌번호: %s, 예금주: %s".formatted(계좌번호, 예금주) );
		} // if

		// ========================================== //
		// 3. 현재 계좌에 요구금액만큼 증액
		// ========================================== //		
//		this.잔고 += 요구금액;		
		this.잔고 = this.잔고 + 요구금액;
	} // 입금
	
	
	private boolean 본인확인(String 주민번호, String 이름) {
		log.trace("본인확인({}, {}) invoked.", 주민번호, 이름);
		
		return (this.주민번호 == 주민번호) &&
			   (this.예금주 == 이름);
	} // 본인확인

} // end class


//========================================================//
// 사용자-정의예외(User-defined exception): 계좌잔고부족
//========================================================//
@NoArgsConstructor // 생성자#1
class 잔고부족예외 extends Exception {
	private static final long serialVersionUID = 1L;


	// 생성자#2
	public 잔고부족예외(String 예외메시지) {
		super(예외메시지);
	} // 잔고부족예외
	

	// 생성자#3
	// 매개변수에 전달된 예외에 의해서, 현재의 예외가 발생
	public 잔고부족예외(Exception 원인제공예외) {
		super(원인제공예외);
	} // 잔고부족예외
			
} // 잔고부족예외

//========================================================//
//사용자-정의예외(User-defined exception): 본인확인실패
//========================================================//
@NoArgsConstructor // 생성자#1
class 본인확인실패예외 extends Exception {
	private static final long serialVersionUID = 1L;


	// 생성자#2
	public 본인확인실패예외(String 예외메시지) {
		super(예외메시지);
	} // 잔고부족예외
	

	// 생성자#3
	// 매개변수에 전달된 예외에 의해서, 현재의 예외가 발생
	public 본인확인실패예외(Exception 원인제공예외) {
		super(원인제공예외);
	} // 잔고부족예외
			
} // 본인확인실패예외

//========================================================//
//사용자-정의예외(User-defined exception): 유효성검증실패
//========================================================//
@NoArgsConstructor // 생성자#1
class 유효성검증실패예외 extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	
	// 생성자#2
	public 유효성검증실패예외(String 예외메시지) {
		super(예외메시지);
	} // 잔고부족예외
	

	// 생성자#3
	// 매개변수에 전달된 예외에 의해서, 현재의 예외가 발생
	public 유효성검증실패예외(Exception 원인제공예외) {
		super(원인제공예외);
	} // 잔고부족예외
			
} // 잔고부족예외
