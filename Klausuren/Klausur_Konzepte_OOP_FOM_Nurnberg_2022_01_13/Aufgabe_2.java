package Klausuren.Klausur_Konzepte_OOP_FOM_Nurnberg_2022_01_13;

public class Aufgabe_2 {
    
    public static int ackermann(int m, int n){
        if (m == 0 && n >= 0){
            return n+1;
        }
        if (m > 0 && n == 0){
            return ackermann(m-1, 1);
        }
        if (m > 0 && n > 0){
            return ackermann(m-1, ackermann(m, n-1));
        }
        // Ignoriere negative Eingaben.
        return 0;
    }
   
}
