package file;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class TTT {

	public static void main(String[] args) {
		Date now = new Date();
		log.info("1. now : {}" , now);
		
		// 1970.01.01 00:00:00 ~ 현재날짜와 시간까지 흐른 밀리초를 long으로 반환
		long nowTime = now.getTime();
		log.info("2. nowTime: {}" , nowTime);
		
//		---
		
		// 날짜와 시간정보를, 우리가 원하는 형태로 출력시키자!!
		// 지정된 파일을 복사해서, yyyyMMddHHmmss 형식의 폴더에 100번 저장하세요.
		String format = "yyyy/MM/dd HH:mm:ss.SSS";
		DateFormat df = new SimpleDateFormat(format);
		System.out.println( df.format(now) );
		
		
	} // main
} // end class
