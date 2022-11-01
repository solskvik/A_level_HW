package com.smolskyi;

public class Main3 {
    public static void main(String[] args) {
        int a = (int) (Math.random() *10);
        System.out.println(a);

  if (a%2==0) {
        System.out.println(a+" - парне число");
    } else {
        System.out.println(a+" - непарне число");
    }
}
}

