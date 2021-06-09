package com.codegym;

public class Main {

    public static void main(String[] args) {
	    int[] arr1 = {1, 2, 5};
	    int[] arr2 = {8, 4, 3};
	    int[] arr3 = new int[arr1.length + arr2.length];
	    for (int i = 0; i < arr1.length; i++) {
	        arr3[i] = arr1[i];
        }
	    for (int j = 0; j < arr2.length; j++) {
	        arr3[j + arr2.length] = arr2[j];
        }
	    for (int k: arr3)
            System.out.print(k + "\t");
    }
}
