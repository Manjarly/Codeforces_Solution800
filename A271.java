
package solution800;

import java.util.Scanner;
public class A271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        solve(year);
        
    }
    
    public static void solve(int y){
        int ans = 0;
        while(true){
            y++;
            ans = y;
            int a = y%10;
            y /= 10;
            int b = y%10;
            y /= 10;
            int c = y%10;
            y/=10;
            int d = y%10;
            if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
                System.out.println(ans);
                break;
            }
            y=ans;
        }
        
    }
}