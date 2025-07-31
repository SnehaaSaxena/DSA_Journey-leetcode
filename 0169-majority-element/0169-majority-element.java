class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i])
                 count++;
            }
            if(count>nums.length/2)
             return nums[i];
             count=0;
        }
        return -1;
    }
}