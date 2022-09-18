
package solution800;

import java.util.Scanner;
public class A490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
        	arr[i] = sc.nextInt();
        }
        
        int countOne = 0, countTwo = 0, countThree = 0;
        
        for(int i : arr) {
        	if(i == 1) countOne++;
        	else if(i == 2) countTwo++;
        	else if(i == 3) countThree++;
        }
        
        if(countOne == 0 || countTwo == 0 || countThree == 0) {
        	System.out.println(0);
        	return;
        }
        
        int teams = Math.min(Math.min(countTwo, countOne), countThree);
        System.out.println(teams);
        
        while(teams-- > 0) {
        	for(int i = 0; i < n; i++) {
        		if(arr[i] == 1) {
        			arr[i] = -1;
        			System.out.print(i + 1 +" ");
        			break;
        		}
        	}
        	for(int i = 0; i < n; i++) {
        		if(arr[i] == 2) {
        			arr[i] = -1;
        			System.out.print(i + 1 +" ");
        			break;
        		}
        	}
        	for(int i = 0; i < n; i++) {
        		if(arr[i] == 3) {
        			arr[i] = -1;
        			System.out.print(i + 1 +" ");
        			break;
        		}
        	}
        	System.out.println();
        }
    }
}