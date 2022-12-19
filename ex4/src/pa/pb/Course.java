package pa.pb;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Course<T> {
	private String name;			// 과정명
	private T[] students;			// 수강생을 관리할 배열

	
	public Course(String name, int capacity) { // 인스턴스 필드의 초기화
		this.name = name;
		
	// ==============주의=============== //
	// 타입파라미터를 원소의 타입으로 가지는 배열객체를 생성하려면
	// 아래와 같이, 
//		(1) 먼저 Object 타입의 배열을 생성한 이후에,
	//  (2) 강제 형변환을 통해, T[] 배열을 만들어야 함 (문법)
	// ================================= //
	
		students = (T[]) (new Object[capacity]);
//		this.students = new T[capacity];     // XX : 문법에 맞지않음
	} // 생성자
	
	// 이 과정에 새로운 수강생을 등록하는 메소드
	public void add(T t) {
	log.trace("add({}) 실행됨.", t);
	
	// 아래의 반복문과 코드는, 수강생을 저장하는 배열을 순회하면서,
	// 비어있는 인덱스의 위치에 새로운 수강생을 저장하는 로직입니다.
	
	for(int i = 0; i< students.length; i++) {
		if(students[i] == null) {	// 특정 인덱스의 원소가 null 이면
			students[i] = t;		// 이 인덱스의 원소로 새로운 수강생 t를 설정
			
			break;					// 설정했으면 더 이상 순회할 필요가 없으므로, 
		} // if						// 바로 반복문 종료
	} // for
	} // add

	
	
	
} // end class
