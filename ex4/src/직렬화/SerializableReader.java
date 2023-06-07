package 직렬화;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class SerializableReader {

	
	// 핵심포인트: 다양한 유형의 필드를 가지고 직렬화된 ClassA타입의 객체를 역직렬화해서
	//			   객체로 다시 복원하였을 때의, 각 필드의 상태를 확인하여, 각 유형별 필드가
	//			   과연 어떻게 직렬화/역직렬화 되었는지, 아니면 제외되었는지 등을 확인해보자!!!
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try(fis; ois;){
			ClassA obj = (ClassA) ois.readObject(); // 다형성-1로 반환 => 강제형변환
			
//			=======아래의 필드가 어떻게 복원되었는지 집중!!! ====
			log.info("field1: " + obj.field1);
			log.info("field2.field1: " + obj.field2.field1);
			log.info("ClassA.field3: " + ClassA.field3);
			log.info("field4: " + obj.field4);
			
			log.info("obj: {} ",  obj);
		} // 트라이
		
	} // main

} // end class
