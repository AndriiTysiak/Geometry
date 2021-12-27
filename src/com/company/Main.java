package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[6];
        Point[] pointOfTriangle = new Point[3];
        pointOfTriangle[0] = new Point(1, 2);
        pointOfTriangle[1] = new Point(5, 3);
        pointOfTriangle[2] = new Point(3, 4);
        Triangle triangle = new Triangle(pointOfTriangle);
        triangle.getPerimeter();
        triangle.getArea();
        System.out.println(triangle);
        Point[] pointOfRectangle = new Point[1];
        pointOfRectangle[0] = new Point(1, 2);
        Rectangle rectangle = new Rectangle(pointOfRectangle, 12, 10);
        rectangle.getPerimeter();
        rectangle.getArea();
        System.out.println(rectangle);
        Point[] pointOfCircle = new Point[1];
        pointOfCircle[0] = new Point(1, 2);
        Circle circle = new Circle(pointOfCircle, 8.5);
        circle.getPerimeter();
        circle.getArea();
        System.out.println(circle);
        Point[] pointOfSpaceShape = new Point[1];
        pointOfSpaceShape[0] = new Point(3, 4, 5.3);
        SquarePyramid squarePyramid = new SquarePyramid(pointOfSpaceShape, 20.4, 30);
        squarePyramid.getArea();
        squarePyramid.getVolume();
        System.out.println(squarePyramid);
        Cuboid cuboid = new Cuboid(pointOfSpaceShape, 10.1, 10.8, 10.6);
        cuboid.getArea();
        cuboid.getVolume();
        System.out.println(cuboid);
        Sphere sphere = new Sphere(pointOfSpaceShape, 44.4);
        sphere.getArea();
        sphere.getVolume();
        System.out.println(sphere);
        shape[0] = triangle;
        shape[1] = rectangle;
        shape[2] = circle;
        shape[3] = squarePyramid;
        shape[4] = cuboid;
        shape[5] = sphere;
        System.out.println(Arrays.toString(shape));
    }
}
