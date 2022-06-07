package com.lelik.algorithmization.matrix;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number rows");
        int n = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j += 2) {
                matrix[j][i] = i+1;
            }
            for (int k = 1; k < n; k += 2) {
                matrix[k][i] = n - i;
            }
        }
        InAndOut.outMatrix(matrix);
    }
}
