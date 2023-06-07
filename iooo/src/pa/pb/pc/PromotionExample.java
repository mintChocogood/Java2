package pa.pb.pc;



public class PromotionExample {

	
	
	// 핵심포인트:
	// 		다형성-1 = 부모타입의 참조변수에는, 모든 자식객체가
	//				   대입 가능하다!
	public static void main(String[] args) {

		// 아래의  실행 문장은 다형성-1이 *** 아닙니다 ***
		// 그저 Lvalue 타입에 맞는 객체를 Rvalue에서 생성해서 대입합니다.
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
//		=================
//		1. 아래에 바로 다형성-1 이 발현되고 있습니다.
//		2. 다형성-1 = 부모타입의 참조변수에는, 모든 자식객체가 대입가능하다!
//		=================
		
		byte bVar = 10;
		int iVar = bVar;		// 자동 형변환
		System.out.println(iVar + "," + bVar);
		
		A a1 = b;				// 자동 형변환 - 다만 위와 같이 바이트 타입이 인트타입으로 들어가는게 아님
		A a2 = c;				// Ditto
		A a3 = d;				// Ditto
		A a4 = e;				// Ditto
		
		System.out.println("1. a1: " + a1);
		System.out.println("2. a2: " + a2);
		System.out.println("3. a3: " + a3);
		System.out.println("4. a4: " + a4);
		
//		==================================
//		다형성-1 = 부모타입의 참조변수에는,
//				   모든 자식객체가 대입가능하다!
		
		B b1 = d;
		C c1 = e;
		System.out.println("b1 : " + b1);
		System.out.println("c1 : " + c1);
		
//		==================================
		
//		B b3 = e;	// 상속관계가 아니기에 형변환조차 일어나지 않음
//		C c2 = d;	// Ditto
	} // main

} // end class
