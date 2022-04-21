package solution800;

import java.util.*;
import java.math.*;
public class A263 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                m[i][j] = sc.nextInt();
            }
        }
        int a=0, b=0;
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(m[i][j]==1){
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println(Math.abs(a-2)+Math.abs(b-2));
    }
}
