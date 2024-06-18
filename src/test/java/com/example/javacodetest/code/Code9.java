package com.example.javacodetest.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code9 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);

        int[][] a = new int[N][M];
        int[][] b = new int[N][M];
        int[][] x = new int[N][M];

        for (int i = 0; i < a.length; i++) {
            String[] arrA = br.readLine().split(" ");
            for (int j = 0; j < a.length; j++) {
                a[i][j] = Integer.parseInt(arrA[j]);
            }
        }

        for (int i = 0; i < b.length; i++) {
            String[] arrB = br.readLine().split(" ");
            for (int j = 0; j < b.length; j++) {
                b[i][j] = Integer.parseInt(arrB[j]);
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                x[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
