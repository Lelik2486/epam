package com.lelik.algorithmization.matrix;

/*Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.*/

import java.util.Arrays;
import java.util.Collections;

public class Task13 {
    public static void main(String[] args) {
        int m = 5;
        int n = 10;
        int min = 0;
        int max = 15;
        int[][] matrix = InAndOut.newMatrix(m, n, min, max);
        InAndOut.outMatrix(matrix);
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int tmp;
                for (int k = 0; k < m-1; k++) {
                    if (matrix[k][i]>matrix[k+1][i]){
                        tmp=matrix[k+1][i];
                        matrix[k+1][i]=matrix[k][i];
                        matrix[k][i]=tmp;
                    }
                }
            }
        }
        InAndOut.outMatrix(matrix);
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int tmp;
                for (int k = 0; k < m-1; k++) {
                    if (matrix[k][i]<matrix[k+1][i]){
                        tmp=matrix[k+1][i];
                        matrix[k+1][i]=matrix[k][i];
                        matrix[k][i]=tmp;
                    }
                }
            }
        }
        InAndOut.outMatrix(matrix);
        System.out.println();

    }
}