
public class Sample25 {

	public static void main(String[] args) {
		
		// 삼항(3개의 피연산자를 사용하는 연산자) 연산자 == 조건연산자!
		// 형식: (조건식) ? 참일때의 값 : 거짓일때의 값
		
		int score = 85;
		
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println("1. " + score + "점은 " + grade + "등급입니다.");
		
		// 더불어서, 아래와 같이, 참/거짓일 때 지정할 값 부분에, 다시
		// 삼항연산자를 중첩(Nested)시켜, 여러 경우를 추가할 수도 있습니다.
		
		grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println("2. " + score + "점은 " + grade + "등급입니다.");
	}
}
