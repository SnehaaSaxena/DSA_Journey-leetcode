class Solution {
    public boolean canJump(int[] nums) {
        int coverage=0,destination=nums.length-1,lastJumpIdx=0;
        for(int i=0;i<nums.length;i++){
           coverage=Math.max(coverage,nums[i]+i);
           if(i==lastJumpIdx){
             lastJumpIdx=coverage;

             if(coverage>=destination){
                return true;
             }
           }
        }
        return false;
    }
}