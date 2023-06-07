package 보조스트림;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class DataInputOutputStreamExample {

	
	// 핵심포인트:
	// 프로그램이 다양한 "기본타입"의 변수를 가지고, 입/출력을 수행할 수 있도록,
	// 보조해주는 보조스트림으로 DataInput/OutputStream이 있습니다.
	public static void main(String[] args) throws Exception {
//	FileOutputStream fos = new FileOutputStream("C:/temp/primitive.dat");
//	DataOutputStream dos = new DataOutputStream(fos);
//	
//	try(fos; dos;){ // 항상 보조스트림부터닫고 그 다음에 기본스트림 
//		dos.writeUTF("홍길동");
//		dos.writeDouble(95.5);
//		dos.writeInt(1);
//		dos.writeBoolean(false);
//		
//		dos.writeUTF("김자바");
//		dos.writeDouble(90.3);
//		dos.writeInt(2);
//		dos.writeBoolean(true);
//		
//		dos.flush();
//	} // try-with-resources
		
	FileInputStream fis = new FileInputStream("C:/temp/primitive.dat");
	DataInputStream dis = new DataInputStream(fis);
	
	try(fis; dis;){
	for(int i =0; i<2; i++) {	// 한번만 읽기위해 i<2
		
		// 파일에 쓰여진 다양한 타입의 값을 다시 읽을수 있지만
		// 파일에 쓰기한 순서대로 다시 읽어내야 함!
		String name= dis.readUTF();
		double score = dis.readDouble();
		int order = dis.readInt();
		boolean gender = dis.readBoolean();
		
		log.info("name: {}, score: {}, order: {}, gender: {}",
				name, score, order, gender);
		
	}
	} // for
		
		 
		
					
	}

}
