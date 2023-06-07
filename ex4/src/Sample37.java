import java.io.IOException;

public class Sample37 {

	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		int speed = 0;
		int keyCode = 3;
		
		
		
		
//		while(true) { 
		while(run) { //무한루프 --> 탈출조건을 반드시 고려하고 작성
			if(keyCode!=13 && keyCode!=10) {
				// prompt Message : 사용자의 입력을 유도하는 메시지를 의미.
				System.out.println("----------------");
				System.out.println("1.증속 | 2.감속 | 3. 중지");
				System.out.println("----------------");
				System.out.print("선택 : ");
			} // if
	
		
		
		
		// 콘솔로부터 사용자가 "키보드"로입력한 1개의 문자(=키코드값)를 읽음
		// 더불어서, 사용자가 키보드로 입력하기 전까지는 실행을 블록킹(blocking)함
		keyCode = System.in.read();
		
		if (keyCode == 49) {
			speed++;
			
			System.out.println("현재 속도 =" + speed);
			} else if (keyCode == 50) {
				speed--;
				
				System.out.println("현재 속도 =" + speed);
			} else if (keyCode == 51) {
				
				run = false;
			
			}
		
		} // while
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
			}
	}
	
	
	

