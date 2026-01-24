10)Find missing number in an array
solution:

public class Main {
    public static void main(String[] args) {
      System.out.println(findMissingNumber(new int[]{1,2,3,4}, 5));
      
     

  }
  
  public static int findMissingNumber(int [] nums, int n){
    int sum=(n*(n+1))/2;
    
    int tempSum=0;
    
    for(int i=0; i<nums.length;i++){
      tempSum+=nums[i];
      
    }
    
    int m=sum-tempSum;
    
    return m;
  }
 
}
