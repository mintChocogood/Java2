
public class TTT {

	public static void main(String[] args) {
		
		//Enhanced for 문으로 배열 순회 방법
		// 기본 베이스 for(   :   ) {} 를 먼저 타이핑 한 후 작성에 헷갈리지 않도록 유의
		
		// int 2차원
		int[][] myArr = {{1,2,3}, {4,5}, {6}, {7}};
		
		for(int[] arr1D : myArr) {
			for(int intVal : arr1D) {
				System.out.println(intVal + ", ");
			} // Inner for
		} // Outer for
		
		// boolean 2차원
		boolean[][] boolArr2D = new boolean[3][7];
		
		for(boolean[] bool1D : boolArr2D) {
			for(boolean booArr : bool1D){
				System.out.println(booArr);
			} // Inner for
		} // Outer for
		
		int[] arr1D = {1, 2, 3, 4, 5, 6, 7};
		
		for(int arrVar : arr1D) {
			System.out.print(arrVar);
		}
		
		
		
		for(int index = arr1D.length - 1; index>=0; index--){
			if(arr1D[index] % 2 == 0) {     

	
		
		
		
		
	} // main
		}
	
	}
	}// end class
