package com.smolskyi;
import java.util.Scanner;
public class Main2 {
    public static void main (String [] args) {
        Scanner s1= new Scanner(System.in);

        System.out.println("Ввести розмір першої сторони:");
        int a= s1.nextInt ();

        System.out.println("Ввести розмір другої сторони:");
        int b= s1.nextInt();

        System.out.println("Ввести розмір третьої сторони:");
        int c= s1.nextInt ();
        if((a+b)>c && (a+c)>b && (b+c)>a)
        {
            int s=(a+b+c)/2;
            double  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Площа трикутника: " + area);
        }
        else
            System.out.println("Площа треектника не рахується");
    }
}
