package com.lelik.algorithmization.matrix;

/*Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
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
        for (int i = 0; i < n; i+=2) {
            if (matrix[0][i]>matrix[m-1][i]){
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[j][i]);
                }
                System.out.println();
            }
        }
    }
}
