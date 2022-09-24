package com.lelik.algorithmization.matrix;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int m = 5;
        int n = 10;
        int min = 0;
        int max = 15;
        int[][] matrix = InAndOut.newMatrix(m, n, min, max);
        InAndOut.outMatrix(matrix);
        System.out.println();
        for (int[] ints : matrix) {
            Arrays.sort(ints);
        }
        InAndOut.outMatrix(matrix);
    }
}
