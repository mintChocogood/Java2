package pa.pb.pc;

public class 다형성1 {
	
	// 다형성-1: 부모타입의 참조변수에는, 모든 자식타입의 객체가
	// 			 대입 가능하다!
	
	// 코드문법: 부모타입 참조변수 = new 자식타입의 객체;
	public static void main(String[] args) {
		
			// 참조타입변수: 모두 객체의 "주소(address)"를 저장
			// 				 즉 크기나 양이 아니다~!
		
//			 ---------------------------
//			 다형성-1: 모두 promotion(자동형변환)
//			 ---------------------------
		
		조상 봉무게 = new 부모1(); // 자식
			 봉무게 = new 부모2();
			 봉무게 = new 부모3();
		

			 봉무게 = new 자식1(); // 손자
			 봉무게 = new 자식2();
			 봉무게 = new 자식3();
			 
//			 ---------------------------
//			 다형성-1: 모두 promotion(자동형변환)
//			 ---------------------------
			 
			 부모1 진양철 = new 자식1();
		
			 부모2 진씨일가 = new 자식2();
		
			 부모3 진도준 = new 자식3();
		
//			----------------------------
//			기본타입의 자동형변환(promotion)
//			----------------------------	 
		
			 byte byteVar = 1;
			 short shortVar = byteVar;
			 
			 int intVar = 100;
			 double doubleVar = intVar;
			 System.out.println(doubleVar);
			 
			 System.out.println("1. 봉무게: " + 봉무게);
			 
			 단군할아버지 dangun = new 조상();
			 
	} // main

} // end class
