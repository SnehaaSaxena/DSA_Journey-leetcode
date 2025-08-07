class Solution {
    public int[][] merge(int[][] arr) {
        ArrayList<int  [] > list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int start=arr[i][0],end=arr[i][1];
            
            if(!list.isEmpty() && end<=list.get(list.size()-1)[1])
              continue;
            for(int j=i+1;j<arr.length;j++){
                if(end>=arr[j][0])
                  end=Math.max(end,arr[j][1]);
                else
                  break;
            }
            int li[]=new int[]{start,end};
            list.add(li);
        }
        int intervals[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            for(int j=0;j<2;j++){
                intervals[i][j]=list.get(i)[j];
            }
        }
        return intervals;
    }
}