class Solution {
    public int largestRectangleArea(int[] heights) {
      int lsr[]=new int[heights.length];
      int rsr[]=new int[heights.length];
      Stack<Integer> st=new Stack<>();
      for(int i=0;i<heights.length;i++){
        while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
            st.pop();
        }
        if(st.isEmpty()) lsr[i]=-1;
        else lsr[i]=st.peek();
        st.push(i);
      }  
      st=new Stack<>();
      for(int i=heights.length-1;i>=0;i--){
        while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
            st.pop();
        }
        if(st.isEmpty()) rsr[i]=heights.length;
        else rsr[i]=st.peek();
        st.push(i);
      }
      int maxArea=0;
      for(int i=0;i<heights.length;i++){
        int width=rsr[i]-lsr[i]-1;
        int height=heights[i];
        int area=height*width;
        maxArea=area>maxArea ? area:maxArea;
       }
       return maxArea;
    }
}