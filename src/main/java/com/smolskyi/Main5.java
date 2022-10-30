package com.smolskyi;

public class Main5 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);

        String result = a <= b ? "a" : a <= c && b <= c ? "b" : b <= c ? "b" : "c";{
            System.out.println(result);
        }
    }
}




