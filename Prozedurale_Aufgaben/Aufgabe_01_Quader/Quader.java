package Prozedurale_Aufgaben.Aufgabe_01_Quader;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Quader{

    /**
     * Ask user via dialogue for a number.
     * @param msg The message to be sent.4
     * @return The number that was put in by the user.
     */
    private static int readNumberDialog(String msg){
        String input = JOptionPane.showInputDialog(msg);
        return Integer.parseInt(input);
    }

    /**
     * Read a number from Console
     * @param msg The message to be sent. 
     * @return The number that was put in by the user.
     */
    private static int readNumberStandardInput(String msg, Scanner scanner){
        System.out.println(msg);
        return Integer.parseInt(scanner.next());
    }

    /**
     * Calculate and output data to the standard console
     */
    private static void outputResults(int a, int b, int c){
        int area = 2*a*b + 2*a*c + 2*b*c;
        int volume = a*b*c;
        System.out.printf("Ein Quader der Länge %d, Breite %d und Höhe %d \nbesitzt eine Oberfläche von %dcm² \nund ein Volumen von %dcm³.\n", a,b,c,area,volume);
    } 

    public static void main(String[] args){
        int a = readNumberDialog("Bitte Länge a eingeben");
        int b = readNumberDialog("Bitte Breite b eingeben");
        int c = readNumberDialog("Bitte Höhe c eingeben");
        outputResults(a,b,c);
        Scanner scanner = new Scanner(System.in);
        a = readNumberStandardInput("Bitte Länge a eingeben",scanner);
        b = readNumberStandardInput("Bitte Breite b eingeben",scanner);
        c = readNumberStandardInput("Bitte Höhe c eingeben",scanner);
        scanner.close();
        outputResults(a,b,c);

    }

}