package Klausuren.Klausur_Konzepte_OOP_FOM_Dusseldorf_2021_06_08.Aufgabe_4;

public class Privatkunde extends Kunde {
    private String vorname;
    private String nachname;
    
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }


}
