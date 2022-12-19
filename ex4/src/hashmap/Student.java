package hashmap;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ToString
@EqualsAndHashCode
@AllArgsConstructor

// Map 컬렉션의 요소로 넣을 학생객체를 생성할 클래스
public class Student {
	public int sno;		// 학번
	public String name;	// 이름
	
	@Override
	protected void finalize() throws Throwable {
		log.trace("finalize() 실행됨.");
		
//		log.info("1. sno: {}, name : {}", this.sno, this.name);
		log.info(this.hashCode());
	} // finalize
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student student = (Student) obj;
//			return(sno==student.sno) && (name.equals(student.name));
//		} else {
//			return false;
//		} // if-else
//	} // equals
//	
//	@Override
//	public int hashCode() {
//		return sno + name.hashCode();
//	}
	
} // end class
