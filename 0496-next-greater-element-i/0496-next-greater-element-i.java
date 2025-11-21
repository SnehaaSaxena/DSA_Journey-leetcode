class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int arr[]=new int[nums2.length];
        int res[]=new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>=nums2[st.peek()]){
               st.pop();
            }
            if(st.isEmpty()) arr[i]=-1;
            else arr[i]=nums2[st.peek()];
            st.push(i);
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
           map.put(nums2[i],i);
        }
        int j=0;
        for(int i=0;i<nums1.length;i++){
           int a=map.get(nums1[i]);
           res[j++]=arr[a];
        }
      return res;
    }
}