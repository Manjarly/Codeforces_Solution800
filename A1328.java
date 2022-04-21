
package solution800;

import java.util.Scanner;
public class A1328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = solve(a, b);
            System.out.println(result);
        }
    }
    
    public static int solve(int x, int y){
        if(x%y==0) return 0;
        else return (((x/y)+1)*y) - x;
    }
}