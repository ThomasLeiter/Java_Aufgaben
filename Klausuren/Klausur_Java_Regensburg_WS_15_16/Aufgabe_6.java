package Klausuren.Klausur_Java_Regensburg_WS_15_16;

public class Aufgabe_6 {

    public class CharCounter {
        private String inputString;

        public CharCounter(String inputString) {
            inputString = inputString; 
            /* Vergessenes this.
             * Anweisung weist der Parametervariablen inputString
             * sich selbst zu statt ihren Wert der Instanzvariablen 
             * this.inputString zuzuweisen.
             */ 
        }

        public int countChar ( char c) {
            int NUMBER_OF_CHARS = 0; 
            /* 
             * Namenskonvention für Konstanten sollte
             * NICHT für Variablen verwendet werden.
            */ 
            for ( int i = 0; i <= inputString . length () ; i ++) {
                /* 
                * Off-by-One-Error. Die Schleife darf nur 
                * solange i < inputString . length () laufen.
                */ 
                char currentChar = inputString . charAt (i );
                if( currentChar == c) { // Assignmentoperator = statt Vergleichsoperator ==
                    NUMBER_OF_CHARS ++;
                }
            }
            return NUMBER_OF_CHARS; // Vergessenes Semikolon
         }

    }

}
