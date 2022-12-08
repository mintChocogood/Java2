package 조별활동;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class 새_조합 {

	public static void main(String[] args) {
		
		새 bird = new 새();
		bird.cry();
		
		bird = new 참새();
		bird.cry();
		
		bird = new 뻐꾸기();
		bird.cry();
		
		bird = new 까치();
		bird.cry();
		
	} // main
	
} // end class
