
public class Sample23 {

	public static void main(String[] args) {
	
		int charCode = 'A';
		
		System.out.println(charCode);
		System.out.println(charCode>=65);
		System.out.println(charCode<=90);
		
		System.out.println((charCode >= 97) || (charCode <= 122));
		System.out.println((charCode >= 97) | (charCode <= 122));
		System.out.println((charCode >= 97) && (charCode <= 122));

		// 비교연산자와 논리연산자를 함께 사용
		// && (and) : 이항연산자로, 2개의 피연산자가 모두 true일 때 만, true가 됨
		// || (or)  : 이항연산자로, 2개의 피연산자 중 하나만이라도 true이면, true가 됨.
		
		System.out.println((charCode >= 66) || (charCode <= 66));
		
		
	
	
		
		
		
		
		
	}
}
