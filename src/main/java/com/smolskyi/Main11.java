package com.smolskyi;

public class Main11 {
    public static void main(String[] args){
        int[] array = new int[8];
        for(int i = 0; i < array.length; i++){
            array[i]=(int)(Math.random()*9+1);
            System.out.print(array[i] + " ");
        }
        for(int i=0; i<array.length; i++){
            if(array[i]%2!=0)array[i]=0;
            System.out.println(array[i] + " ");
        }
    }
}
