package Objektorientierte_Aufgaben.Aufgabe_08_06;

public abstract class Tier {
    
    private final int id;
    private final int gewicht;
    private final int groesse;

    /**
     * Konstruktor
     * @param id        ID des Tieres
     * @param gewicht   Gewicht des Tieres in kg
     * @param groesse   Größe des Tieres in cm
     */
    public Tier(int id, int gewicht, int groesse){
        this.id = id;
        this.gewicht = gewicht;
        this.groesse = groesse;
    }

    public int getId(){
        return id;
    }

    public int getGewicht(){
        return gewicht;
    }

    public int getGroesse(){
        return groesse;
    }

    /**
     * Gibt das Datenblatt des Tieres aus
     * @return  Datenblatt als String der Form
     *          Schlüssel:  Wert
     */
    public abstract String datenblatt();

}
