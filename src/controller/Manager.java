/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Validation;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Manager {
    private static final Scanner in = new Scanner(System.in);

    //allow user input number of array
    public static int inputSizeOfArray() {
        System.out.println("Input Length Of Arrays");
        System.out.print("Enter number: ");
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number greater than zero.");
                System.out.print("Enter again: ");
            }
        }
    }

    //allow user input value of array
    public static int[] inputValueOfArray() {
        int n = inputSizeOfArray();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + i + ": ");
            a[i] = Validation.checkInputInt();
        }
        return a;
    }

    //sort array ascending by bubble sort
    public static void sortArrayAscending(int[] a) {
        int len = a.length;
        if (len == 0) {
            System.err.println("List empty.");
        }
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[minIndex];
                a[minIndex] = a[i];
                a[i] = temp;
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print("[" + a[i] + "]");
                break;
            }
            System.out.print("[" + a[i] + "]->");
        }
        System.out.println();
    }

    //sort array ascending by bubble sort
    public static void sortArrayDescending(int[] a) {
        int len = a.length;
        if (len == 0) {
            System.err.println("List empty.");
        }
        for (int i = 0; i < len - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (a[j] > a[maxIndex]) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = a[maxIndex];
                a[maxIndex] = a[i];
                a[i] = temp;
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print("[" + a[i] + "]");
                break;
            }
            System.out.print("[" + a[i] + "]<-");
        }
        System.out.println();
    }

}
