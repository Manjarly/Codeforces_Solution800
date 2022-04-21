package solution800;


import java.util.*;
public class A236 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] ch = new int[26];
        
        for(int i=0; i<s.length(); i++){
            int temp = s.charAt(i)-'a';
            if(ch[temp] == 0) ch[temp]++;
        }
        int count =0;
        for(int i : ch){
            if(i==1) count++;
        }
        
        if(count %2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}