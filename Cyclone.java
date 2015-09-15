/*
 * @(#)Cyclone.java        1.0 12/09/15
 */

import java.util.Scanner;

/*
 *      This program will accept a series of numbers and will
 *      exit only if the user enters 0 then display how many
 *      numbers were entered before the user enters 0. 
 *      
 * @version 1.0 12 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Cyclone {
    public static void main(String[] args){
        int input = 0;
        int count = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter any number to continue. " +
                            "Enter 0 to stop.");
        while (true){
            input = s.nextInt();
            if (input == 0){
                break;
            }
            count++;       
        }

        if (count > 1){
            System.out.printf("\n\nYou entered %d numbers.\n", count);
        }
        else if (count == 1){
            System.out.println("\nYou entered a number.");
        }else{
            System.out.println("\nYou didn't enter any number!");
        }
    }
}