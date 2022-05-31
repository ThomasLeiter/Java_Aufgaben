package Programmieraufgaben;

public class SummeKehrwert {
    
    public static float summeVorwärts(int n){
        float result = 0;
        for (int i = 1; i <= n; ++i){
            result += 1./i;
        }
        return result;
    }

    public static float summeRückwärts(int n){
        float result = 0;
        for (int i = n; i > 0; --i){
            result += 1./i;
        }
        return result;
    }
    
    public static double summeVorwärtsDouble(int n){
        double result = 0.;
        for (int i = 1; i <= n; ++i){
            result += 1./i;
        }
        return result;
    }

    public static double summeRückwärtsDouble(int n){
        double result = 0.;
        for (int i = n; i > 0; --i){
            result += 1./i;
        }
        return result;
    }

    public static void main(String[] args){

        int[] array = {2,1000,1000000,1000000000};
        for (int n : array){
            System.out.println(n);
            System.out.println(summeVorwärts(n));
            System.out.println(summeRückwärts(n));
            System.out.println(summeVorwärtsDouble(n));
            System.out.println(summeRückwärtsDouble(n));
            System.out.println();
        }

    }

}
