package Objektorientierte_Aufgaben.Aufgabe_08_06;

public class Loewe extends Tier {

    private final String titel;
    private final String lieblingsspeise;

    public Loewe(int id, int gewicht, int groesse, String titel, String lieblingsspeise) {
        super(id, gewicht, groesse);
        this.titel = titel;
        this.lieblingsspeise = lieblingsspeise;
    }

    public String getTitel(){
        return titel;
    }

    public String getLieblingsspeise(){
        return lieblingsspeise;
    }

    @Override
    public String datenblatt() {
        return new StringBuilder()
        .append("Art:         ").append("Löwe").append("\n")
        .append("ID:          ").append(getId()).append("\n")
        .append("Grösse:      ").append(getGroesse()).append("\n")
        .append("Gewicht:     ").append(getGewicht()).append("\n")
        .append("Titel:       ").append(getTitel()).append("\n") 
        .append("Futter:      ").append(getLieblingsspeise()).append("\n") 
        .toString();
    }


}
