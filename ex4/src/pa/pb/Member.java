package pa.pb;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;


@EqualsAndHashCode			// 이중판정 알고리즘
@Log4j2
@ToString
@AllArgsConstructor
public class Member {	// 회원을 모델링해서 만든 클래스
	public String name;
	public int age;

//	public Member(String name, int age) {
//		log.trace("생성자({}, {}) 실행됨", name, age);
//		
//		this.name = name;
//		this.age = age;
//	} // 생성자
	
//	@Override
//	public boolean equals(Object obj) {
//		log.trace("equals({}) 실행됨.", obj);
//		
//		if(obj instanceof Member othermember) {
////			Member member = (Member) obj;
//			return othermember.name.equals(name) && (othermember.age==this.age);
//			
//		}else {
//			return false;
//		} // if-else
//	} // equals
//	
//	@Override
//	public int hashCode() {
//		log.trace("해시코드() 실행됨.");
//		
//		return this.name.hashCode() + this.age;
//	} // hashCode
	
} // end class
