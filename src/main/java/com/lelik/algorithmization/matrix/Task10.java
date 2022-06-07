package com.lelik.algorithmization.matrix;

/*Найти положительные элементы главной диагонали квадратной матрицы*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number rows");
        int m = Integer.parseInt(reader.readLine());
        int n = m;
        System.out.println("Input origin");
        int min = Integer.parseInt(reader.readLine());
        System.out.println("Input bound");
        int max = Integer.parseInt(reader.readLine());
        int[][] matrix = InAndOut.newMatrix(m, n, min, max);
        InAndOut.outMatrix(matrix);
        for (int i = 0; i < m; i++) {
            if (matrix[i][i]>0) System.out.println(matrix[i][i]);
        }
    }
}
