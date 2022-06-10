package Klausuren.Klausur_Programmieren_Braunschweig_WS_12_13;

public class Aufgabe_3 {
    static void wasPassiert(int[] a) {
        int n = a.length - 1;
        int i = 0,
            j = n;
        while (i < j) {
            while (j >= 0 && a[j] <= 0)
                j--;
            while (i <= n && a[i] > 0)
                i++;
            if (i < j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        for (int k : a) {
            System.out.print(k + ";");
            /*
             * Ausgabe: 7;1;6;3;4;-5;-2;0;-8;
             * Die Methode wasPassiert(int[] a)
             * partitioniert das Array in Elemente größer 0 
             * und kleinergleich 0.
             * Sie arbeitet dabei nach dem Hoare-Schema.
             */
        }
    }

    public static void main(String[] args) {
        int[] a = { 0, 1, -2, 3, 4, -5, 6, 7, -8 };
        wasPassiert(a);
    }

}
