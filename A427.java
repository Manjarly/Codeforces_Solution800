
package solution800;

import java.util.Scanner;
public class A427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int unnoticed = 0;
        int officers = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i : arr){
            if(officers == 0 && i == -1){
                unnoticed++;
            }
            else if(i>0){
                officers+=i;
            }
            else if(officers > 0 && i==-1){
                officers -= 1;
            }
            else continue;
        }
        System.out.println(unnoticed);
    }
}