package com.lelik.algorithmization.matrix;

/*Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.*/

public class Task11 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        int min = 0;
        int max = 15;
        int[][] matrix = InAndOut.newMatrix(m, n, min, max);
        InAndOut.outMatrix(matrix);
        System.out.println();
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (matrix [i][j] == 5)count++;
            }
            if (count > 3) System.out.println("num string "+(i+1));
        }
    }
}
