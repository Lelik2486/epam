package com.lelik.algorithmization.matrix;

/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
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
        System.out.println("Input K");
        int k = Integer.parseInt(reader.readLine());
        System.out.println("Input P");
        int p = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[k][i]);
        }
        for (int i = 0; i < m; i++) {
            System.out.println(matrix[i][p]);
        }
    }
}
