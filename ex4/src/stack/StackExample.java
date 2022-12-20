package stack;

import java.util.Stack;

import lombok.extern.log4j.Log4j2;
@Log4j2
public class StackExample {

	// 자바언어의  Locking 매커니즘으로 "Mutex"를 사용
	// LIFO(후입선출) 형식의 자료구조 테스트
	public static void main(String[] args) {
		// Step.1 스택에 저장할 요소의 구체타입으로 Coin 타입 지정
		Stack<Coin> coinBox = new Stack<>();
		
		// Step.2 스택에 새로운 요소객체(Coin)추가
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		// Step.3 스택에 모든 요소를 하나씩 끄집어내면서(pop),
		//		  스택이 빌 때까지, 동전을 꺼냄(isEmpty getter 이용)
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();	// pop 메소드로 꺼낵 동전요소객체
			
			log.info("coin: {}원", coin.getValue() );
		}
		
		
		
		
	} // main

} // end class
