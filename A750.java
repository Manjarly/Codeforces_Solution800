
package solution800;

import java.util.Scanner;
public class A750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = 240 - k;
        
        int count = 0;
        for(int i = 1; i<=n; i++){
            r -= 5*i;
            if(r>=0){
                count++;
            }
            else break;
        }
        System.out.println(count);
    }
}