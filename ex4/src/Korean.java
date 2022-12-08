
public class Korean {

	// 1. 필드 (1) 고유속성 (2) 상태 (3) 부품
	
	
	// 이렇게 하드코딩(리터럴로 값을 미리결정) 하지말라!
	String nation = "대한민국";   // 그러면 이게 틀린건지 맞는건지??
	String name;                  // 클래스 이름이 Korean을 이기에 그에 따라 나라값
	String ssn;                   // 을 미리 정해두어도 크게 문제는 없다 하지만 권장X
	
	// this 키워드 : 
	//  (1) 이 클래스에서 앞으로 생성될 객체의 레퍼런스(주소)를 가지는 키워드
	//  (2) 클래스 내부에서만 사용가능!! (생성자 블록, 메소드 블록에서 사용가능)
	//  (3) 2가지의 역할을 수행:
	//      가. 필드의 이름과 매개변수의 이름이 충돌 => 이름충돌을 해결
	//      나. 오버로딩된 다른 생성자를 호출=> 문법이 다르다: this();
       public Korean(String name, String ssn) {
	    System.out.println("Korean::Constructor invoked");
    	   
    	// 이름 충돌
		this.name = name;
		this.ssn = ssn;
		this.nation = "korea";
       } // 생성자 !=기본 생성자

       public Korean(String name, String ssn, String nation) {
    	   System.out.println("Korean::Constructor invoked");
    	   
    	   this.name = name;
    	   this.ssn = ssn;
    	   this.nation = nation;
       }


}
