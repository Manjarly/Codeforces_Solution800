
package solution800;

import java.util.Scanner;
public class A996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = 0;
        while(n>0){
            if(n>=1){
                if(n>=5){
                    if(n>=10){
                        if(n>=20){
                            if(n>=100){
                                result += n/100;
                                n = n%100;
                            }
                            else{
                                result += n/20;
                                n = n%20;
                            }
                        }
                        else{
                            result += n/10;
                            n = n %10;
                        }
                    }
                    else{
                        result += n/5;
                        n = n%5;
                    }
                }
                else{
                    result += n / 1;
                    n = n%1;
                }
            }
        }
        System.out.println(result);
    }
}