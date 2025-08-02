class Solution {
    public int maxSubArray(int[] nums) {
        int curr_Sum=0;
        int max_Sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            curr_Sum+=nums[i];
             max_Sum=Math.max(curr_Sum,max_Sum);
            if(curr_Sum<0){
                curr_Sum=0;
            }
          
        }
        return max_Sum;
    }
}