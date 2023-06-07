
public class Sample44 {

	public static void main(String[] args) {
	
		
		// (1) 배열은 힙(HEAP)에 생성되는 객체이다! (참조타입의 첫번째 타입)
		// (2) 배열생성의 방법 2가지:
		//        가. 이미 원소의 값을 가지고 있는 상태에서 배열을 생성
		//            => "배열 리터럴" 생성방식이라고 합니다.
		//        나. 아직 원소의 값은 없지만, 배열을 미리 생성 => 공간확보
		
		
		// 1. 원소의 타입이 기본타입 int 인 배열 객체를 생성
		int[] scores = {83, 90, 87}; // 값의 목록으로 배열 리터럴 생성
//		               배열의 크기(길이)는 3
//		---
		
		scores[0] += 5; // scores[0] = scores[0] + 5;
		scores[1] += 5;
		scores[2] += 5;
		
//		---
		
		// 2. 배열 안의 각 원소를 사용해보자! 수단: 인덱스 번호(0부터 시작)
		
		System.out.println("scores[0] :" + scores[0]);
		System.out.println("scores[1] :" + scores[1]);
		System.out.println("scores[2] :" + scores[2]);
		
//		---
		
		int sum = 0;
		                         // scores.length --> scores 배열의 길이(length)  
		for(int i = 0; i< scores.length; i++) {   // 카운터 변수를 인덱스 번호 0부터 시작
			sum += scores[i];
		} // for
		System.out.println("총합 : " + sum);
		
//		---
		
//		평균 = 배열원소의 총합(sum) / 배열의 크기(길이)
		double avg = (double)sum / scores.length;  
		System.out.println("평균 : " + avg);
		System.out.println(scores.length); // 배열의 크기(길이), (인덱스번호가아님)
		
	} // main
} // end class
