package com.lelik.algorithmization.oneDimensionalArrays;
/*Даны действительные числа a1,a2,,an . Найти
max( a1 + a2n,a2 + a2n−1,,an + an+1) .*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input array lenght");
        int n = Integer.parseInt(reader.readLine());
        double[] arr = new double[n];
        InAndOutArray.fillingDoubleWithConsole(arr);
        InAndOutArray.outArray(arr);
        System.out.println();
        double sumMax = arr[0] + arr[arr.length-1];
        for (int i = 1; i < (arr.length-2)/2; i++) {
            if (sumMax < arr[i]+arr[arr.length-i])sumMax = arr[arr.length-i];
        }
        System.out.println(sumMax);
    }
}
