
package solution800;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class B1472 {
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
            int[] arr = new int[n];
            int totalSum = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i : arr){
                totalSum += i;
            }
            if(totalSum % 2 == 0){
                int eachSum = totalSum / 2;
                boolean[][] dp = new boolean[n + 1][eachSum + 1];
                for(int i = 0; i < n + 1; i++){
                    for(int j = 0; j < eachSum + 1; j++){
                        if(i == 0) dp[i][j] = false;
                        if(j == 0) dp[i][j] = true;
                    }
                }
                
                for(int i = 1; i < n + 1; i++){
                    for(int j = 1; j < eachSum + 1; j++){
                        if(arr[i - 1] <= j) dp[i][j] = dp[i][j - arr[i-1]] || dp[i-1][j];
                        else dp[i][j] = dp[i-1][j];
                    }
                }
                if(dp[n][eachSum]) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
        sc.close();
    }
}