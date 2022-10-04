package com.lelik.algorithmization.matrix;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/

import java.util.Arrays;
import java.util.Collections;

public class Task12 {
    public static void main(String[] args) {
        int m = 5;
        int n = 10;
        int min = 0;
        int max = 15;
        int[][] matrix = InAndOut.newMatrix(m, n, min, max);
        InAndOut.outMatrix(matrix);
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int tmp;
                for (int k = 0; k < n-1; k++) {
                    if (matrix[i][k]>matrix[i][k+1]){
                        tmp=matrix[i][k+1];
                        matrix[i][k+1]=matrix[i][k];
                        matrix[i][k]=tmp;
                    }
                }
            }
        }
        InAndOut.outMatrix(matrix);
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int tmp;
                for (int k = 0; k < n-1; k++) {
                    if (matrix[i][k]<matrix[i][k+1]){
                        tmp=matrix[i][k+1];
                        matrix[i][k+1]=matrix[i][k];
                        matrix[i][k]=tmp;
                    }
                }
            }
        }
        InAndOut.outMatrix(matrix);
        System.out.println();

    }
}
