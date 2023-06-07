package bicycle_polymorphism;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Chain {
	
	
	boolean isoiledchain; 
	//체인이 기름칠됐는지   --- instance field


	public void chainRotate(){
		
		log.trace("chainRotate() invoked.");
		log.info("체인이 돌아갑니다.");
	}

}
