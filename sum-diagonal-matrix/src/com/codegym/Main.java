package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("Enter element in row " + (row + 1) + " and column " + (col + 1) + " : \t");
                matrix[row][col] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    sum += matrix[row][col];
                }
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.print("Sum of element in diagonal matrix is: " + sum);
    }
}
