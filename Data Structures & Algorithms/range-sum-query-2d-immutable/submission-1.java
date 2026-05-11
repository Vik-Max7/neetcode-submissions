class NumMatrix {
    int[][] numMatrix;

    public NumMatrix(int[][] matrix) {
        numMatrix = new int[matrix.length][matrix[0].length];

        for (int row = 0; row < numMatrix.length; row++) {
            numMatrix[row][0] = matrix[row][0];
            for (int col = 1; col < numMatrix[0].length; col++) {
                numMatrix[row][col] = numMatrix[row][col - 1] + matrix[row][col];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;

        for(int r=row1; r<=row2; r++){
            if(col1 != 0){
            ans += numMatrix[r][col2] - numMatrix[r][col1-1];
            }
            else{
                ans += numMatrix[r][col2];
            }
        }
        
        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */