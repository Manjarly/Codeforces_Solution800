
package solution800;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class A472 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int min = Arrays.stream(arr).min().orElse(0);
//        int max = Arrays.stream(arr).max().orElse(Integer.MAX_VALUE);
//        int sum = Arrays.stream(arr).sum();
//        char = 'b';
//        int result = char - 'a'; // this will give result = 2;
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
            int start =1;
            int end = n - 1;
            while(start <= end){
                if(!isPrime(start)){
                    if(!isPrime(end)){
                        if(start + end == n){
                            x = start;
                            y = end;
                            break;
                        }
                        else if(start + end < n) start++;
                        else if(start + end > n) end--;
                    }
                    else end--;
                }
                else start++;
                
            }
        System.out.println(x+" "+y);
        sc.close();
    }
    
    public static boolean isPrime(int a){
        for(int i = 2; i < a; i++){
            if(a % i == 0) return false;
        }
        return true;
    }
}
