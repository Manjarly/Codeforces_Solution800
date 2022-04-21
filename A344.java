
package solution800;

import java.util.Scanner;
public class A344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] magnet = new String[n];
        int count = 1;
        for(int i = 0; i<n; i++){
            magnet[i] = sc.next();
        }
        
        for(int i = 0; i<n-1; i++){
            if(!magnet[i].equals(magnet[i+1])) count++;
        }
        System.out.println(count);
    }
}