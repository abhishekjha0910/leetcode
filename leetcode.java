import java.util.*;
public class leetcode {
    public static void max_subarray(int number[]){
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for(int i  = 0 ; i<number.length ; i++){
            curr += number[i];
            max = Math.max(max,curr);
            if(curr < 0){
                curr = 0;
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        int number[] = {-2,0,-1};
        max_subarray(number);
    } 
}
