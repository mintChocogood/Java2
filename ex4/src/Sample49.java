
public class Sample49 {

	public static void main(String[] args) {
        // Step.1 2차원 배열(2x3 shape) 생성
		int[][] mathScores = new int [2][3];
		
		// Step.2 2차원 배율의 순회(Traverse)

		// Step.2-1 첫번째 차원(바깥쪽) 배열의 순회
		for(int i = 0; i <mathScores.length; i ++) {
			
			// Step.2-2 두번째 차원(안쪽) 배열의 순회
			for(int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
				
			} // Inner for
		} // Outer for
		
		
		
		
		
		
		
		
		
	} // main
} // end class
