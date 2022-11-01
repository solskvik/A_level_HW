package com.smolskyi;

public class Main9 {
    public static void main (String args[]) {
        String line = "Java Exercises";
        String line1 = "Java Exercise";
        boolean b = line.endsWith("se");
        boolean b1 = line1.endsWith("se");
        System.out.println("Строка " + line + " закінчується на 'se'?  " + b);
        System.out.println("Строка " + line1 + " закінчується на 'se'?  " + b1);
    }
}
