package Objektorientierte_Aufgaben.Aufgabe_08_06;

public class Main {
    
    public static void main(String[] args){

        // Erzeuge Array der Tiere unseres kleinen Zoos
        Tier[] tiere = {
            new Elefant(1,2500,255,127),
            new Elefant(2,3500,280,152),
            new Giraffe(3,800,402,190),
            new Giraffe(4,600,387,180),
            new Loewe(5, 190, 110, 
            "König der Tiere", "Geschmortes Streifengnu"),
            new Tier(6, 15, 35) {

                @Override
                public String datenblatt() {
                    return new StringBuilder()
                    .append("Art:         ").append("Unbekannt").append("\n")
                    .append("ID:          ").append(getId()).append("\n")
                    .append("Grösse:      ").append(getGroesse()).append("\n")
                    .append("Gewicht:     ").append(getGewicht()).append("\n")
                    .toString();
                }
                
            }
        };

        // Gib die Datenblätter der Tiere aus
        for (Tier t : tiere){
            System.out.println(t.datenblatt());
        }
    }

}
