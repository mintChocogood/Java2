package Implement_classs;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RemoteControl {

	public static void main(String[] args) {

		RemoteControl rc = new RemoteControl() {
			
			public String name = "기서";
			public int age = 23;
			
			public void 나의메소드() {
				log.trace("어나니머스 나의메소드() 호출.");
				log.error(">>>> this. {}, this");
			} // 턴온
			
			@Override
			public void turnOn() {
				log.trace("켜짐() 호출");
			}
			
			
		};
	}	//main

	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

}
