package solution800;


import java.util.*;
public class A339 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] nums = new int[(s.length())/2+1];
        int n = 0;
        for(char ch : s.toCharArray()){
            if(ch == '+') continue;
            else{
                nums[n] = ch - '0';
                n++;
            }
        }
        Arrays.sort(nums);
        
        String newString = Integer.toString(nums[0]);
        for(int i=1; i<nums.length; i++){
            newString += "+" + Integer.toString(nums[i]);
        }
    System.out.println(newString);
    }
}