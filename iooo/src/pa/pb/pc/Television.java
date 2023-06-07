package pa.pb.pc;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Television implements RemoteControl{

		//필드
		private int volume;
		
		
		@Override
		public void turnOn() {
			log.trace("켭니다 호출.");
		} // turnOn

		@Override
		public void turnOff() {
			log.trace("끕니다 호출");
		} // turnOff

		@Override
		public void setVolume(int volume) {
			log.trace("setVolume({}) 호출.", volume);
			
			if(volume > RemoteControl.최대_볼륨) {
				this.volume = RemoteControl.최대_볼륨;
			} else if(volume < RemoteControl.최소_볼륨) {
				this.volume = RemoteControl.최소_볼륨;
			} else {
				this.volume = volume;
			} // if else if else
			
			log.info("현재 TV 볼륨: {}", volume);
		} // setVolume

	}


