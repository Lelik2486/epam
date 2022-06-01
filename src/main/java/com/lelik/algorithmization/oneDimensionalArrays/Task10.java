package com.lelik.algorithmization.oneDimensionalArrays;

/*Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input array lenght");
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        InAndOutArray.fillingIntWithConsole(arr);
        InAndOutArray.outArray(arr);
        System.out.println();
        for (int i = 1; i < arr.length; i+=2) {
            arr[i] = 0;
        }
        InAndOutArray.outArray(arr);
    }
}
