
package solution800;

import java.util.Scanner;
public class A381 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int start = 0, end = n - 1;
        
        int sereja = 0, dima = 0;
        
        while(start <= end) {
        	if(arr[start] < arr[end]) {
        		sereja += arr[end];
        		end--;
        	}
        	else {
        		sereja += arr[start];
        		start++;
        	}
        	if(start > end) break;
        	if(arr[start] < arr[end]) {
        		dima += arr[end];
        		end--;
        	}
        	else {
        		dima += arr[start];
        		start++;
        	}
        }
        System.out.println(sereja + " " + dima);
    }
}