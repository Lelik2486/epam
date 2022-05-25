package com.lelik.algorithmization.oneDimensionalArrays;
/*Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input array lenght");
        int n = Integer.parseInt(reader.readLine());
        double[] arr = new double[n];
        InAndOutArray.fillingDoubleWithConsole(arr);
        InAndOutArray.outArray(arr);
        System.out.println();
        double  summ = arr[0]+arr[1];
        for (int i = 2; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0)count++;
            }
            if (count == 2) summ += arr[i];
        }
        System.out.println(summ);
    }
}
