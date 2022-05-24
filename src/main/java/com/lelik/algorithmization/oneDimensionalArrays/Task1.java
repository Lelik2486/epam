package com.lelik.algorithmization.oneDimensionalArrays;

/* В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input K");
        int k = Integer.parseInt(reader.readLine());
        System.out.println("Input array lenght");
        int n  = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        ArrayFilling.fillingIntWithConsole(arr);
        int summ =0;
        for (int i : arr) {
            if (i % k == 0)summ+=i;
        }
        System.out.println(summ);





    }
}