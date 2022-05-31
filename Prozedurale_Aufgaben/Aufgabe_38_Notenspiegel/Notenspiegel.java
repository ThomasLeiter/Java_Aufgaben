package Prozedurale_Aufgaben.Aufgabe_38_Notenspiegel;

import java.util.Random;

public class Notenspiegel {

    /**
     * Build a random Array of Grades 1-5
     * @param count Length of array
     * @return The Array
     */
    static int[] randomGrades(int count){
        var rand = new Random();
        var arr = new int[count];
        for ( int i = 0; i < count; ++i){
            arr[i] = rand.nextInt(5) + 1;
        }
        return arr;
    }

    /**
     * Create the arithmetic average of given array
     * @param arr An array of ints
     * @return The arithmetic Average
     */
    static double average(int[] arr){
        double sum = 0.0;
        for (int n: arr){
            sum += n;
        }
        return sum/arr.length;
    }

    /**
     * Calculate the histogram of given array
     * @param arr Array of integers
     * @return histogram
     */
    static int[] histogram(int[] arr, int max){
        var histogram = new int[max+1];
        for (int n: arr){
            ++histogram[n];
        }
        return histogram;
    }

    /**
     * Build a row of the histogram
     * @param head The head of the row
     * @param count The number of symbols
     * @return The full string
     */
    static String histogramRow(String head, int count, char symbol){
        var str = new StringBuilder(head);
        for (int i = 0; i < count; ++i){
            str.append(symbol);
        }
        return str.toString();
    }

    /**
     * Print the histogram of given array of grades.
     * @param arr The array of grades
     */
    static void printHistogram(int[] arr){
        var histogram = histogram(arr, 5);
        String head;
        for (int grade = 1; grade <= 5; ++grade){
            head = "Note " + grade + ": ";
            System.out.println(histogramRow(head, histogram[grade], '*'));
        }
    }    

    public static void main(String[] args){
        int[] notenspiegel = randomGrades(100);
        printHistogram(notenspiegel);
    }

}
