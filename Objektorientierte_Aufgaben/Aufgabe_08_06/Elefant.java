package Objektorientierte_Aufgaben.Aufgabe_08_06;

public class Elefant extends Tier {

    private final int ruessellaenge;

    /**
     * Konstruktor
     * @param id        ID des Tieres
     * @param gewicht   Gewicht des Tieres in kg
     * @param groesse   Größe des Tieres in cm
     * @param ruessellaenge Rüssellänge in cm
     */
    public Elefant(int id, int gewicht, int groesse, int ruessellaenge) {
        super(id, gewicht, groesse);
        this.ruessellaenge = ruessellaenge;
    }

    public int getRuessellaenge(){
        return ruessellaenge;
    }

    @Override
    public String datenblatt() {
        return new StringBuilder()
        .append("Art:         ").append("Elefant").append("\n")
        .append("ID:          ").append(getId()).append("\n")
        .append("Grösse:      ").append(getGroesse()).append("\n")
        .append("Gewicht:     ").append(getGewicht()).append("\n")
        .append("Rüssellänge: ").append(getRuessellaenge()).append("\n") 
        .toString();
    }
    
}
