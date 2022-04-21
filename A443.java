
package solution800;

import java.util.HashSet;
import java.util.Scanner;
public class A443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' ' || s.charAt(i) == '{' || s.charAt(i) == '}' || s.charAt(i) == ','){
                continue;
            }
            else{
                set.add(s.charAt(i));
            }
        }
        System.out.println(set.size());
    }
}