
package solution800;

import java.util.Scanner;
public class A520 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next().toLowerCase();
        int[] arr = new int[26];
        for(int i = 0; i<s.length(); i++){
            arr[s.charAt(i)-97]++;
        }
        
        for(int i : arr){
            if(i == 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}