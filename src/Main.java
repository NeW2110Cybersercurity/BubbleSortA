
import controller.Manager;
import java.util.Scanner;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
    
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = new int[0];
        //loop until user want to exit
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    a = Manager.inputValueOfArray();
                    break;
                case 2:
                    Manager.sortArrayAscending(a);
                    break;
                case 3:
                    Manager.sortArrayDescending(a);
                    break;
                case 4:
                    return;
            }
        }
    }
}
