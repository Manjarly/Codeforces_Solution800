
package solution800;

import java.util.Scanner;
public class A151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), l = sc.nextInt(), c = sc.nextInt();
        int d = sc.nextInt(), p = sc.nextInt(), nl = sc.nextInt(), np = sc.nextInt();
        
        int totalml = (k*l) / (nl);
        int totalLime = c * d;
        int salt = p / np;
        
        int result = Math.min(Math.min(totalLime, salt), totalml) / n;
        
        System.out.println(result);
        
        sc.close();
    }
}