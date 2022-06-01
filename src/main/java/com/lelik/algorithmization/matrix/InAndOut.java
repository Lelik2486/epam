package com.lelik.algorithmization.matrix;


import java.util.Random;

public class InAndOut {
    public static int[][] newMatrix(int m, int n, int min, int max ){
        Random random = new Random();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               matrix[i][j] = random.nextInt(min,max);
            }
        }
        return matrix;
    }
    public static void outMatrix(int[][] matrix){
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
