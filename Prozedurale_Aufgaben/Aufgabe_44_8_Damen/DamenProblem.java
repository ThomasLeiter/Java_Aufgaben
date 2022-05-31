package Prozedurale_Aufgaben.Aufgabe_44_8_Damen;

public class DamenProblem {

    Board board = new Board();

    public int solve(){
        return solve(1,1,8);
    }

    private int solve(int row, int col, int queens){
        if (queens == 0){
            System.out.println(board);
            return 1;
        }
        if (col > 8){
            return solve(row+1,1,queens);
        }
        if (row > 8){
            return 0;
        }
        int solutions = 0;
        if (board.isStillFree(row, col)){
            board.change(row, col);
            solutions += solve(row,col+1,queens-1);
            board.change(row, col);
        }
        return solutions + solve(row,col+1,queens);
    }

    public static void main(String ... args){
        System.out.printf("%d Solutions have been found!\n",new DamenProblem().solve());
    }

}
