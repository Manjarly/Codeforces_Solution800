
package solution800;


import java.util.Scanner;
public class A1409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long result = solve(a, b);
            System.out.println(result);
        }
    }
    
    public static long solve(long a, long b){
        long count = 0;
        long diff = Math.abs(a-b);
        if(diff == 0) return 0;
        else{
            count += diff / 10;
        }
        if(diff%10 == 0) return count;
        else return count+1;
    }
}