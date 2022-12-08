package 조별활동;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class 뻐꾸기 extends 새 {
	@Override
	public void cry() {
	log.trace("뻐꾸기가 울다");
	log.info("1. {}         {}", "뻐꾹", "참새");
	}

} // end class
