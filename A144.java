
package solution800;

import java.util.Scanner;
public class A144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i<n; i++){
            arr[i] = sc.nextInt();
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        int minIndex = 0;
        int maxIndex = 0;
        int result = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == max){
                maxIndex = i;
                result += i;
                break;
            }
        }
        for(int i = n-1; i>=0; i--){
            if(arr[i] == min){
                minIndex = i;
                if(minIndex < maxIndex) result += (n-1-i-1);
                else result += (n-1-i);
                break;
            }
        }
        System.out.println(result);
    }
}