package pa.pb.pc;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@ToString
@Log4j2
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class Parent {
   public String name = "R";
   public int age = 20;
   
   public void method1() {
      log.trace("method1() invoked.");
   } // method1
   
   public void method2() {
      log.trace("method2() invoked.");
   } // method2
   
//   public void method3() {
//	      log.trace("method3() invoked.");
//	   } // method2
   
   
   
   
   
   
   
//   ===============================================================
   
   public static void main(String[] args) {
      log.trace("main({}) invoked.", "정말?");
      
      Parent p = new Parent();
      p.method1();
      p.method2();
      
      log.info(p);
   }

public void parentMethod() {
	// TODO Auto-generated method stub
	
} // main
   
} // end class
