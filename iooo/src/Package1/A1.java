package Package1;


// 핵심포인트: protected 접근제한자의 alpha에 대해서 이해하자!!!
//             protected == default + alpha
public class A1 {
	protected String field;
	
	protected A1() {	// 의미를 오해 ㄴ 즉, new 생성자가 아니다
		;;
	} // 기본생성자
	
	protected void method() {
		
	} // 메소드
	
} // end class
