package solution800;

import java.util.*;

public class A282 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n-- > 0){
            String s = sc.next();
            if(s.charAt(1) == '+') count++;
            else if(s.charAt(1) == '-')count--;
        }
        System.out.println(count);
    }
}
