
package solution800;

import java.util.Scanner;
public class A141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toLowerCase();
        sc.nextLine();
        String s2 = sc.next().toLowerCase();
        sc.nextLine();
        String str = sc.next().toLowerCase();
        
        int[] arr = new int[26];
        
        for(int i =0; i<s1.length(); i++){
            arr[s1.charAt(i)-97]++;
        }
        for(int i =0; i<s2.length(); i++){
            arr[s2.charAt(i)-97]++;
        }
        for(int i =0; i<str.length(); i++){
            arr[str.charAt(i)-97]--;
        }
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}