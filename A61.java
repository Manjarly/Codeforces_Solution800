
package solution800;

import java.util.Scanner;
public class A61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.nextLine();
        String b = sc.next();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<a.length(); i++){
            sb.append(a.charAt(i) ^ b.charAt(i));
        }
        
        String result = sb.toString();
        System.out.println(result);
    }
}