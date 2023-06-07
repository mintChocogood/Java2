
public class Sample14 {
// 목적: 부정연산자 NOT(!)에 대해서 배우자!!(***)
	public static void main(String[] args) {
	
	// 아래의 예제는 플래그 변수의 토글(toggle)을 만드는 예제
	// 플래그(flag) 변수란?? 보통 boolean 타입의 변수를 의미하는 것으로,
	//	                     다른 목적이 있습니다만, 우리가 "제어문"을
	//	                     배우기 전까지는 뒤로 미루겠습니다.

		
		boolean play = true;
		System.out.println(play);
		
//      ------------
		
		play = !play;
		System.out.println(play);
		
//      -----------
		
		play = !play;
		System.out.println(play);
		
		
		
	}
}
