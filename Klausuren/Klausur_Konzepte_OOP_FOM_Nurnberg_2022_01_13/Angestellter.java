package Klausuren.Klausur_Konzepte_OOP_FOM_Nurnberg_2022_01_13;

// Beispielimplementierung; In Aufgabenstellung nicht gefragt
class Angestellter extends Mitarbeiter {
    double fixgehalt;

    @Override
    double monatsBrutto() {
        return fixgehalt;
    }

}