// 53. Maximum Subarray


class Solution {
    public int maxSubArray(int[] nums) {

        long max=Long.MIN_VALUE;

        int sum=0;

        for(int i=0 ;i <nums.length;i++){
            sum+=nums[i];

            if(max<sum){
                max=sum;
            }

            if(sum<0){
                sum=0;
            }

        }
        return (int)max;
        
    }
}
