package stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// 선입선출(FIFO) 방식의 새로운 Q객체 생성
		Queue<Message> mes = new LinkedList<>();
		
		// 지정된 타입의 새로운 요소객체를 Q에 넣음
		mes.offer(new Message("sendMail", "홍길동"));
		mes.offer(new Message("sendSMS", "신용권"));
		mes.offer(new Message("sendKakaotalk", "홍두께"));
		
		// Q가 모두 빌 때까지(empty), 하나씩 요소객체를 끄집어 내어 사용
		while(!mes.isEmpty()) {
			Message mes2 = mes.poll();	// Q에서 하나의 요소객체를 끄집어 냄
			
			switch(mes2.command) {
			case "sendMail":
				System.out.println(mes2.to + "님에게 메일을 보냅니다"); break;
			case "sendSMS" :
				System.out.println(mes2.to + "님에게 SMS를 보냅니다"); break;
			case "sendKakaotalk" :
				System.out.println(mes2.to + "님에게 카카오톡을 보냅니다."); break;
			} // switch
		} // while
	} // main

} // end class
