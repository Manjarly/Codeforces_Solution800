package solution800;


import java.util.*;
public class A281 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String sub = s.substring(1,s.length());
        char c = s.charAt(0);
        String f = Character.toString(c);
        f = f.toUpperCase();
        String finalString = f+sub;
        System.out.println(finalString);
    }
}