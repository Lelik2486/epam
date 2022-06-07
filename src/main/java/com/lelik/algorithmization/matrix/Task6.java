package com.lelik.algorithmization.matrix;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.abs;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number rows");
        int n = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-i; j ++ ) {
                matrix[i][j] = 1;
            }
            for (int j = n-i-1; j < i+1; j ++ ) {
                matrix[i][j] = 1;
            }
        }
        InAndOut.outMatrix(matrix);
    }
}
