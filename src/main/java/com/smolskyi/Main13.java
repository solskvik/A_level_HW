package com.smolskyi;

public class Main13 {
    public static void main(String[] args) {
        double sumArray1 = 0, sumArray2 = 0;
        int[] array1 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 6);
            System.out.println(array1[i] + " ");
            sumArray1 += (double) array1[i] / array1.length;
        }
        System.out.println(" ");
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 6);
            System.out.println(array2[i] + " ");
            sumArray2 += (double) array2[i] / array2.length;
        }
        System.out.println(" ");
        if (sumArray1 == sumArray2)
            System.out.println("Середнє арифметичне значення двох масивів рівні");
        else {
            if (sumArray1 > sumArray2)
                System.out.println("Середнє арифметичне значення першого масива більше");
            else System.out.println("Середнє арифметичне значення другого масива більше");
        }
    }
}

