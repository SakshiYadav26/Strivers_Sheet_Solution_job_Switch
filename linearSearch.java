//8)Linear Search
Solution:

public class Main {
    public static void main(String[] args) {
      System.out.println(linearSearch(new int[]{1,0,2,0,3,0,4}, 5));
      
     

  }
  
  public static int linearSearch(int [] nums, int m){
    int n=0;
    for(int i=0;i< nums.length;i++){
      if(nums[i]== m){
        n=i;
      }
      else{
        n=-1;
      }
    }
    return n;
  }
  
 
}
