package Klausuren.Klausur_OOP_2021;

public abstract class GeometrischesObject {
    
    public abstract double flaeche();
    public abstract double umfang();

    public static class Rechteck extends GeometrischesObject{

        private final double a;
        private final double b;

        private Rechteck(double a, double b){
            this.a = a;
            this.b = b;
        }

        @Override
        public double flaeche() {
            return a*b;
        }

        @Override
        public double umfang() {
            return 2.*(a+b);
        }

    }

    public static class Viereck extends Rechteck{

        Viereck(double a) {
            super(a, a);
        }

    }

}
