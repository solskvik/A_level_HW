package com.smolskyi;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        for (; i <= 10; i ++){
            { if (i == 3)
                continue;
            }
        {if (i == 6)
                break;
            }}
        System.out.println (i);
    }
}