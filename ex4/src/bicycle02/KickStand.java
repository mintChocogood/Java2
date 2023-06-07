package bicycle02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
@AllArgsConstructor
public class KickStand {
	
	int length; // 길이
	String color; // 색상
	String type; // 종류
	String position; // 지지대의 설치 위치
	
	public void upper() {
		log.info("지지대를 접었습니다.");
	} // upper
	
	public void lower() {
		log.info("지지대를 세웠습니다.");
	} // lower
	
} // end class
