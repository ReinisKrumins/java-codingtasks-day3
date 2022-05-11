package service;

import java.util.Arrays;

public class SecondTask {

    public static void main(String[] args) {

        int[] arr = {23, 24, 66, 10};
        int newArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }

        System.out.print("First array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        System.out.print("Copied array: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

    }
}
