package Objektorientierte_Aufgaben.Aufgabe_08_06;

public class Giraffe extends Tier {

    private final int halslaenge;

    /**
     * Konstruktor
     * @param id        ID des Tieres
     * @param gewicht   Gewicht des Tieres in kg
     * @param groesse   Größe des Tieres in cm
     * @param halslaenge Halslänge in cm
     */
    public Giraffe(int id, int gewicht, int groesse, int halslaenge) {
        super(id, gewicht, groesse);
        this.halslaenge = halslaenge;
    }

    public int getHalslaenge(){
        return halslaenge;
    }

    @Override
    public String datenblatt() {
        return new StringBuilder()
        .append("Art:         ").append("Giraffe").append("\n")
        .append("ID:          ").append(getId()).append("\n")
        .append("Grösse:      ").append(getGroesse()).append("\n")
        .append("Gewicht:     ").append(getGewicht()).append("\n")
        .append("Halslänge:   ").append(getHalslaenge()).append("\n") 
        .toString();
    }

}
