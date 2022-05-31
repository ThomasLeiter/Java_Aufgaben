package Programmieraufgaben;

public class Osterfest {
    
    public static void osterfest(int jahr){
        int a = jahr % 4;
        int b = jahr % 7;
        int c = jahr % 19;
        int d = (19*c+24) % 20;
        int e = (2*a + 4*b + 6*d + 5) % 7;
        int f = (c + 11*d + 22*e)/451;
        int tag = 22 + d + e - 7*f;
        int monat = 3;
        if (tag > 31){
            tag -= 31;
            monat = 4;
        }
        if (tag == 26 && monat == 4){
            tag = 19;
            monat = 3;
        }
        System.out.printf("Ostersonntag %d war der %d.%d..",jahr,tag,monat);
    }

}
