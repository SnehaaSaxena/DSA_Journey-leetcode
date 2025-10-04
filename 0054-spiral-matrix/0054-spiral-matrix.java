class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int startRow=0,endRow=matrix.length-1,startCol=0,endCol=matrix[0].length-1;
        // top Row
        while(startRow<=endRow && startCol<=endCol){
        for(int i=startCol;i<=endCol;i++){
           list.add(matrix[startRow][i]);
        }
        // right corner
        for(int i=startRow+1;i<=endRow;i++){
            list.add(matrix[i][endCol]);
        }
        // bottom row
        for(int i=endCol-1;i>=startCol;i--){
            if(startRow==endRow) break;
            list.add(matrix[endRow][i]);
        }
        // left corner
        for(int i=endRow-1;i>startRow;i--){
            if(startCol==endCol) break;
            list.add(matrix[i][startCol]);
        }
        startRow++;
        endRow--;
        startCol++;
        endCol--;
        }
        return list;
    }
}