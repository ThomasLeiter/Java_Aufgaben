package Prozedurale_Aufgaben.Aufgabe_42_BubbleSort;

import java.util.Random;

public class BubbleSort {

    private static Random random = new Random();
    
    private static int[] randomArray(int N){
        int[] array = new int[N];
        for (int i = 0; i < N; ++i){
            array[i] = random.nextInt();
        }
        return array;
    }

    private static void swap(int[] array, int i, int j){
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    private static int bubbleSort(int[] array){
        int swapCount = 0;
        int N = array.length;
        for (int i = N-2; i>=0; --i){
            for (int j = i; j<N-1; ++j){
                if (array[j]>array[j+1]){
                    swap(array, j, j+1);
                    ++swapCount;
                }
            }
        }
        return swapCount;
    }

    public static void main(String[] args){
        int N = 10000;
        int[] array = randomArray(N);
        System.out.printf("%d Elemente zu sortieren benötigte %d Swaps.",N,bubbleSort(array));
    }

}
