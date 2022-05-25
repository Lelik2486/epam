package com.lelik.algorithmization.oneDimensionalArrays;
/*Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input array lenght");
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        InAndOutArray.fillingIntWithConsole(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.println(arr[i]);
            }
        }
    }
}
