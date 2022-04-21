
package solution800;

import java.util.Scanner;
public class A41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String encode = sc.next();
        String decode = sc.next();
        solve(encode, decode);
    }
    
    public static void solve(String s, String t){
        int start = 0;
        int end = s.length()-1;
        int count = 0;
        if(s.length() != t.length()){
            System.out.println("NO");
        }
        else{
            while(end >= 0){
                if(s.charAt(start) != t.charAt(end)){
                    count++;
                }
                end--;
                start++;
            }
            if(count == 0) System.out.println("YES");
            else System.out.println("NO");
        }  
    }
}