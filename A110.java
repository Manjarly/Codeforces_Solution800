
package solution800;

import java.util.Scanner;
public class A110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        solve(number);
    }
    
    public static void solve(long n){
        int count = 0;
        while(n > 0){
            if(n%10 == 4 || n %10 == 7) count++;
            n = n/10;
            
        }
        if(count == 7 || count == 4) System.out.println("YES");
        else System.out.println("NO");
    }
}
