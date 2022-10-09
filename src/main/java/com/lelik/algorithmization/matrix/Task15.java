package com.lelik.algorithmization.matrix;

/*Найдите наибольший элемент матрицы и заменить все нечетные элементы на него. */

public class Task15 {
    public static void main(String[] args) {
        int m = 5;
        int n = 10;
        int min = -7;
        int max = 15;
        int[][] matrix = InAndOut.newMatrix(m, n, min, max);
        InAndOut.outMatrix(matrix);
        System.out.println();
        int maxElement = matrix[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]>maxElement)maxElement=matrix[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]%2==0)matrix[i][j]=maxElement;

            }
        }
        InAndOut.outMatrix(matrix);
    }
}
