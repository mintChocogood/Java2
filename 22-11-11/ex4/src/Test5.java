
public class Test5 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
	      int max = 45;
	      int num1 = (int) (Math.random() * max) + 1; // 첫 번째 로또 번호
	      int num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0; 
	      // 변수 미리 초기화
	      // 이유 : 모든 랜덤 값들을 변수에 담아서 비교를 한 뒤 
	      // 저장하고 다음에 출력을 하려고 했는데, 
	      // 비교를 하려면 먼저 변수에 어떠한 값이 존재는 해야 
	      // 그 값과 비교를 할 수 있으니까?
	      // 그래서 랜덤 수로 나오지 않을 수인 0으로 먼저 초기화를 하고 
	      // 비교를 할 수 있게 만드는 장치를 마련하였음.
	            
	      int rand; // 랜덤 수를 임시로 꺼내어 둘 변수

	      for (int i = 1; i < 6; i++) {
	         rand = (int) (Math.random() * max) + 1;
	         if (num1 == rand) {
	            i--;
	            continue;
	         } else {
	            if (num2 == 0) {
	               num2 = rand;
	               continue;
	            } else if (num2 == rand) {
	               i--;
	               continue;
	            }
	            if (num3 == 0) {
	               num3 = rand;
	               continue;
	            } else if (num3 == rand) {
	               i--;
	               continue;
	            }
	            if (num4 == 0) {
	               num4 = rand;
	               continue;
	            } else if (num4 == rand) {
	               i--;
	               continue;
	            }
	            if (num5 == 0) {
	               num5 = rand;
	               continue;
	            } else if (num5 == rand) {
	               i--;
	               continue;
	            }
	            if (num6 == 0) {
	               num6 = rand;
	               continue;
	            } else if (num6 == rand) {
	               i--;
	               continue;
	            } // inner if-else
	         } // outer if-else
	      } // for

	      System.out.println("로또 번호 : " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6);
	      long end = System.currentTimeMillis();
	      System.out.println(end - start + "ms");

		
	}

}
