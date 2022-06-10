package Klausuren.Klausur_Java_Regensburg_WS_15_16;

public class Aufgabe_5 {

    public String doStuff(String s1, String s2) {
        String result = "";
        for (int i = 0; i < s1.length(); i++) {// Iteration über String s1
            char c = s1.charAt(i); // Auslesen des i-ten Zeichens
            if (s2.indexOf(c) != -1 && result.indexOf(c) == -1) {
                // Falls c in s2 und (noch) nicht in result, 
                // hänge c an result an
                result += c;
            }
        }
        /* Das Ergebnis ist die Schnittmenge der Strings
         * e.g. 
         * "menge","eng" -> "eng"
         * "differenz","zahl" -> "z"
        */  
        return result;
    }

    public static void main(String[] args){
        var c = new Aufgabe_5();
        System.out.println(c.doStuff("menge", "eng"));
        System.out.println(c.doStuff("differenz", "zahl"));
    }

}
