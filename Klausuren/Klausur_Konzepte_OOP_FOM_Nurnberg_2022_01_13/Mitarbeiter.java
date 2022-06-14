package Klausuren.Klausur_Konzepte_OOP_FOM_Nurnberg_2022_01_13;

import java.util.Date;

abstract class Mitarbeiter {
    int personalnr;
    String name;
    Date eintrittsdatum;

    // Leerer Standardkonstruktor
    Mitarbeiter() {
    }

    abstract double monatsBrutto();
}