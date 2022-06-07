package com.lelik.algorithmization.matrix;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
        столбец содержит максимальную сумму.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number rows");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Input number columns");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Input origin");
        int min = Integer.parseInt(reader.readLine());
        System.out.println("Input bound");
        int max = Integer.parseInt(reader.readLine());
        int[][] matrix = InAndOut.newMatrix(m, n, min, max);
        InAndOut.outMatrix(matrix);
        int maxSumm = 0;
        int indexMaxSumm = 0;
        for (int i = 0; i < n; i++) {
            int summ = 0;
            for (int j = 0; j < m; j++) {
                summ = summ + matrix[j][i];
                System.out.print(summ+ " ");
                if (summ > maxSumm){
                    maxSumm = summ;
                    indexMaxSumm = i;
                }
            }
        }
        System.out.println("max index "+ indexMaxSumm);
    }
}
