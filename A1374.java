
package solution800;

import java.util.Scanner;
public class A1374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
        	int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
        	
        	int div = n / x;
        	int result = x * div;
        	int ans = result + y;
        	if(ans > n) {
        		div--;
        		result = x * div;
        		ans = result + y;
        	}
        	
        	System.out.println(ans);
        }
        
    }
}