
package solution800;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class A432 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
//        char = 'b';
//        int result = char - 'a'; // this will give result = 2;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] y = new int[n];
        
        for(int i = 0; i < n; i++){
            y[i] = sc.nextInt();
        }
        Arrays.sort(y);
        int team = 0;
        for(int i = 0; i <= n-3; i+= 3){
            if(y[i] <= 5 - k && y[i+1] <= 5 - k && y[i+2] <= 5 - k) team++;
        }
        System.out.println(team);
        sc.close();
    }
}