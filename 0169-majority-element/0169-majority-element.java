class Solution {
    public int majorityElement(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int num=nums[i];
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j]==nums[i])
        //          count++;
        //     }
        //     if(count>nums.length/2)
        //      return nums[i];
        //      count=0;
        // }
        // return -1;

        //OPTIMIZED
        // Arrays.sort(nums);
        // return nums[nums.length/2];

        //MORE OPTIMIZED
        Arrays.sort(nums);
        int majority=nums[0],votes=1;
        for(int i=1;i<nums.length;i++){
            if(votes==0){
               majority=nums[i];
               votes=1;
            }
            else if(nums[i]==majority){
              votes++;
            }
            else{
                votes--;
            }
        }
        return majority;
    }
}