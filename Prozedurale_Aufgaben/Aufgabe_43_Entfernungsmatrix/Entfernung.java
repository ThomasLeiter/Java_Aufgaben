package Prozedurale_Aufgaben.Aufgabe_43_Entfernungsmatrix;

import java.util.Random;

public class Entfernung {
    
    static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }

    public static void main(String[] args){
        int N = 10;
        int[] x = new int[N];
        int[] y = new int[N];
        var rand = new Random();
        for (int i = 0; i < N; ++i){
            x[i] = rand.nextInt(50) + 1;
            y[i] = rand.nextInt(50) + 1;
        }

        for (int i = 0; i < N; ++i){
            System.out.printf("Stadt %d (%d|%d)\n",i,x[i],y[i]);
        }
        System.out.println();


        System.out.print("            ");
        for (int i = 0; i < N-1; ++i){
            System.out.printf("Stadt %d  ",i);
        }
        System.out.println();

        for (int i = 1; i < N; ++i){
            System.out.printf("Stadt %d  ",i);
            for (int j = 0; j < i; ++j){
                System.out.printf("%9.3f",distance(x[i], y[i], x[j], y[j]));
            }
            System.out.println();
        }

    }

}
