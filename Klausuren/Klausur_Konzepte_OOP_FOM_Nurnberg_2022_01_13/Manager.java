package Klausuren.Klausur_Konzepte_OOP_FOM_Nurnberg_2022_01_13;

class Manager extends Mitarbeiter {
    double fixgehalt, provision1, provision2, umsatz1,
            umsatz2;

    @Override
    double monatsBrutto() {
        return fixgehalt
                + provision1 / 100. * umsatz1
                + provision2 / 100. * umsatz2;
    }
}