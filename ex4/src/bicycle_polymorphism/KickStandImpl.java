package bicycle_polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class KickStandImpl implements KickStand {

	@Override
	public void upper() {
		log.info("자전거 지지대를 올립니다.");
	}//upper

	@Override
	public void lower() {
		log.info("자전거 지지대를 내립니다.");
	}//lower

}//end class
