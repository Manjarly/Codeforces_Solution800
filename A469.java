
package solution800;

import java.util.Scanner;
public class A469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int p = sc.nextInt();
        int[] x = new int[p];
        for(int i = 0; i<p; i++){
            x[i] = sc.nextInt();
            arr[x[i]-1] = 1;
        }
        int q = sc.nextInt();
        int[] y = new int[q];
        for(int i = 0; i<q; i++){
            y[i] = sc.nextInt();
            arr[y[i]-1] = 1;
        }
        
        String pass = "I become the guy.";
        String fail = "Oh, my keyboard!";
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        if(sum >= arr.length) System.out.println(pass);
        else System.out.println(fail);
    }
}