package com.lelik.algorithmization.oneDimensionalArrays;
/* Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input array lenght");
        int n = Integer.parseInt(reader.readLine());
        double[] arr = new double[n];
        InAndOutArray.fillingDoubleWithConsole(arr);
        InAndOutArray.outArray(arr);
        double max = arr[0];
        double min = arr[0];
        int maxindex = 0;
        int minindex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
                minindex = i;
            }
            else if (arr[i] > max){
                max = arr[i];
                maxindex = i;
            }
        }
        double temp = arr[minindex];
        arr[minindex] = arr[maxindex];
        arr[maxindex] = temp;
        InAndOutArray.outArray(arr);
    }
}
