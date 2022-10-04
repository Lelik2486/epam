package com.lelik.algorithmization.matrix;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        Random random = new Random();
        int[][] matrix = new int[m][n];
        /* т.к. первый столбец имеет номер 0 то его можно заполнить нулями*/
        for (int i = 0; i < m; i++) {
            matrix[0][i]=0;
        }
        for (int i = 1; i < n; i++) {   /* проходим по столбцам*/
            int amount=0;   /* это счетчик количества единиц в столбце*/
            if (matrix[0][i]==1)amount++;
            for (int j = 0; j < m; j++) {   /*поход внутри столбца  */
                if(amount<i&&i==amount+m-j)matrix[j][i]=1;   /* если единиц меньше
                номера столбца и свободного места для нулей нет, то заполняем единицей */
                else if(amount<i&&i<amount+m-j)matrix[j][i]= random.nextInt(0,2); /*
                если единиц меньше номера столбца и свободное место для нулей есть, то заполняем рандом */
                else if(amount==i)matrix[j][i]=0;/*   если единиц достаточно, то заполняем 0  */
                if (matrix[j][i]==1)amount++;
            }
        }
        InAndOut.outMatrix(matrix);
    }
}