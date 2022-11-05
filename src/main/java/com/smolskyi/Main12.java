package com.smolskyi;

public class Main12 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90 + 10);
            System.out.println(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i - 1] >= array[i]) {
                    System.out.println("Послідовність не зростаюча");
                    break;
                }
            }
            if (i == array.length - 1 ) {
                System.out.println("Послідовність зростаюча" );
            }
        }
    }
}
