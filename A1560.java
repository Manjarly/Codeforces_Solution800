
package solution800;

import java.util.Scanner;
public class A1560 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
        	int k = sc.nextInt();
        	int count = 0;
        	for(int i = 1; i < 100000; i++) {
        		if(i % 3 == 0 || i % 10 == 3) continue;
        		else count++;
        		if(count == k) {
        			System.out.println(i);
        		}
        	}
        }
    }
}