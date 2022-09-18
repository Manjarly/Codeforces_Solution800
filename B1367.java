
package solution800;

import java.util.Scanner;
public class B1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
        	int n = sc.nextInt();
        	int[] arr = new int[n];
        	int oddCount = 0, evenCount = 0;
        	for(int i = 0; i < n; i++) {
        		arr[i] = sc.nextInt();
        		if(arr[i] % 2 == 0) evenCount++;
        		else oddCount++;
        	}
        	if(arr.length == 1 && arr[0] % 2 != 0) {
        		System.out.println(-1);
        	}
        	else if(arr.length == 1 && arr[0] % 2 == 0) {
        		System.out.println(0);
        	}
        	else {
        		int oddWrong = 0;
            	for(int i = 0; i < n; i+= 2) {
            		if(arr[i] % 2 != 0) oddWrong++; 
            	}
            	int evenWrong = 0;
            	for(int i = 1; i < n; i+= 2) {
            		if(arr[i] % 2 == 0) evenWrong++;
            	}
            	
            	if(evenWrong == oddWrong) System.out.println(evenWrong);
            	else System.out.println(-1);
        	}
        	
        }
    }
}