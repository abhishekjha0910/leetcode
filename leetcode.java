import java.util.*;
public class leetcode {
    public static void max_product_subarray(int number[]){
        int max = number[0] ;
        int min = number[0];
        int ans = number[0];
        for(int i = 1 ; i<number.length ; i++){
            int temp = max;
            max = Math.max(Math.max(max*number[i],min*number[i]) ,number[i]);
            min = Math.min(Math.min(temp*number[i] ,min*number[i]), number[i]);
            if(max > ans){
                ans = max;
            }
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        int number[] = {-2,0,-1};
        max_product_subarray(number);
    }
}
