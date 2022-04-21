
package solution800;

import java.util.Scanner;
public class A467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rooms = new int[n*2];
        int count = 0;
        for(int i = 0; i<rooms.length; i++){
            rooms[i] = sc.nextInt();
        }
        
        for(int i = 0; i<=rooms.length-2; i+=2){
            if(Math.abs(rooms[i] - rooms[i+1]) >= 2) count++;
        }
        System.out.println(count);
    }
}