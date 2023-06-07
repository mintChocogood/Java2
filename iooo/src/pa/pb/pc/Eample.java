package pa.pb.pc;

public class Eample {

	public static void main(String[] args) {

		Implementation impl = new Implementation();		// 구현객체 생성
		
		InterfaceA ia = impl;		// 다형성-1 : 할아버지 품에 안김
		ia.메소드A();				// 다형성-2 : 재정의된 자식구현객체의 메소드가 호출됨
			
//		----
		
		InterfaceB ib = impl;		// 다형성-1 : 할아버지 품에 안김
		ib.메소드B();				// 다형성-2 : 재정의된 자식구현객체의 메소드가 호출됨			
		
//		---
		
		InterfaceC ic = impl;		// 다형성-1 : 할아버지 품에 안김
		ic.메소드A();				// 다형성-2 : 재정의된 자식구현객체의 메소드가 호출됨
		ic.메소드B();				// 다형성-2 : 재정의된 자식구현객체의 메소드가 호출됨
		ic.메소드C();				// 다형성-2 : 재정의된 자식구현객체의 메소드가 호출됨
		
		
		
		
		
		
		
		
		
		
	
	} // main

} // end class
