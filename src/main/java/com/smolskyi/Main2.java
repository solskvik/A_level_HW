package com.smolskyi;

public class Main2 {
    public static void main (String [] args) {
        double a;

        a = triangleArea(3, 3, 3);
        System.out.println("Площа трикутника " + a);

        a = triangleArea(3, 4, 5);
        System.out.println("Площа трикутника " + a);

        a = triangleArea(9, 9, 9);
        System.out.println("Площа трикутника " + a );

    }
    public static double triangleArea( int a, int b, int c )
    {
        double s=(((a+b+c)/2.0)*((a+b+c)/2.0-a)*((a+b+c)/2.0-b)*((a+b+c)/2.0-c));
        return Math.sqrt(s);
    }

}
