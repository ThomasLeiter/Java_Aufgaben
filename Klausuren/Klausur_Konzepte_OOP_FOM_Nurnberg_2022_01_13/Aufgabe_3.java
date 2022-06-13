package Klausuren.Klausur_Konzepte_OOP_FOM_Nurnberg_2022_01_13;

public class Aufgabe_3 {
    
    public int berechneSteuer(double zuVersteuerndesEinkommen, boolean ehegattenSplitting){
        double steuer;
        if (ehegattenSplitting){
            steuer = 2. * berechneSteuer(zuVersteuerndesEinkommen/2., false);
            return (int) steuer;
        }
        int x = (int) zuVersteuerndesEinkommen;
        if (x <= 9744){
            return 0;
        }
        if (x <= 14753){
            double y = (x - 9744) / 10000.;
            steuer = (995.21 * y + 1400) * y;
            return (int) steuer;
        }
        if (x <= 57918){
            double z = (x - 14753) / 10000.;
            steuer =  (208.85 * z + 2397) * z + 950.96;
            return (int) steuer;
        }
        if (x <= 274612){
            steuer = 0.42 * x - 9136.63;
            return  (int) steuer;
        }
        steuer = 0.45 * x - 17374.99;
        return  (int) steuer;
    }

}
