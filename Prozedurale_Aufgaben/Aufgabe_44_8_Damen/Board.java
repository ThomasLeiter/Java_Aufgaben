package Prozedurale_Aufgaben.Aufgabe_44_8_Damen;

public class Board {
    
    private boolean[] squares = new boolean[64];

    public void change(int row, int col){
        squares[(row-1)*8+col-1] ^= true;
    }

    public boolean isset(int row, int col){
        return squares[(row-1)*8+col-1];
    }

    public boolean isStillFree(int row, int col){
        for (int y = row-1; y >= 1; --y){
            if (isset(y, col)){
                return false;
            }
        }
        for (int x = col-1; x >= 1; --x){
            if (isset(row, x)){
                return false;
            }
        }
        for (int i = 1; row-i >= 1 && col-i >= 1; ++i){
            if (isset(row-i, col-i)){
                return false;
            }
        }
        for (int i = 1; row-i >= 1 && col+i <= 8; ++i){
            if (isset(row-i, col+i)){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString(){
        var str = new StringBuilder();
        String emptyRow = "------------------\n";
        str.append(emptyRow);
        for (int row = 8; row >= 1; --row){
            str.append(row).append("|");
            for (int col = 1; col <= 8; ++col){
                str.append(isset(row, col)? 'Q' : ' ').append('|');
            }
            str.append('\n').append(emptyRow);
        }
        return str.append("  a b c d e f g h \n").toString();
    }

}
