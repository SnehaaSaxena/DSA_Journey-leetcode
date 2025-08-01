class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
          for(int j=0;j<grid[0].length;j++){
            map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
          }
        }
        
        int missing=-1,repeated=-1;
        for(int i=1;i<=grid.length*grid[0].length;i++){
            if(map.containsKey(i) && map.get(i)==2)
               repeated=i;
            if(!map.containsKey(i))
                missing=i;
        }
        return new int[]{repeated,missing};
    }

    // Second Appraoch
    // public int[] findMissingAndRepeatedValues(int[][] grid) {
    //   int size=grid.length*grid.length,repeated=-1,missing=-1;
    //   Set<Integer> set=new HashSet<>();
    //     for(int row[]:grid){
    //         for(int num:row){
    //             if(!set.add(num)){
    //                  repeated=num;
    //             }
    //         }
    //     }
    //     for(int i=1;i<=size;i++){
    //         if(!set.contains(i)){
    //            missing=i;
    //             break;
    //         }
    //     }
    //      return new int[]{repeated,missing};
    // }

}