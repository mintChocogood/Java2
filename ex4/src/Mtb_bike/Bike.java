package Mtb_bike;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2

public class Bike implements Mtb_bike{
	int Max_speed;			// 최대속도			
	int Current_speed;		// 현재속도
	int time;				// 시간
//	boolean notProblem;
	private int cur;
	int distance;			// 거리
	boolean stop;			// 정지
	
	public void distance() {
		this.distance = 20;
		log.trace("목적지까지의 거리는" + this.distance + "Km입니다.");
	}
	
	public Bike() {
		;;
	} // 기본생성자
	
	
//	public Bike (int Max_speed, int Current_speed) {
//		this.Max_speed = Max_speed;
//		this.Current_speed = Current_speed;
//	} // bike
	
//							    평균속도
	 public void timeTaken(int averageSpeed, int distance) {
	      int moveLength=0;
	      int minute = 0;
	      while ((distance*1000) > moveLength) {
	         int meterPerMinute = averageSpeed*1000/60;
	         moveLength += meterPerMinute;
	         minute++;
	      }
	      System.out.println(minute + "분 후, " + distance +"km 떨어진 목적지에 도착하였습니다.");
	   } // 걸리는 시간
	
	public int Gear_Stage(int c) {
		int b;
		switch(c) {
		case 1: 
			System.out.println("현재 기어가 1단입니다.");
			return b = 40;	// 기어의 톱니갯수
		case 2:
			System.out.println("현재 기어가 2단입니다");
			return b = 35;
		case 3:
			System.out.println("현재 기어가 3단입니다");
			return b = 30;
		case 4:
			System.out.println("현재 기어가 4단입니다");
			return b = 25;
		case 5:
			System.out.println("현재 기어가 5단입니다");
			return b = 20;
			
		default:
			System.out.println("더 이상 기어를 올릴 수 없습니다.");
			return b = 20;
		} // switch
	
	} // 기어의 단수

	@Override
	public void brake() {
		if(stop) {
			log.trace("브레이크를 잡아 멈춘다.");
		} else
		log.trace("브레이크를 잡아 속도를 줄입니다.");
	} // 브레이크

	@Override
	public void put_on() {
		log.trace("자전거 지지대를 세운다");
	} // 자전거 지지대

	@Override
	public void pull_down() {
		log.trace("자전거 지지대를 내린다");
	} // 자전거 지지대

	@Override
	public void lock_On() {
		log.trace("자물쇠를 검");
	} // 자물쇠

	@Override
	public void lock_Off() {
		log.trace("자물쇠를 품");
	} // 자물쇠

	@Override
	public void pedal_slow() {
		log.trace("느린속도로 주행합니다.");
	} // 주행속도

	@Override
	public void pedal_nomal() {
		log.trace("정상속도로 주행합니다.");
	} // 주행속도

	@Override
	public void pedal_fast() {
		log.trace("빠른속도로 주행합니다.");
	} // 주행속도

	
	
	@Override
	public void height() {
		
		log.trace("안장의 높이를" + cur + "조절하였습니다" );
	} // 안장의 높이

	@Override
	public void tire() {
		// TODO Auto-generated method stub
		
	} // 기존 타이어

	@Override
	public void fixTire() {
		// TODO Auto-generated method stub
	} // 수리한 타이어

	@Override
	public void current(int cur) {
		if(cur > Mtb_saddle.Max_height) {
			this.cur = Mtb_saddle.Max_height;
		} else if(cur < Mtb_saddle.Min_height) {
			this.cur = Mtb_saddle.Min_height;
		} else {
			this.cur = cur;
		} // if else if
	} // current 메소드
	
	@Override
	public void bell() {
		
	} // 벨
	
} // end class
