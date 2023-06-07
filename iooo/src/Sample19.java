
public class Sample19 {

	public static void main(String[] args) {
		
		// 실수타입이 0.1값을 근사치로 표현하는 문제를 피해가는 바업ㅂ:
		// 어제 예제(Sample18)는 사과의 한 조각을 실수타입 0.1로 가정하고 했습니다.
		// 그런데, 근사치가 나왔죠. 이를 해결하고, 정확히 0.3 조각이 나오
		// 게 하려면, 실수연산 => 정수연산으로 바꿔서 한 다음, 마지마긍로
		// 결과를 실수타입으로 바꿔주는 방법으로 해결합니당.
		int a = 1;
		
		int b = a * 10;
		int number = 7;
		int temp = b - number;
		
		double result = temp / 10.0;
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면, ");
		System.out.println(result + "조각이 남는다.");
	}
}
