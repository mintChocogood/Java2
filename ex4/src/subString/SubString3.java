package subString;

import java.io.*;
import java.util.*;

public class SubString3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        int len = sc.nextInt();
        ArrayList<String> list1 = new ArrayList<>();
        for (int i=0;i<first.length()-len+1;i++){
            list1.add(first.substring(i,i+len));
        }
        Collections.sort(list1);
        System.out.println(list1.get(0));
        System.out.println(list1.get(list1.size()-1));
    }
}
