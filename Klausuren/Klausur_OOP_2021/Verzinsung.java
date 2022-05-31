package Klausuren.Klausur_OOP_2021;

public class Verzinsung {
    
    private static void printRow(int cellWidth, Object... args){
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < args.length; ++i){
            row.append("%-").append(cellWidth).append("s");
        }
        row.append("\n");
        System.out.printf(row.toString(),args);
    }

    public static void main(String[] args){
        int n = 30;
        double K0 = 100000;
        double p = 1.75;
        double K=K0,Z;
        printRow(20, "Jahr", "Start", "Zinsen", "End");
        for (int j = 1; j <= n; ++j){
            Z = K * p / 100.;
            printRow(20, j, K, Z, K+Z);
            K += Z;
        }
    }

}
