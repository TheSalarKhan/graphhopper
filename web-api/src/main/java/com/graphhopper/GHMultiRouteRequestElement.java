package com.graphhopper;

import com.graphhopper.util.shapes.GHPoint;

import java.util.ArrayList;
import java.util.List;

public class GHMultiRouteRequestElement {
    private List<String> points;

    public List<GHPoint> getGHPoints(){
        List<GHPoint> toReturn = new ArrayList<>(points.size());
        for(String p: points) {
            toReturn.add(GHPoint.fromString(p));
        }
        return toReturn;
    }

    public List<String> getPoints() {
        return points;
    }

    public void setPoints(List<String> points) {
        this.points = points;
    }
}
