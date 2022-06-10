package Klausuren.Klausur_Java_Regensburg_WS_15_16.Aufgabe_8;

public class Tetris {
    private int[][] grid = {
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };

    private int removeCompleteLines() {
        int completeLineCount = 0;
        boolean isComplete;
        for (int row = 0; row < grid.length; ++row){
            isComplete = true;
            for (int col = 0 ; col < grid[0].length; ++col){
                if (grid[row][col] == 0){
                    isComplete = false;
                    break;
                }
            }
            if (isComplete){
                ++completeLineCount;
                for (int col = 0 ; col < grid[0].length; ++col){
                    grid[row][col] = 0;
                }
            }
        }
        return completeLineCount;
    }

    private void moveAllPieces(int lineOffset) {
        for (int row = lineOffset; row > 0; --row){
            for (int col = 0; col < grid[0].length; ++col){
                grid[row][col] = grid[row-1][col];
            }
        }
    }
}
