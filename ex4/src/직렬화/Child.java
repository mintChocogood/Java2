package 직렬화;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@ToString
@Log4j2
@NoArgsConstructor
public class Child 
	extends Parent 
	implements Serializable {

	private static final long serialVersionUID = 1L;
	
//	public String field2;
	public double weight = 58.4;		// 신규 추가된 필드
	
		// 1. *** 출처: 애매모호함! -> 자바언어스펙문서에서만 언급됨!
		//        목적: 아래의 메소드 내에서, 직렬화 불가능한 부모객체의 필드를 개발자가 직접
		//        목적에 맞게 직렬화 할 수 있는 기회 제공
		private void writeObject(ObjectOutputStream out) throws IOException {
	   log.trace("writeObject() 실행됨", out);
		
	   // (1) 아래의 메소드는 직렬화 메소드가 아니라, 단순히 문자열 출력 메소드임
	   //	  중요한 것은,
	   //	  부모에게서 상속받은 직렬화 *불가능한 필드* 를 ****직접 직렬화**** 수행
	   out.writeUTF(field1);
	   
	   // (2) 아래의 메소드는 JVM이 원래 수행하는 직렬화 메소드임
	   out.defaultWriteObject();    // 기본 직렬화 수행 (***)
	   } // writeObject
	
	// 2. *** 출처: 애매모호함! -> 자바언어스펙문서에서만 언급됨!
//        목적: 아래의 메소드 내에서, 직렬화 불가능한 부모객체의 필드를 개발자가 직접
//              목적에 맞게 역직렬화 할 수 있는 기회 제공
//				개발자가 직접 목적에 맞게 ***역직렬화*** 할 수 있는 기회 제공
	private void readObject(ObjectInputStream in)
    throws IOException, ClassNotFoundException {
    log.trace("readObject({}) 실행됨.",in);
   
   // 아래의 메소드는 역직렬화 메소드가 아니라, 단순히 문자열 입력 메소드임
   // 부모에게서 상속받은 직렬화 불가능한 필드를 직접 역직렬화 수행
   field1 = in.readUTF();   
   
   // 아래의 메소드는 JVM이 원래 수행하는 역직렬화 메소드임
   in.defaultReadObject();     // 기본 역직렬화 수행 (***)
} // readObject
	
	// 개조때따~
	
	public static void main(String[] args) {
		
		


		
	} // main

} // end class
