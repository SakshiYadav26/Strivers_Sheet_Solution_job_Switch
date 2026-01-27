//5)Left Rotate an array by one place
//solution:

public class Main {
    public static void main(String[] args) {
      
      int [] returnedArray=moveArrayToLeftByOnePlace(new int[]{1,2,3,4,5});
      
      System.out.println(Arrays.toString(returnedArray));
      
  }
  
  public static int[] moveArrayToLeftByOnePlace(int[] nums){
    int temp=nums[0];
    
    for(int i=1;i<nums.length;i++){
      nums[i-1]=nums[i];
    }
    
    nums[nums.length-1]=temp;
    
    return nums;
  }
  
