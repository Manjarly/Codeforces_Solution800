
package solution800;

import java.util.*;
public class A50 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int dominoSize = 2;
        int space = m*n;
        System.out.println(space/dominoSize);
    }
}
