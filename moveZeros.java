
//7)Move Zeros to end
Solution:

public class Main {
    public static void main(String[] args) {
      moveZerosToEnd(new int[]{1,0,2,0,3,0,4});
      
     

  }
  
  public static void moveZerosToEnd(int[] nums){
    int j=-1;
    
    for(int i=0;i<nums.length;i++){
      if(nums[i]==0){
        j=i;
        break;
      }
    }
    
    if(j== -1) return;
    
    for(int i=j+1;i<nums.length;i++){
      if(nums[i]!=0){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        j++;
      }
    }
    
    System.out.println(Arrays.toString(nums));
  }
