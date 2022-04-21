
package solution800;


import java.util.Arrays;
import java.util.Scanner;
public class A1399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j<n; j++){
                arr[j]=sc.nextInt();
            }
            String result = solve(n, arr);
            System.out.println(result);
        }
    }
    
    public static String solve(int a, int[] b){
        Arrays.sort(b);
        
        for(int i = 0; i<a-1; i++){
            if(Math.abs(b[i] - b[i+1]) >1){
                return "NO";
            }
        }
        return "YES";
    }
}