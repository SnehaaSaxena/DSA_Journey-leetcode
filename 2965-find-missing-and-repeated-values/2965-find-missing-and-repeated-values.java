class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int repeated=-1;
        int missing=-1;
        for(int i=1;i<=grid.length*grid[0].length;i++){
            if(map.containsKey(i) && map.get(i)>1){
                repeated=i;
            }
            if(!map.containsKey(i)){
               missing=i;
            }
        }
       return new int[]{repeated,missing};
    }
}