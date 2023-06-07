package FileOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import lombok.Cleanup;

public class FileOutputStreamExample {		// 파일 복사

	public static void main(String[] args) {
		String Sfile = "C:/temp/eclipse-inst-jre-win64.exe";
		String Tfile = "C:/temp/eclipse-inst-jre-win64-copy.exe";
		
		try{// 2개의 입/출력 스트림 필요: 복사를 위해
		 @Cleanup FileInputStream fis = new FileInputStream(Sfile); 		// 바이트기반
		 @Cleanup FileOutputStream fos = new FileOutputStream(Tfile);		// 바이트기반
		
		int readByteNo;	// 실제 읽어낸 바이트 개수
		
		byte[] readBytes = new byte[100];
		
		while((readByteNo = fis.read(readBytes)) != -1 ) { // EOF(-1)
			
			fos.write(readBytes, 0, readByteNo); // 출력버퍼(기본8K)에 write 수행
		} // while
		
		fos.flush();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		System.out.println("복사완료");
	}

}
