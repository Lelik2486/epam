package com.lelik.algorithmization.oneDimensionalArrays;
/*В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input array lenght");
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        InAndOutArray.fillingIntWithConsole(arr);
        InAndOutArray.outArray(arr);
        System.out.println();
        int [] arrNumberOfRepetitions = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            int count = 0;
            for (int a : arr) {
               if (arr[i] == a)count++;
            }
            arrNumberOfRepetitions[i] = count;
        }
        int maxRepetitions = arrNumberOfRepetitions[0];
        int maxIndex = 0;
        for (int i = 0; i < arrNumberOfRepetitions.length; i++) {
            if (arrNumberOfRepetitions[i]>maxRepetitions)maxRepetitions=arrNumberOfRepetitions[i];
            maxIndex = i;
        }
        int minValue =arr[maxIndex];
        for (int i = 0; i < arrNumberOfRepetitions.length; i++) {
            if (maxRepetitions==arrNumberOfRepetitions[i] && minValue<arr[i])minValue=arr[i];
        }
        System.out.println(minValue);
    }
}
