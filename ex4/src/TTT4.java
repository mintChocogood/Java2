import java.util.Arrays;

public class TTT4 {

	public static void main(String[] args) {

//		int i = 1;
//		
//		while(i<=20) {
//		if( i % 5 == 0)	{System.out.println(i + ": 5의 배수입니다.");
//		} else {
//			System.out.println(i + ": 5의 배수가 아닙니다.");
//		}
//	i++;
//	}
              
			
			for(int i = 1; i<=20; i++) {
				if(i % 5 == 0) {
					System.out.println(i + ": 5의 배수입니다.");
				}else {
					System.out.println(i + ": 5의 배수가 아닙니다.");
				}
			}
		
//		--------------------------------------------------------------
		for(int k = 1; k<= 20; k++) {
			
		
		switch( k % 5 ) {
		case 0 : System.out.println(k + ": 5의 배수입니다.");
		default : System.out.println(k + ": 5의 배수가 아닙니다.");
		}
		}
		
		int[] arr = new int[4];
		
		for(int g = 0; g<arr.length; g++) {
			arr[g] += (10 + g);
	
		
		}
		System.out.println(arr);
		
		
}
}