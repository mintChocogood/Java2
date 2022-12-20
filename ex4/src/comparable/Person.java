package comparable;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
@Log4j2
@ToString
@AllArgsConstructor
public class Person implements Comparable<Person> {

	public String name;
	public int age;
	
	
	@Override
	public int compareTo(Person otherPerson) {
		log.trace("compareTo({}) 실행됨", otherPerson);
		
		// 자바언어에서 "비교자(Comparator)"의 반환규칙(*_*!) 
		// if 기준사람 == 다른사람, return 0
		// if 기준사람 < 다른사람, return -1
		// if 기준사람 > 다른사람, return +1
		
		if(this.age < otherPerson.age) return -1;
		else if (this.age == otherPerson.age) return 0;
		else return +1;
	} // compareTo
	
} // end class
