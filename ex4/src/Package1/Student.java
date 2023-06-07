package Package1;


// 학생은 사람을 "상속" 합니다 => 자식클래스: 학생, 부모클래스: 사람
// <자식클래스이름> extends <부모클래스이름>
public class Student extends People{
	public int studentNo;
	
	
	public Student(String name, String ssn, int studentNo) {
		// 부모객체부터 먼저 생성되고 초기화 되어야 한다
		super(name, ssn);	// 때문에, 부모 클래스의 생성자를 가장 먼저 호출
		System.out.println("1. 이름: " + super.name); // (***)
		this.studentNo = studentNo;
		
		super.name = "부모이름";		// 부모객체의 필드 값 변경
		System.out.println("2. super.name: " + super.name);
		
		this.name = "아들이름";			// 상속받은 필드 값 변경
		System.out.println("3. super.name: " + super.name);
		System.out.println("4. this.name: " + this.name);
	} // 생성자

} // end class
