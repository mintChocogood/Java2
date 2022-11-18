
public class Sample31 {

	public static void main(String[] args) {
		
		int from = 81;
		int to = 100;
		
		int score = (int)(Math.random() * (to - from + 1)) + from;
		
		System.out.println("점수: " + score);
		
		String grade;
		
		if (score >= 90) {
			
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		}else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
