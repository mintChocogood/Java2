
public class Sample24 {

	public static void main(String[] args) {
		
		int result = 0;
		
		
		
		//그래서, 이 복합대입연산자의 특징은, "변수 자신" 의 값을 지정된 크기만큼
		// 변경시킬 때에 주로 사용합니다.
		
		result += 10;         // result = result + 10;
		System.out.println("result=" + result);
		
		result -= 5;         // result = result  - 5;
		System.out.println("result=" + result);
		
		result *= 3;
		System.out.println("result=" + result);
		
		result /= 5;
		System.out.println("result=" + result);
		
		result %= 3;
		System.out.println("result=" + result);
		
		
		
		
		
	}
}
