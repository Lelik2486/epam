package com.lelik.algorithmization.matrix;

/*В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
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
        System.out.println("Input index columns");
        int index = Integer.parseInt(reader.readLine());
        System.out.println("Input index columns 2 ");
        int index2 = Integer.parseInt(reader.readLine());
        int [] temp = new int[m];
        for (int i = 0; i < m; i++) {
            temp[i] = matrix [i][index];
        }
        for (int i = 0; i < m; i++) {
            matrix [i][index]=matrix [i][index2];
        }
        for (int i = 0; i < m; i++) {
            matrix [i][index2] = temp[i];
        }
        InAndOut.outMatrix(matrix);
    }
}
