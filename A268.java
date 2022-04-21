
package solution800;

import java.util.Scanner;
public class A268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] HU = new int[n];
        int[] GU = new int[n];
        for(int i=0; i<n; i++){
            HU[i] = sc.nextInt();
            GU[i] = sc.nextInt();
        }
        
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                if(HU[i] == GU[j]) count++;
            }
        }
        System.out.println(count);
    }
}