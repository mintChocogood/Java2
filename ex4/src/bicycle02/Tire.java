package bicycle02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
@AllArgsConstructor
public class Tire {

	int minPSI; // 최저 공기압
	int maxPSI; // 최고 공기압
	String type; // 타이어 종류
	
} // end class
