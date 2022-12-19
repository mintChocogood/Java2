package pa.pb.pc;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@NoArgsConstructor
@Log4j2
public class TTT {

	public static void main(String[] args) {
		
		// 첫번째 핵심포인트:
		// 부모클래스 A의 기본생성자를 이용해서,
		// 익명자식객체를 생성하는 코딩기법을 배워보즈아
		
		// Lvalue = Rvalue
		// Lvalue는 부모타입의 참조변수를 선언(그릇준비)	
		// Rvalue는 "익명자식객체" 라는 것을 만들어 냅니다. (다형성-1)
		//			문법: new 부모타입의 생성자() { ;; }; => "익명자식객체 생성"
		
		A1 a = new A1() { 		// 익명자식클래스의 블록
			
			// 익명자식객체의 클래스 블록안에 선언된 필드와 메소드는
			// 익명자식객체 안에서만 사용가능
			// 단 예외는, 재정의(Override)된 메소드는 부모타입의 참조변수로 호출
			// 가능(다형성-2)
			public String childName;
			public int childAge;
			public static final double PI = 3.14159;
			
			
			@Override
			public void instatnceMethod() {
				log.trace("인스턴스메소드 호출3");
				log.info("익명자식에서 다르게 구현합니다.");
				log.info("\t + this: {}", this);
			} // instatnceMethod
		
			public void childInstance() {	// 인스턴스 메소드
				log.trace("인스턴스메소드 호출4");
			} // child 메소드
			
			public static void childStatic() {	// 정적 메소드
				log.trace("정적메소드 호출");
			} // child 정적 메소드 ^_^
		
		}; // 다형성-1	: "익명자식객체"
		log.info("1. a: {}" , a);
		
		a.instatnceMethod();	// 다형성-2
		
//		다형성-1 상태에서, 자식객체를 강제형변환을 통해
//		끄집어내는 것은 허용되지 않습니다.
//		TTT$1 child = (TTT$1) a;	// XX 
		
//		======================
		
		A1 a2 = new A1("기서", 14) {
			
			public String getParentName() {
				return this.getName();
			} // getParentName
			
			public int getParentAge() {
				return this.getAge2();
			} // getParentAge
			
		};	// 익명자식객체 생성 코딩기법
		
		log.info("2. a2: {}" , a2);
//		log.info("\t + parentName: {} ", a2.getParentName());	// XX
		log.info("\t + parentName: {} ", a2.getName());			// OK
		
		log.info("\t + parentName: {} " , a2.getAge2()); 		// OK
		A1 a5 = new A1() {
			;; };
					
		log.info("3. A3: {}" , a5);
		
		
	} // main

} // end class
