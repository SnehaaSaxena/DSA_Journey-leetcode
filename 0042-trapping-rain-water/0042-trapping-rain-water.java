class Solution {
    public int trap(int[] height) {
        int leftMax[]=new int[height.length];
        int rightMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
           leftMax[i]=leftMax[i-1]>height[i] ? leftMax[i-1] : height[i];
        }
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
           rightMax[i]=rightMax[i+1]>height[i] ? rightMax[i+1] : height[i];
        }
        int totalArea=0;
        for(int i=0;i<height.length;i++){
            int trapWater=Math.min(leftMax[i],rightMax[i])-height[i];
            totalArea+=trapWater*1;
        }
        return totalArea;
    }
}