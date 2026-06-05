class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        System.out.println(matrix[0].length);
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][matrix[i].length-1] == target)return true;
           else if(matrix[i][matrix[i].length-1] > target){
                int l = 0;
                int r = matrix[i].length-1;
                while(l <= r){
                    int mid = l + (r-l)/2;
                    if(matrix[i][mid] > target){
                        r = mid - 1 ;
                    }
                    else if(matrix[i][mid] < target){
                        l = mid + 1;
                    }
                    else{
                        return true;
                    }
                }
            }
            
        }
        return false;   
    }
}

