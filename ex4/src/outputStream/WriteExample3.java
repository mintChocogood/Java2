package outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	// 핵심포인트: 바가지채로 출력버퍼에 write 할 때, 입력스트림의 바가지와 동일하게
	//			   바가지의 실제 사용크기를 제약할 수 있습니다(offset, length)
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/temp/test.txt");
		
		byte[] data = "ABCDFG".getBytes();
//					offset		length
		os.write(data,1 ,         2);			// <---------------- ***
		
		os.flush();
		os.close();
	}

}
