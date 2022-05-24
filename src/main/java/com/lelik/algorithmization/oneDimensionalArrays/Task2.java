package com.lelik.algorithmization.oneDimensionalArrays;

/* Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input Z");
        int z = Integer.parseInt(reader.readLine());
        System.out.println("Input array lenght");
        int n  = Integer.parseInt(reader.readLine());
        double [] arr= new double[n];
        ArrayFilling.fillingDoubleWithConsole(arr);
        for (double v : arr) {
            System.out.println(v);
        }
        int replacement = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>z){
                arr[i] = z;
                replacement++;
            }
        }
        System.out.println("New array");
        for (double v : arr) {
            System.out.println(v);
        }
        System.out.println("Number of replacement = " + replacement);
    }
}
