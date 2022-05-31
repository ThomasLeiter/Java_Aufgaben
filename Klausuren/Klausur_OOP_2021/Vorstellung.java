package Klausuren.Klausur_OOP_2021;

public class Vorstellung {

    public static int anzVorstellungen = 0;
    private int anzNochVerfügbarenPlaetze;
    public final String titel;
    public final String datum;

    /**
     * Standardkonstruktor
     */
    public Vorstellung(){
        ++anzVorstellungen;
        anzNochVerfügbarenPlaetze = 200;
        titel = "NN";
        datum = "NN";
    }

    /**
     * Überladener Konstruktor mit Parametern
     * @param titel
     * @param datum
     * @param anzNochVerfügbarenPlaetze
     */
    public Vorstellung(String titel, String datum, int anzNochVerfügbarenPlaetze){
        ++anzVorstellungen;
        this.titel = titel;
        this.datum = datum;
    }

    /**
     * Methode zum "Verkauf" von Tickets
     * @param anzahl
     * @return "true" falls genügend zur Verfügung stehen, sonst "false"
     */
    public boolean ticketVerkaufen(int anzahl){
        if (anzahl > anzNochVerfügbarenPlaetze){
            return false;
        }
        anzNochVerfügbarenPlaetze -= anzahl;
        return true;
    }
}
