package Klausuren.Klausur_OOP_2021;

public class OOPBegriffe {

    private String klassenVariable;
    
    public OOPBegriffe(){
        // Standardkonstruktor
    }

    /**
     * Overloaded Method
     * Überladene Methode (hier Konstruktor)
     * Gleicher Name - abweichende Signatur
     * @param formalerParameter
     */
    public OOPBegriffe(String formalerParameter){
        this.klassenVariable = formalerParameter;
    }

    /**
     * Overridden method
     * Überschriebene Methode
     * Gleiche Signatur wie in der Elternklasse (hier Object)
     */
    @Override
    public String toString(){
        return "Dies ist eine überschriebene Methode.";
    }

    /**
     * Methodendeklaration (nebst Implementierung)
     * @return Verblüffendes Ergebnis
     */
    public String ausgabe(){
        return this.klassenVariable;
    }

    public static void main(String[] args){
        // Aktueller Parameter = Konkreter Wert des Arguments
        OOPBegriffe instanz = new OOPBegriffe("aktueller Parameter");
        // Methodenaufruf
        instanz.ausgabe();
    }

}
