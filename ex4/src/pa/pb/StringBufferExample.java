package pa.pb;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringBufferExample {

	public static void main(String[] args) {

		String s = "ㅅㅅ" + "ㅇㅇ" + "ㄴㄴ";
		
		StringBuffer a = new StringBuffer();
		
		a.append('a').append('b');
		
		log.info("a: {}", a.reverse().toString());
		
	} // main

} // end class
