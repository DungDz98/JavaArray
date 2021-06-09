package com.codegym;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {5, 7, 8, 12, 98, 100};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        int[] result = addElementArray(array1, index, number);
        System.out.println(Arrays.toString(result));
    }

    public static int[] addElementArray(int[] array, int index, int number) {
        int[] array2 = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        for (int j = array2.length - 1; j >= index; j--) {
            array2[j] = array2[j - 1];
        }
        array2[index] = number;
        return array2;
    }
}
