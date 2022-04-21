
package solution800;

import java.util.Scanner;
public class A136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            p[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            result[p[i]-1] = i+1; 
        }
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}