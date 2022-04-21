package solution800;


import java.util.*;
public class B266 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        solve(n, t, s);
    }
    
    public static void solve(int line, int time, String newS){
        char[] q = newS.toCharArray();
        while(time > 0){
            for(int i = 0; i<q.length-1; i++){
                if(q[i] == 'B' && q[i+1] == 'G'){
                    char temp = q[i];
                    q[i] = q[i+1];
                    q[i+1] = temp;
                    i++;
                }
            }
            time--;
        }
        String result = new String(q);
        System.out.println(result);
    }
}