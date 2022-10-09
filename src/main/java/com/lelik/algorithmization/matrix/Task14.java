package com.lelik.algorithmization.matrix;
import java.util.Random;

/*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
        единиц равно номеру столбца.*/

public class Task14 {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        Random random = new Random();
        int[][] matrix = new int[m][n];
        /* т.к. первый столбец имеет номер 0 то его можно заполнить нулями*/
        for (int i = 0; i < n; i++) {   /* проходим по столбцам*/
            int amount=0;   /* это счетчик количества единиц в столбце*/
            for (int j = 0; j < m; j++) {   /*поход внутри столбца  */
                if(amount<(i+1)&&(i+1)==amount+m-j)matrix[j][i]=1;   /* если единиц меньше
                номера столбца и свободного места для нулей нет, то заполняем единицей */
                else if(amount<i+1&&(i+1)<amount+m-j)matrix[j][i]= random.nextInt(0,2); /*
                если единиц меньше номера столбца и свободное место для нулей есть, то заполняем рандом */
                else if(amount==(i+1))matrix[j][i]=0;/*   если единиц достаточно, то заполняем 0  */
                if (matrix[j][i]==1)amount++;
            }
        }
        InAndOut.outMatrix(matrix);
    }
}