package 연습;

import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class 트리셋익셈플 {

	public static void main(String[] args) {
		TreeSet<String> str = new TreeSet<>();
		
		str.add("가");
		str.add("나");
		str.add("라");
		str.add("다");
		log.info("1. str: {}",str);
		
	}

}
