package Klausuren.Klausur_Konzepte_OOP_FOM_Dusseldorf_2021_06_08;

public class Aufgabe_1 {

    // e)
    /* 
     * Konstante
     * Das final Keyword verhindert jede Modifikation
     * Namenskonvention Großbuchstaben und Unterstriche
     */
    public final static int CONSTANT_ZERO = 0;
    
    // a)
    static abstract class ParentClass{
        /* 
         * Abstrakte Methode 
         * Besitzt keinen Methodenkörper.
         * Muss von konkreter Spezialisierung implementiert werden.
        */ 
        abstract void abstractParentMethod();

        void implementedParentMethod(){
            // b)
            /*
             * Methodenaufruf
             * Die Methode println des Ausgabestreams wird 
             * mit dem Parameterwert "Hello from Parent!" 
             * aufgerufen.
             */
            System.out.println("Hello from Parent!");
        }

        // f)
        /* 
         * Kapselung 
         * Das private Feld kann nicht von
         * außenstehenden Klassen modifiziert werden.
        */ 
        private Object privateField;

        ParentClass(){}

        // c) 
        /* 
         * Überladene Methode (hier Konstruktor)
         * Gleicher Methodenname - andere Parameteranzahl oder Typen
         */
        ParentClass(Object myParameter){
            privateField = myParameter;
        }
    }

    // d)
    /* 
     * Vererbung
     * Die Kindklasse erbt alle Methoden und Felder der Elternklasse
     * Hier also die Methoden implementedParentMethod und abstractParentMethod.
     * Letztere ist abstrakt und MUSS überschrieben werden, erstere KANN
     * überschrieben werden.
     */
    static class ChildClass extends ParentClass{

        @Override
        void abstractParentMethod() {
            System.out.println("Hello from Child!");
        }
        
    }

}
