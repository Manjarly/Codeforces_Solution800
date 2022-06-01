
package solution800;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class A723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
//        char = 'b';
//        int result = char - 'a'; // this will give result = 2;
        
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        
        int result1 = Math.abs(x1 - x2) + Math.abs(x1 - x3);
        int result2 = Math.abs(x1 - x2) + Math.abs(x2 - x3);
        int result3 = Math.abs(x1 - x3) + Math.abs(x2 - x3);
        
        int result = Math.min(Math.min(result1, result2), result3);
        System.out.println(result);
        sc.close();
    }
}
