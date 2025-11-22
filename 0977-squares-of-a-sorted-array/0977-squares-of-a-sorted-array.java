class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        int i=0,j=nums.length-1;
        while(i<=j){
            arr[i]=nums[i]*nums[i];
            arr[j]=nums[j]*nums[j];
            i++; j--;
        }
        Arrays.sort(arr);
        return arr;
    }
}