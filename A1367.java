
package solution800;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class A1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
//        char = 'b';
//        int result = char - 'a'; // this will give result = 2;
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            
            StringBuilder sb = new StringBuilder();
            
            for(int i = 0; i < s.length(); i += 2){
                sb.append(s.charAt(i));
            }
            sb.append(s.charAt(s.length() - 1));
            String result = sb.toString();
            System.out.println(result);
        }
        sc.close();
    }
}