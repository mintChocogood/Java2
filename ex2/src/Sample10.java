
public class Sample10 {

	public static void main(String[] args) {
		
		int intvalue = 44032; 
		
//		                 ----- : 이 부분이 강제형변환 문법임
//		                         즉, 소괄호안에 작은타입을 기재  
		char charvalue = (char) intvalue;   //강제형변환 발생
		System.out.println((int) charvalue);
		
		
		
		long longvalue = 500;
		
		intvalue = (int) longvalue;
		System.out.println(intvalue);
		
		
		
		double doublevalue = 3.14;
		
	
		
		intvalue = (int) doublevalue;
		System.out.println(intvalue);
		
		
		
		
	}
	
	
}
