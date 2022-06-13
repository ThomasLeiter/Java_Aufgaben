package Klausuren.Klausur_Konzepte_OOP_FOM_Nurnberg_2022_01_13;

import Klausuren.Klausur_Konzepte_OOP_FOM_Nurnberg_2022_01_13.Aufgabe_5.Angestellter;
import Klausuren.Klausur_Konzepte_OOP_FOM_Nurnberg_2022_01_13.Aufgabe_5.Arbeiter;
import Klausuren.Klausur_Konzepte_OOP_FOM_Nurnberg_2022_01_13.Aufgabe_5.Manager;
import Klausuren.Klausur_Konzepte_OOP_FOM_Nurnberg_2022_01_13.Aufgabe_5.Mitarbeiter;

public class Gehaltsberechnung {
    private static final int ANZ_MA = 100;
    private static Mitarbeiter[] ma;
    private static double bruttosumme;

    public static void main(String[] args) {
        ma = new Mitarbeiter[ANZ_MA];

        // M i t a r b e i t e r −Array f u e l l e n :
        ma[0] = new Manager();
        ma[1] = new Arbeiter();
        ma[2] = new Angestellter();
        // ma [ . . .

        bruttosumme = 0.;
        for (int i = 0; i < ANZ_MA; ++i){
            bruttosumme += ma[i].monatsBrutto();
        }

        System.out.println("Bruttosumme = "
                + bruttosumme);
    }

}