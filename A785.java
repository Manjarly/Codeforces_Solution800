
package solution800;

import java.util.Scanner;
public class A785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0; i<n; i++){
            s[i] = sc.next();
        }
        int result = 0;
        for(int i = 0; i<n; i++){
            if(s[i].equals("Tetrahedron")){
                result += 4;
            }
            else if(s[i].equals("Cube")){
                result += 6;
            }
            else if(s[i].equals("Octahedron")){
                result += 8;
            }
            else if(s[i].equals("Dodecahedron")){
                result += 12;
            }
            else if(s[i].equals("Icosahedron")){
                result += 20;
            }
        }
        System.out.println(result);
    }
}