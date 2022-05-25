package com.lelik.algorithmization.oneDimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InAndOutArray {
    public static void fillingIntWithConsole(int[] arr) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input element number" + i);
            arr[i] = Integer.parseInt(reader.readLine());
        }

    }

    public static void fillingDoubleWithConsole(double[] arr) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input element number" + i);
            arr[i] = Double.parseDouble(reader.readLine());
        }

    }

    public static void outArray(double[] arr) {
        for (double v : arr) {
            System.out.println(v);
        }
    }
    public static void outArray(int[] arr) {
        for (double v : arr) {
            System.out.println(v);
        }
    }
}
