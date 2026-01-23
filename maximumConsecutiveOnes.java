//11)Maximum Consecutive Ones


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      System.out.println(maximumConsecutiveOnes(new int[]{1,1,2,1,1,1}));
      
     

  }
  
 public static int maximumConsecutiveOnes(int[] nums){
   int count=0;
   
   int max=0;
   
   for(int i=0; i<nums.length;i++){
     if(nums[i]==1){
       count++;
     }else{
       count=0;
     }
      max= Math.max(max,count);
   }
   
  
   
   return max;
 }
 
}
