package pa.pb.pc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Getter
@AllArgsConstructor
@Log4j2
@NoArgsConstructor
public class A1 {
	 private String name;
	 private int age2;
	
	
	
public void instatnceMethod() {
		log.trace("인스턴스 메소드 호출1");
	}


} // end class
