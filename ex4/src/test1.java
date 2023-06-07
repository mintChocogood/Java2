
public class test1 {

	public static void main(String[] args) {
		
		int day = 1;     // 시작 날짜
	      int up = 40;     // 하루에 올라갈 수 있는 높이
	      int down = 17;   // 잘 때 미끄러지는 높이 
	      int high = 0;    // 시작 높이

	      while (high < 300) {          // 도달 높이가 300미터가 넘어가지 않을 때 반복
	         high = high + up;         // 현재 위치와 하루에 올라갈 수 있는 높이의 합

	         if (high < 300) {         // 도달 높이가 300미터가 넘어가지 않을 때 반복
	            System.out.println(day + "일 째 현재높이 " + high + "M, 목표 높이에 도달하지 못했습니다."); // 잠들어서 미끄러지기 전 높이 출력
	                                     
	            high = high - down;   // 현재 위치와 잠들어서 미끄러진 높이를 뺌
	            day++;                // 잠이 들었으므로 하루가 지남

	         } // if
	         
	      } // while

	      System.out.println(day + "일 째 현재높이 " + high + "M, 목표 높이에 도달, 탈출에 성공했습니다..."); // 결과	
		
		
		
		
		
		
		
		
	
		
		
		
		
	}
}
