package Mtb_bike;

public interface Mtb_saddle {
	public int Max_height = 10;		// 안장의 최대 높이
	public int Min_height = 1;		// 안장의 최소 높이	
	void current(int cur);		// 안장의 현재 높이
	
	public abstract void height();	// 추상 메소드
	
} // interface
//System.out.println("안장의 높이를" + a + "만큼 조절하였습니다.");