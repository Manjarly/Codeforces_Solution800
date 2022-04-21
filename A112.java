package solution800;

import java.util.*;

public class A112 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.toLowerCase().charAt(i) == s2.toLowerCase().charAt(i)) {
                continue;
            } else {
                if (s1.toLowerCase().charAt(i) < s2.toLowerCase().charAt(i)) {
                    count = -1;
                    break;
                } else {
                    count = 1;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
