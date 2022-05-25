package com.lelik.algorithmization.oneDimensionalArrays;

/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input array lenght");
        int n = Integer.parseInt(reader.readLine());
        double[] arr = new double[n];
        InAndOutArray.fillingDoubleWithConsole(arr);
        InAndOutArray.outArray(arr);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (double v : arr) {
            if (v > 0)positive++;
            else if (v < 0)negative++;
            else zero++;
        }
        System.out.println("positive = " + positive + " negative = " + negative + " zero = " + zero);

    }
}
