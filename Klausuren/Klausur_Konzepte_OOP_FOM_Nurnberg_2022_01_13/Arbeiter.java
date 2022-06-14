package Klausuren.Klausur_Konzepte_OOP_FOM_Nurnberg_2022_01_13;

class Arbeiter extends Mitarbeiter {

    double stundenlohn, anzahlstunden, ueberstundenzuschlag, anzahlueberstunden,
            schichtzulage;

    @Override
    double monatsBrutto() {
        return stundenlohn * anzahlstunden
                + ueberstundenzuschlag * anzahlueberstunden
                + schichtzulage;
    }

}