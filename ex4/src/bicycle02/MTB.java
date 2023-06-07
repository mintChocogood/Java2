package bicycle02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
//@NoArgsConstructor
@AllArgsConstructor
public class MTB extends BicycleImpl {
	
	String company; // 회사
	String color; // 색상
	String type; // 종류
	double weight; // 무게
	int number; // 고유번호
	int price; // 가격
	
	public MTB() {
		log.trace("오늘은 즐거운 주말!! 운동을 위해 MTB 자전거를 타고 뒷산을 넘어 타지역으로 갑니다.");
	} // default constructor
	
} // end class
