package Klausuren.Klausur_Java_Regensburg_WS_15_16.Aufgabe_7;

public class ExtendedPath extends BasicPath {
    
    private double euclideanDistance(Point P, Point Q){
        return Math.sqrt(Math.pow(Q.getX()-P.getX(),2)+Math.pow(Q.getY()-P.getY(),2));
    }

    public double length(){
        double totalDistance = 0;
        for (int i = 1; i < points.size(); ++i){
            totalDistance += euclideanDistance(points.get(i-1), points.get(i));
        }
        return totalDistance;
    }

}
