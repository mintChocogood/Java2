package interface2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TTT1 {

	private static ChildImpl child;
	
	// 핵심포인트: 익명객체생성시 발생할 수 있는 (개연성), 소위"클로져(Closure)" 현상에 대해서 이해하자
	public static void main(String[] args) {
//		ChildImpl child = new ChildImpl();
//		
//		IParent1 parent1 = child;
//		IParent2 parent2 = child;
//		
//		IParent1 parent1 = new ChildImpl();
//		IParent2 parent2 = new ChildImpl();
//		
//		log.info("1. parent1: {}", parent1);
//		log.info("2. parent2: {}" , parent2);
//		

		
			
			ChildImpl child;	// 익명자식객체를 저장할 지역(참조)변수
			
		
			
			{
			String name = "기서";		// 기본적으로 final(상수)이 붙어이뜸
			int age = 12;				// 디또
			double weight = 32.2;
			weight = 20;
//			 age =  18;					// XX: final(상수) 이기 때문에
			 
//		==============================
//		익명자식객체 생성 코딩기법
//		==============================
				
			child = new ChildImpl() {		// 다형성-1
			
		
			
			@Override
			public void 메소드1() {
				log.trace("메소드1() 호출.");
				
				
				log.info("\t+ nameOuter: {}" , name);	// main 메소드의 지역변수 참조(=사용)
				log.info("\t+ ageOuter: {}" , age);		// main 메소드의 지역변수 참조(=사용)
//				log.info("\t+ weight: {}" , weight);
			} // 메소드1
			
			
		}; // 익명자식객체 생성
		
		child.메소드1();		// 다형성-2
		
			} // User-defined block
			
			// 이 시점에 다시 재정의된 메소드가 호출될 때 (다형성-2),
			// 메소드 안에 사용된 지역변수(name, age)는 이미 파괴되고 없다!
			child.메소드1();	// 다형성-2
			
			
		// Lvalue(정적필드), Rvalue(지역변수)
		//----------------
		TTT1.child = child;
		
	
	} // main

} // end class
