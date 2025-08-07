class Solution {
    public int[][] merge(int[][] arr) {
       // APPROACH 1

        //Arrays.sort(arr,Comparator.comparingDouble( o-> o[0]));
        //ArrayList<int  [] > list=new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     int start=arr[i][0],end=arr[i][1];
            
        //     if(!list.isEmpty() && end<=list.get(list.size()-1)[1])
        //       continue;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(end>=arr[j][0])
        //           end=Math.max(end,arr[j][1]);
        //         else
        //           break;
        //     }
        //     int li[]=new int[]{start,end};
        //     list.add(li);
        // }
        // int intervals[][]=new int[list.size()][2];
        // for(int i=0;i<list.size();i++){
        //     for(int j=0;j<2;j++){
        //         intervals[i][j]=list.get(i)[j];
        //     }
        // }
        //return list.toArray(new int[list.size()][]);

        // APPROACH 2

        // ArrayList<int [] > list=new ArrayList<>();
        // Arrays.sort(arr,Comparator.comparingDouble(o->o[0]));

        // for(int i=0;i<arr.length;i++){
        //     if(!list.isEmpty() && list.get(list.size()-1)[1]>=arr[i][0])
        //      list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1],arr[i][1]);
        //     else
        //     list.add( new int[]{arr[i][0],arr[i][1]});
        // }
        // return list.toArray(new int[list.size()][]);

        //APPROACH 3
        Arrays.sort(arr,Comparator.comparingDouble(o->o[0]));
        ArrayList<int [] > list=new ArrayList<>();
        int[] prev=arr[0];
        for(int i=1;i<arr.length;i++){
            int [] interval=arr[i];
            if(prev[1]>=interval[0])
              prev[1]=Math.max(prev[1],interval[1]);
            else{
                list.add(prev);
                prev=interval;
            }
         }
         list.add(prev);
         return list.toArray(new int[list.size()][]);
    }
}
