package com.lelik.algorithmization.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number rows");
        int n = Integer.parseInt(reader.readLine());
        int[][] matrix = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]= (int) Math.sin((Math.pow(i,2)-Math.pow(i,2))/n);
                if (matrix[i][j]>0)count++;
            }
        }
        InAndOut.outMatrix(matrix);
        System.out.println(count);
    }
}
