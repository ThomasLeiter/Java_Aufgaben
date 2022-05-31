package Prozedurale_Aufgaben.Aufgabe_22_Dreiecke;

public class Dreiecke {
    
    private static StringBuilder addStars(int n, int k, char star, char white, StringBuilder s){
        for (int i = 0; i<k; ++i){
            s.append(star);
        }
        for (int i = k; i<=n; ++i){
            s.append(white);
        }
        s.append(' ');
        return s;
    }

    private static StringBuilder addStarsReverse(int n, int k, char star, char white, StringBuilder s){
        for (int i = k; i<=n; ++i){
            s.append(white);
        }
        for (int i = 0; i<k; ++i){
            s.append(star);
        }
        s.append(' ');
        return s;
    }

    private static String buildLine(int n){
        StringBuilder s = new StringBuilder();
        for (int k = 0; k < n; ++k){
            addStars(n, k+1, '*', ' ', s);
            addStarsReverse(n, k+1, ' ', '*', s);
            addStars(n, k+1, ' ', '*', s);
            addStarsReverse(n, k+1, '*', ' ', s);
            s.append('\n');
        }
        return s.toString();
    }

    public static void main(String[] args){
        System.out.print(buildLine(5));
    }

}
