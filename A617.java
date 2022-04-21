package solution800;


import java.util.*;
public class A617 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int dist = 0;
        int count = 0;
        if(x%5 == 0) count = x/5;
        else count = x/5 +1;
        System.out.println(count);
    }
}