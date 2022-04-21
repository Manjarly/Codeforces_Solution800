package solution800;

import java.util.*;

public class A116 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0;
        int total = 0;

        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                total += a[i];
                max = Math.max(max, total);
            } else {
                total -= a[i];
            }
        }
        System.out.println(max);
    }
}
