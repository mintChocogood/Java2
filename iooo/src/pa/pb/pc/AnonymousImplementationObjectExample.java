package pa.pb.pc;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AnonymousImplementationObjectExample {

	public static void main(String[] args) {

//		IPerson parent = new 존나졸림진짜말도안되게졸림Impl();	// 요렇게 하는게 가능은 하지만 구지 소스파일 만들 필요는 없슴.
		존나졸림진짜말도안되게졸림Impl sl = new 존나졸림진짜말도안되게졸림Impl();
		
		IPerson person1 = new IPerson() {
			
			@Override
			public void sleep() {
				log.trace("꿀잠() 호출.");
			} // sleep
		}; // 익명구현객체 생성~ 구지구지 소스안만들고 좀 간편한코드들은 이렇게!
		
		IPerson person2 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person3 = new IPerson() {
			@Override
			public void sleep() {
				log.trace("꾸울잠() 호출.");             
			}
		}; // 익명구현객체 생성
		
		IPerson person4 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person5 = new IPerson() {
			@Override
			public void sleep() {
				
			}
		}; // 익명구현객체 생성
		
		IPerson person6 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person7 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person8 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person9 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person10 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person11 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person12 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person13 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person14 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person15 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person16 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person17 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person18 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person19 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		IPerson person20 = new IPerson() {
			@Override
			public void sleep() {
				;;
			}
		}; // 익명구현객체 생성
		
		person1.sleep();
		person2.sleep();
		person3.sleep();
		person4.sleep();
		sl.sleep();
		sl.goodSleep();
} // main
	
} // end class
