package com.lelik.algorithmization.oneDimensionalArrays;
/*Дана последовательность целых чисел a1,a2,,an . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min(a1,a2,,an)*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input array lenght");
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        InAndOutArray.fillingIntWithConsole(arr);
        int min = arr[0];
        int count = 0;
        for (int i : arr) {
            if (min > i){
                min= i;
                count++;
            }
        }
        int[] newArr = new int[arr.length-count];
        int indexNewArr =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=min){
                newArr[indexNewArr] = arr[i];
                indexNewArr++;
            }
        }
        InAndOutArray.outArray(newArr);
    }
}
