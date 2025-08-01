class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      int size=grid.length*grid.length,repeated=-1,missing=-1;
      Set<Integer> set=new HashSet<>();
        for(int row[]:grid){
            for(int num:row){
                if(!set.add(num)){
                     repeated=num;
                }
            }
        }
        for(int i=1;i<=size;i++){
            if(!set.contains(i)){
               missing=i;
                break;
            }
        }
         return new int[]{repeated,missing};
    }
}