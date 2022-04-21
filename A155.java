
package solution800;

import java.util.Scanner;
public class A155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        int currMax = Integer.MIN_VALUE;
        int currMin = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        currMax = arr[0];
        currMin = arr[0];
        
        for(int i = 1; i<n; i++){
            if(arr[i] > currMax){
                currMax = arr[i];
                count++;
            }
            if(arr[i] < currMin){
                currMin = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}