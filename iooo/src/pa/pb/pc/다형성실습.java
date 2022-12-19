package pa.pb.pc;

public class 다형성실습 {

	
	// 같은 타입이지만 실행 결과가 다양한 객체 대입(이용) 가능한 성질
	public static void main(String[] args) {
		동물 animal = new 강아지();		// 다형성1
		animal.사운드();				// 다형성2
		
		animal = new 고양이();			// 다형성1
		animal.사운드();				// 다형성2
		
		animal = new 사람();			// 다형성1
		animal.사운드();				// 다형성2
		
		animal = new 동물();			// 다형성1
		animal.사운드();				// 다형성2
	
		
	} // main

} // end class
