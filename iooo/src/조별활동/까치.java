package 조별활동;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor
public class 까치 extends 새 {
	@Override
	public void cry() {
	log.trace("까치가 울다");
	log.info("까악");
	}

}
