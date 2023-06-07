
public class Person2Example {

	public static void main(String[] args) {
		// ssn, name instance field 초기화 하면서, 객체 생성
		Person2 p1 = new Person2("123456-1234567" , "풍성충", 19);
		// 필드값 출력
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println(p1.age);
		// 필드값을 수정해보자! -> 그래서 final 키워드의 의미를
		// 이해하자
		
//		p1.nation = "usa";         // final키워드를 사용했기 떄문에 변경x
//		p1.ssn = "654321-765421";
		
		p1.name = "대머리";
	} // main

} // class
