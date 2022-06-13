package Klausuren.Klausur_Konzepte_OOP_FOM_Nurnberg_2022_01_13;

public class Aufgabe_4 {
 
    static class ParentClass{
        // Methodendeklaration
        String sayHello(){
            return "Hello World! This is the ParentClass.";
        }
        // Überladene Methode
        String sayHello(String name){
            return "Hello " + name + "! This is the ParentClass.";
        }
    }

    static class ChildClass extends ParentClass{
        // Überschriebene Methode
        @Override
        String sayHello(){
            return "Hello World! This is the ChildClass.";
        }
    }

    public static void main(String[] args){
        var p = new ParentClass();
        String s = p.sayHello("Friend" /* aktueller Parameter */);
        System.out.println(s);
    }

}
