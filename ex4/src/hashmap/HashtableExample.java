package hashmap;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import lombok.Cleanup;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class HashtableExample {

	// 핵심포인트: HashMap과 구현은 동일하지만, 차이점은 Thread-Safe하다!
	//			   그래서 실전에서 가장 많이 사용된다!!
	public static void main(String[] args) {
		@Cleanup("clear")
		Map<String, String> map = new Hashtable<>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		log.info("1. map : {}", map);
		
//		----
		
		// Map 컬렉션에 저장해놓은 회원들의 아이디와 비밀번호를 입력함
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			log.info("아이디와 비밀번호를 입력해주세요.");
			
			System.out.println("아이디: ");
			String id = sc.nextLine();			// Blocking I/O
			
			System.out.println("비밀번호: ");
			String password = sc.nextLine();	// Blocking I/O
			
//			System.out.println();
//			log.info("");
			
			if(map.containsKey(id)) {
				
				if(map.get(id).equals(password)) {
					System.out.println(">> 로그인 되었습니다");
					break;
				}else {
					System.out.println(">> 비밀번호가 일치하지 않습니다.");
				} // if else
				
			}else {
				System.out.println(">> 입력하신 아이디가 존재하지 않습니다.");
			} // if-else
		} // while
		
	} // main

} // end class
