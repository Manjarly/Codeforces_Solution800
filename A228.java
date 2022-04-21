
package solution800;

import java.util.Scanner;
public class A228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i<4; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i<3; i++){
            for(int j = i+1; j<4; j++){
                if(arr[j] == arr[i]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}