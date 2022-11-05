package com.smolskyi;

public class Main10 {
    public static void main(String args[]) {
        int[] array = new int[12];
        int maxNumber = -16;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random()*31)-15);
            System.out.println(array[i]);
            if(maxNumber <= array[i]){
                maxNumber = array[i];
                maxIndex = i;
            }
        }

        System.out.println("Індекс максимального елемента: " + maxIndex);

        }

    }

