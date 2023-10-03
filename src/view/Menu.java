/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {
    
    private static final Scanner in = new Scanner(System.in);

    public static int menu() {
        System.out.println("1. Input Element");
        System.out.println("2. Sort Ascending");
        System.out.println("3. Sort Desceding");
        System.out.println("4. Exit.");
        System.out.print("Enter your choice: ");
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                if (result < 1 || result > 4) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input integer 1 to 4.");
                System.out.print("Enter again: ");
            }
        }
    }
    
}
