
package solution800;

import java.util.*;
public class A71 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(n >= 0){
            String s = sc.nextLine();
            if(s.length() <=10) System.out.println(s);
            else{
                int count = 0;
                char f = s.charAt(0);
                char l = s.charAt(s.length()-1);
                for(int i =1; i<s.length()-1; i++){
                    count++;
                }
                System.out.println(f+""+count+""+l);
            }
            n--;
        }
    }
}
