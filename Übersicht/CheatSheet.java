package Übersicht;

public class CheatSheet {
    
    // Nur innerhalb der Klasse sichtbar
    private int privateVariable = 12;
    // Im Package sichtbar
    int packagePrivateVariable = 22;
    // Im Package und für Tochterklassen sichtbar
    protected int protectedVariable = 32;
    // Überall sichtbar
    public int publicVariable = 42;
    // Konstate einer Instanz. Muss spätestens im 
    // Konstruktor auf einen Wert gesetzt werden.
    private final int finalVariable;

    // Standardkonstruktor
    CheatSheet(){
        this.finalVariable = 0;
    }

    // Spezialisierter Konstruktor
    CheatSheet(int id){
        this.finalVariable = id;
    }

    // Klassenvariable
    static int staticVariable = 1;
    // Konstante der Klasse. Nach Konvention
    // in Großbuchstaben und Unterstrichen.
    final static int STATIC_CONSTANT = 13;

    // Instanzmethode. 
    // Sie gehört zu und verwendet Daten einer
    // konkreten Instanz vom Typ CheatSheet.
    public int getPrivateVariable(){
        return this.privateVariable;
    }

    // Statische Methode. 
    // Sie ist dem Typ CheatSheet gemein und 
    // verwendet nur allgemeine, statische Daten.
    public static void increaseStaticVariable(){
        ++staticVariable;
    }

    class ParentClass{
        String name;
        ParentClass(String nameParameter){
            this.name = nameParameter;
        }
        public void parentClassMethod(){
            System.out.printf("Hello from ParentClass %s!\n",this.name);
        }
    }

    interface Interface{
        // Konstante eines Interface.
        // Sie ist automatisch public, final und static!
        int INTERFACE_CONSTANT = 0xeeee;
        // Abstrakte Methode eines Interface.
        // Sie ist autoamtisch public und abstract.
        String interfaceMethod();
    }

    // Anonyme Implementierung des Interfaces
    Interface anonymousInterface = new Interface(){
        @Override
        public String interfaceMethod() {
            return "Anonymous Interface Method!";
        }
    };

    abstract class AbstractClass{
        // Abstrakte Methoden besitzen keinen
        // Methodenkörper, sind also nicht implementiert.
        public abstract void abstractMethod();
    }

    // Anonyme Implementierung der abstrakten Klasse
    AbstractClass anonymousAbstractClass = new AbstractClass(){
        @Override
        public void abstractMethod() {
            System.out.println("Hello from AnonymousClass!");
        }
    };

    // final verhindert ein weiteres Vererben der FirstChildClass
    // extends zeigt an, dass eine Elternklasse erweitert wird
    // Eine Klasse kann höchstens eine Elternklasse besitzen.
    // Ohne explizite Angabe ist die Elternklasse stets Object.
    public final class FirstChildClass extends ParentClass{
        FirstChildClass(String nameParameter){
            // Konstruktor der Elternklasse erwartet einen 
            // Parameter und muss explizit aufgerufen werden.
            super(nameParameter);
        }
        public void firstChildClassMethod(){
            super.parentClassMethod();
            System.out.println("Hello from FirstChildClass!");
        }
    }

    // Ein weitere Erbe der Elternklasse
    public class SecondChildClass extends ParentClass{
        int age;
        SecondChildClass(String nameParameter, int ageParameter) {
            super(nameParameter);
            this.age = ageParameter;
        }

        // @Override kennzeichnet eine überschriebene Methode
        @Override
        public void parentClassMethod(){
            System.out.printf("I am %d years old and my name is %s!\n", age, name);
        }
    }

    // implements gibt an, dass ein Interface implementiert wird
    // Eine Klasse kann beliebig viele Interfaces implementieren.
    public class ImplementingClass implements Interface{

        // Methoden eines Interfaces sind abstrakt 
        // und müssen daher implementiert werden.
        @Override
        public String interfaceMethod() {
            return "Overridden Interface Method!";
        }

    }

}
