
package solution800;

import java.util.Scanner;
public class A734 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long len = sc.nextLong();
        String result = sc.next();
        solve(len, result);
    }
    
    public static void solve(long n, String s){
        int a = 0;
        int d = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == 'A') a++;
            else if(s.charAt(i) == 'D') d++;
        }
        if(a == d) System.out.println("Friendship");
        else if(a > d) System.out.println("Anton");
        else System.out.println("Danik");
    }
}