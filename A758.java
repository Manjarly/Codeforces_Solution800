
package solution800;

import java.util.Scanner;
public class A758 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        int count = 0;
        for(int i : arr) {
        	if(i < max) {
        		count += (max - i);
        	}
        }
        
        System.out.println(count);
    }
}