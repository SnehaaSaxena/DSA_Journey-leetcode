class Solution {
    public int jump(int[] arr) {
        int destination=arr.length-1,nextJumpIdx=0,totalJumps=0,coverage=0;
        if(arr.length==1)
          return 0;
        for(int i=0;i<arr.length;i++){
            coverage=Math.max(coverage,arr[i]+i);
            if(nextJumpIdx==i){
                nextJumpIdx=coverage;
                totalJumps++;

                if(coverage>=destination){
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }
}