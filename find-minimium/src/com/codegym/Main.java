package com.codegym;

public class Main {

    public static void main(String[] args) {
	    int[] arr1 = {4, 12, 7, 8, 1, 6, 9};
	    int index = minValue(arr1);
        System.out.println("The smallest element in the array is: " + arr1[index]);
    }
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
