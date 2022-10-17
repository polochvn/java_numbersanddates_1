package practice;

import net.sf.saxon.expr.Component;

public class GeometryCalculator {

    public static double radius;
    public static double a;
    public static double b;
    public static double c;

    public static boolean isTrianglePossible;
    public static double circleSquare;
    public static double triangleSquare;
    public static double sphereVolume;


    // если значение radius меньше 0, метод должен вернуть -1
    public static double getCircleSquare(double radius) {
        if (radius < 0) {
            return radius = -1.0;
        } else {
            return circleSquare = Math.PI * radius * radius;
        }
    }

    // если значение radius меньше 0, метод должен вернуть -1
    public static double getSphereVolume(double radius) {
        if (radius < 0) {
            return radius = -1.0;
        } else {
            return sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
        }
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return isTrianglePossible = true;
        } else {
            return isTrianglePossible = false;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a, b, c)) {
            double p = (a + b + c) / 2.0;
            return triangleSquare = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            return triangleSquare = -1.0;
        }
    }
}
