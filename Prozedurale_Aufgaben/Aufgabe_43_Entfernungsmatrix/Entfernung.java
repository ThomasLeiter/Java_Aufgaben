package Prozedurale_Aufgaben.Aufgabe_43_Entfernungsmatrix;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Entfernung {

    static class Pair<U,V>{
        U head;
        V tail;
        Pair(U u, V v){
            head = u;
            tail = v;
        }
        @Override
        public String toString(){
            return "(" + head + "," + tail + ")";
        }
    }

    /**
     * Calculates the cartesian product of two lists
     * @param <U>
     * @param <V>
     * @param lhs
     * @param rhs
     * @return The list of all pairs (x,y) where x in lhs and y in rhs 
     */
    static <U,V> List<Pair<U,V>> cartesianProduct(List<U> lhs, List<V> rhs){
        return lhs.stream()
        .flatMap(x -> rhs.stream().map(y -> new Pair<>(x, y)))
        .collect(Collectors.toList());
    } 

    /**
     * Calculate the distance of a pair of cities (i.e. coordinate pairs)
     * @param cityPair
     * @return The Euclidian distance between the two cities 
     */
    static double distance(Pair<Pair<Long,Long>,Pair<Long,Long>> cityPair){
        Pair<Long,Long> lhs = cityPair.head;
        Pair<Long,Long> rhs = cityPair.tail;
        return Math.sqrt(Math.pow(rhs.head-lhs.head,2) + Math.pow(rhs.tail-lhs.tail,2));
    }

    public static void main(String... args){
        int N = 4;
        // Create a List of N random coordinate pairs
        var listOfCities = IntStream
        .range(0, N)
        .mapToObj(t -> new Pair<Long,Long>(Math.round(Math.random()*100),Math.round(Math.random()*100)))
        .collect(Collectors.toList());
        
        /* Create the cartesian product of the list with 
            itself and calculate pairwise distances.
        */ 
        var listOfDistances = cartesianProduct(listOfCities, listOfCities).stream()
        .map(pair -> new Pair<Pair<Pair<Long,Long>,Pair<Long,Long>>,Double>(pair,distance(pair)))
        .collect(Collectors.toList());

        // Output
        listOfDistances.stream()
        .forEach(p -> System.out.println(p));
    }

}
