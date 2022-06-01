package Objektorientierte_Aufgaben.Aufgabe_Exceptions;

public class Bankkonto {
    
    private double kontostand = 0.0;

    public double getKontostand(){
        return kontostand;
    }

    public void einzahlen(double betrag) throws Transaktionsfehler{
        if (betrag < 0.0){
            throw new Transaktionsfehler(
                String.format("Einzahlungsbetrag %.2f ist negativ.", betrag));
        }
        kontostand += betrag;
    }

    public void auszahlen(double betrag) throws Transaktionsfehler{
        if (betrag < 0.0){
            throw new Transaktionsfehler(
                String.format("Auszahlungsbetrag %.2f ist negativ.", betrag));
        }
        if (betrag > kontostand){
            throw new Transaktionsfehler(
                String.format("Auszahlungsbetrag %.2f übersteigt Kontostand.", betrag));
        }
        kontostand -= betrag;
    }

}
