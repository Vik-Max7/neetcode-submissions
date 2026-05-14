class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char curr = board[row][col];

                if(curr ==  '.'){
                    continue;
                }

                //check for duplicate digit in rows
                for(int j=0; j < 9; j++){
                    if( j!= col && board[row][j] == curr){
                        return false;
                    }
                }

                //check for duplicat digit in col
                for(int i=0; i < 9; i++){
                    if( i != row && board[i][col] == curr){
                        return false;
                    }
                }

                //check for 3 * 3 grid
                int startRow = row / 3 * 3;
                int startCol = col / 3 * 3;
                
                //this formula gives the start index of every grid then we iterate every index of that box and check the duplicacy

                for(int i = startRow; i < startRow + 3; i++){
                    for(int j = startCol; j < startCol + 3; j++){
                        if((i != row && j != col) && board[i][j] == curr){
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}