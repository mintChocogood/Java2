
public class Sample22 {

	public static void main(String[] args) {
		
		String a = "abCd";
		String b = "aBcd";
		
		// 대소문자까지 따져서, 두 문자열의 문자구성이 같은지 비교 => 결과 : boolean
		System.out.println( a.equals(b));
		// 대소문자를 따지지 않습니다. 결과 => boolean, 기능도 equals와 같음
		System.out.println(a.equalsIgnoreCase(b));
		
	}
}
