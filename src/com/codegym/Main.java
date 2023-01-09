package com.codegym;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int min = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[min]);
    }

    public static int minValue(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }
}