class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        HashSet<Character> set = new HashSet<>(); 
         for(int i = 0 ; i< 9; i++)
         {
             set.clear();
             for(int j = 0; j<9 ; j++)
             {
                 if(set.contains(board[i][j]) && board[i][j]!= '.')
                     return false;
                 else
                     set.add(board[i][j]);
             }
         }

         for(int i = 0 ; i< 9; i++)
         {
             set.clear();
             for(int j = 0; j<9 ; j++)
             {
                 if(set.contains(board[j][i]) && board[j][i]!= '.')
                     return false;
                 else
                     set.add(board[j][i]);
             }
         }


         for(int x = 0 ; x< 7; x++)
         {
            for(int y = 0 ; y< 7; y++)
         {
            set.clear();
             for(int i = x; i<x+3 ; i++)
             {
                for(int j = y; j<y+3 ; j++)
                {
                    if(set.contains(board[i][j]) && board[i][j]!= '.')
                     return false;
                    else
                        set.add(board[i][j]);

                }
             }
             
             y = y+2;
         }
         x = x+2;
         }
        return true;
    }
}