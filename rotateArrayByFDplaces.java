// 6)Left rotate an array by D places
// Solution:


public class Main {
    public static void main(String[] args) {
      
     rotate(new int[]{1,2,3,4,5}, 2);
      
  }
  
  public static void rotate(int [] nums, int k){
    
    k=k%nums.length;
    
    reverseArray(nums, 0, nums.length-1);
    
    reverseArray(nums,0,k-1);
    
    reverseArray(nums,k,nums.length-1);
    
   System.out.println(Arrays.toString(nums));
    
  }
  
  public static void reverseArray(int[] nums,int start,int end){
     while(start< end){
       int temp= nums[start];
       nums[start]=nums[end];
       nums[end]=temp;
       start++;
       end--;
     }
  }
