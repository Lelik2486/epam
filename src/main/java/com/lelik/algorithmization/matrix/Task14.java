package com.lelik.algorithmization.matrix;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
//        Код для квадратной матрицы
        Random random = new Random();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            matrix[0][i]=0;
        }
        for (int i = 1; i < n; i++) {
            int amount=0;

            if (matrix[0][i]==1)amount++;
            for (int j = 0; j < m; j++) {
                if(amount<i&&i==amount+m-j)matrix[j][i]=1;
                else if(amount<i&&i<amount+m-j)matrix[j][i]= random.nextInt(0,2);
                else if(amount==i)matrix[j][i]=0;
                if (matrix[j][i]==1)amount++;
            }


        }
        InAndOut.outMatrix(matrix);
    }
}