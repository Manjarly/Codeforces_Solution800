
package solution800;

import java.util.HashSet;
import java.util.Scanner;
public class A1512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
        	int n = sc.nextInt();
        	int[] arr = new int[n];
        	for(int i = 0; i < n; i++) {
        		arr[i] = sc.nextInt();
        	}
        	if(arr[0] != arr[1] && arr[0] != arr[2]) System.out.println(1);
        	if(arr[n-1] != arr[n-2] && arr[n-1] != arr[n-3]) System.out.println(n);
        	for(int i = 1; i < n - 1; i++) {
        		if(arr[i] != arr[i-1] && arr[i] != arr[i+1]) System.out.println(i+1);
        	}
        }
    }
}