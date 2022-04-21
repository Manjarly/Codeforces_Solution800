
package solution800;

import java.util.Scanner;
public class A1335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            long result = 0;
            long n = sc.nextLong();
            if(n%2 == 0){
                result = n/2 - 1;
            }
            else{
                result = n/2;
            }
            System.out.println(result);
        }
    }
}