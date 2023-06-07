
public class Sample7 {
	
//	System.out.println("기서");             //XX
	
	int age; // OO "필드" 라 부름, 하지만 변수와는 완전히 틀림
//                          // 매개변수 선언부 >> () 소괄호  
	public static void main(String[] args) {
		// 소괄호 블록 ( 즉, 매개변수 선언부 )에 선언된 변수들 역시
		// 중괄호 블록에 선언된 변수와 동일한 생명주기를 가진다.
		String name;
		name = "홍기서";
		name = "최규환";
		
		System.out.println(name);
		
		
		
		
		
		
		{
			double height = 172.56;
			
			System.out.println(height);
			
			String name2 = "Trinity";
			
			
		} // User-defined lock#1 (사용자-정의 블록)
		
		//System.out.println(height);
		
		
		
		
		{
			double height = 172.56;
			
			System.out.println(height);
			
		}
		// User-defined lock#2 (사용자-정의 블록2)
		
		
		
		
		
		
		
		
		int a;
		a = 10;
		a = 20;
		a = 30; // 갱신이 됨
		
	
		
		
		char b;
		b = 'a';
		b = 'b'; 
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
