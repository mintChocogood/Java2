package Package1;

		// 상속에 제한되는 조건:
		// (1) 부모클래스에서 private 접근제한을 필드와 메소드는 상속에서 제외
		// (2) 부모클래스에서 default 접근제한을 가지는 필드+메소드 역시제외
		//     (부모와 자식 클래스의 패키지가 서로 다른 경우에 해당)




public class StudentExample {

	public static void main(String[] args) {
		// 1. 자식객체 생성 => 부모없는 자식없다(부모객체부터 먼저생성)
		Student 피플 = new Student("김계란", "15-71007793", 1);
		Student 피플2 = new Student("으뜸", "15-71007793", 1);
		
		// 2. 상속받은 필드와 메소드를 사용
		피플.name = "기서";
		System.out.println(피플.name);
		피플2.name = "힘으뜸";
		System.out.println(피플2.name);
		System.out.println("이름 : " + 피플.name);
		System.out.println("번호 : " + 피플.ssn);
		System.out.println("학생번호 : " + 피플.studentNo);
		
	} // main
	
	
	
} // end class
