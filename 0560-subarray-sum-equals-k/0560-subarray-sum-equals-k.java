class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix[]=new int[nums.length];int currSum=0,count=0;
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                currSum=(start==0)? prefix[end] : prefix[end]-prefix[start-1];
                if(currSum==k){
                    count++;
                }
            }
        }
        return count;
    }
}