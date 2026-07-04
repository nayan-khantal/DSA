import java.util.*;

public class nQueens {
    public static boolean isSafe(int row,int col,char[][]board){
        //horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q') return false;
        }
        //vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q') return false;
        }
        //upper left
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        //upper right
        for(int i=row,j=col;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        //lower left
        for(int i=row,j=col;i<board.length && j>=0;i++,j--){
            if(board[i][j]=='Q') return false;
        }
        //lower right
        for(int i=row,j=col;i<board.length && j<board.length;i++,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }

    public static void saveBoard(char[][]board,List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            row = "";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
            }
                newBoard.add(row);
        }
            allBoards.add(newBoard);
    }

    public static void helper(char[][]board,List<List<String>>allBoards,int col){
        if(col==board.length){
            saveBoard(board, allBoards);
            return;
        }

        for(int row=0;row<board.length;row++){
            if(isSafe(row, col, board)){
                board[row][col]='Q';
                helper(board, allBoards, col+1);
                board[row][col]='.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        helper(board, allBoards, 0);
        return allBoards;
    }
     public static void main(String[] args) {
        nQueens solver = new nQueens();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();

        List<List<String>> solutions = solver.solveNQueens(n);

        System.out.println("Total Solutions: " + solutions.size());
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
