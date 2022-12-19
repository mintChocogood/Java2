package pa.pb;

import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@ToString
@Log4j2
public class WildCardExample {

	Course<Person> course;
	Course<?> course2 = new Course<Person>("일반인과정", 5);
	
	
	
	
	
	
	
	
	// 모든 일반인을(Person)대상으로 하는 과정을 출력
	// 구체타입으로 ? 지정(***)
	public static void printCourse(Course<?> course) {
		log.trace("printCourse({}) 실행됨.", course);
	} // registerCourse
	
	// 2. 학생(Student)을 대상으로 하는 과정을 출력
	// 구체타입으로 ? 지정(***)
	public static void printCourseStudent(Course<? extends Student>course) {
		log.trace("printCourseStudent({}) 실행됨.", course);
	} // registerCourseStudent
	
	// 3. 근로자(Worker)를 대상으로 하는 과정을 출력
	// 구체타입으로 ? 지정(***)
	public static void printCourseWorker(Course<? super Worker> course) {
		log.trace("printCourseWorker({}) 실행됨." ,course);
	} // registerCourseWorker
	
	// ㄹㅇ 줜나졸리다 22-12-14 Time 20:50
	public static void main(String[] args) {
		
		
		// 실험
		
		Course<?> localCourse;
		
		// Rvlaue의 구체타입은 확실히 1개의 
		// 참조타입 이름으로 지정되어야 한다!
//		Course<?> localCourse2 = new Course<?>("과정이름", 0);	// XX
		Course<?> localCourse3 = 
//				new Course<java.io.Serializable>("과정이름", 0); // OK
				new Course<Throwable>("과정이름", 0);	// OK
		
		Course<?> localCourse2 =
				new Course<Runnable>("과정이름", 0);
		
		
		
		
		// 1. 첫번째 과정객체 생성(일반인, Person 대상)
		
		// Course.add(Person t) {...}
		Course<Person> personCourse = new Course<>("일반인과정", 5);  // @since 8
		
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));				// 다형성-1
		personCourse.add(new Student("학생"));				// 다형성-1
		personCourse.add(new HighStudent("고등학생"));		// 다형성-1
		
		// 2. 두번째 과정객체 생성(직장인, Worker 대상)
		
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		
		
		workerCourse.add(new Worker("직장인"));
//		workerCourse.add(new Person("일반인"));				// XX
//		workerCourse.add(new HighStudent("고등학생"));	    // XX
//		workerCourse.add(new Student("학생"));				// XX
		
		//----------------------------------------------------
		
		Course<Student> studentCourse = new Course<>("학생과정", 5);
		
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
//		workerCourse.add(new Worker("직장인"));				// XX
//		workerCourse.add(new Person("일반인"));				// XX
		
		//----------------------------------------------------
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생과정",5);
		highStudentCourse.add(new HighStudent("고등학생"));
		
//		------------------------------------------------------
		
//		printCourse(Course<?> course)
//		<?> wildcard : 구체타입으로 어떤 참조타입(클래스/인터페이스)
//		    		   이던 수용하겠다!
//		메소드의 매개변수와 전달인자를 한 줄의 실행문장으로 표현:
//		 예: 	Course<?> course = new Course<Person>("Name", 10);
		
		printCourse(personCourse);			// OK : Course<Person>
		printCourse(workerCourse);			// OK : Course<Worker>
		printCourse(studentCourse);			// OK : Course<Student>
		printCourse(highStudentCourse);		// OK : Course<HighStudent>
		printCourse(new Course<String>("이상한과정", 100));
		printCourse(new Course<Number>("이상한과정2", 100));
		printCourse(new Course<Runnable>("이상한과정3", 100));
		
		
		// case: printCourseStudent(Course<? extends Student> course)
		printCourseStudent(studentCourse);
		printCourseStudent(highStudentCourse);	// 이 두가지 외는 불가

		// case: printCourseStudent(Course<? super Worker> course)
		
		printCourseWorker(personCourse);
		printCourseWorker(workerCourse);	// 이 두가지 외는 불가
	} // main
	
} // end class
