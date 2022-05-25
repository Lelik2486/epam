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
        int [] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = i+1; j < arr.length-i; j++) {
                if(arr[i]==arr[j])count++;
            }
            res[i] = count;
        }
        int max = res[0];
        int indexMax =0;
        for (int i = 1; i < res.length-1; i++) {
            if (max<res[i]){
                indexMax=res[i];
                max = res[i];

            }
        }
        int maxArr = arr[indexMax];
        System.out.println(maxArr);
    }

}
