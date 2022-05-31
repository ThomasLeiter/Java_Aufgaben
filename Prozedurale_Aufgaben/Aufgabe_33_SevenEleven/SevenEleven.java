package Prozedurale_Aufgaben.Aufgabe_33_SevenEleven;

import java.util.Random;

public class SevenEleven {

    private static Random random = new Random();
    
    /**
     * Roll a D6
     * @return Eyes rolled
     */
    private static int throwDice(){
        return random.nextInt(6) + 1;
    }

    /**
     * Simulate a single game of SevenEleven
     * @return 1 if Win, 0 if Loss
     */
    private static int simulateGame(){
        int firstThrow = throwDice() + throwDice();
        if (firstThrow == 11 || firstThrow == 7){
            return 1;
        }
        if (firstThrow == 2 || firstThrow == 3 || firstThrow == 12){
            return 0;
        }
        int dice;
        while (true){
            dice = throwDice() + throwDice();
            if (dice == firstThrow){
                return 1;
            }
            if (dice == 7 || dice == 11){
                return 0;
            }
        }
    }

    /**
     * Simulate the game N times.
     * @param N Number od Repetitions
     * @return Number of simulated Games won by Player
     */
    private static int simulationWins(int N){
        int score = 0;
        for (int i = 0; i < N; ++i){
            score += simulateGame();
        }
        return score;
    }

    public static void main(String[] args){
        int N = 1000000;
        // Simulate N games
        int score = simulationWins(N);
        System.out.printf("Von %d Spielen wurden %d gewonnen.\n", N,score);
        // Calculate Probability respectively expected score 
        double E = N * (8./36. + 6./36.*3./11. + 8./36.*4./12. + 10./36.*5./13.);
        System.out.printf("Erwartet wurden %.2f Siege.",E);
    }

}
