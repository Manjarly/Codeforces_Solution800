
package solution800;

import java.util.*;
public class A158 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] c = new int[n];
        for(int i = 0; i<n; i++){
            c[i] = sc.nextInt();
        }
        int count = 0;
        int score = c[k-1];
        for(int i=0; i<n; i++){
            if(c[i] >= score && (score!= 0 || c[i]!=0)){
                count++;
            }
        }
        System.out.println(count);
    }
}
