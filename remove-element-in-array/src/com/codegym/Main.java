package com.codegym;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 5, 8, 20, 98, 12, 100};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter element: ");
        int number = scanner.nextInt();
        System.out.print("New array: ");
        int[] result = removeElement(array1, number);
        System.out.println(Arrays.toString(result));
    }

    public static int[] removeElement(int[] array, int number) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
            }
        }
        for (int j = index; j < array.length - 1; j++) {
            array[j] = array[j + 1];
        }
        int[] array2 = new int[array.length - 1];
        for (int k = 0; k < array2.length; k++) {
            array2[k] = array[k];
        }
        return array2;
    }
}
