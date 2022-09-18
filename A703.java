
package solution800;

import java.util.Scanner;
public class A703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mishika = 0, chris = 0;
        while(n-- > 0) {
        	int m = sc.nextInt(), c = sc.nextInt();
        	if(m > c) mishika++;
        	else if(c > m) chris++;
        }
        
        if(mishika > chris) System.out.println("Mishka");
        else if(chris > mishika) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}