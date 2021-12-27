package com.company;

public class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {
    public SpaceShape(Point[] vertices) {
        super(vertices);
    }


    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}
