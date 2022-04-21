
package solution800;

import java.util.Scanner;
public class A677 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] kids = new int[n];
        int count = 0;
        for(int i=0; i<n; i++){
            kids[i] = sc.nextInt();
            if(kids[i] > h) count += 2;
            else count += 1;
        }
        System.out.println(count);
    }
}