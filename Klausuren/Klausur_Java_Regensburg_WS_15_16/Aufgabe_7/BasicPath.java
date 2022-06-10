package Klausuren.Klausur_Java_Regensburg_WS_15_16.Aufgabe_7;

import java.util.ArrayList;

public class BasicPath {
    protected ArrayList<Point> points;

    public BasicPath() {
        points = new ArrayList<Point>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

}