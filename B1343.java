
package solution800;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class B1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
//        char = 'b';
//        int result = char - 'a'; // this will give result = 2;
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n % 4 != 0){
                System.out.println("NO");
                continue;
            }
            else{
                System.out.println("YES");
                for(int i = 1; i <= n/2; i++){
                    System.out.print(i*2 +" ");
                }
                for(int i = 1; i < n/2; i++){
                    System.out.print(i*2 -1 +" ");
                }
            }
            System.out.println(3*(n/2) - 1 +" ");
            
        }
        sc.close();
    }
}