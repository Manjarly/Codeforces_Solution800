
package solution800;

import java.util.Scanner;
public class B200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += ((double) arr[i]) / 100;
        }
        
        double result = (sum/(double)n)*100;
        System.out.println(result);        
    }
}