/*
 * @(#)Cyclone2.java        1.0 12/09/15
 */

import java.util.Scanner;

/*
 *      This program will accept a series of numbers and will
 *      exit only if the user enters 0 then display how many
 *      numbers were entered before the user enters 0.
 *      Display also how many are positive and negative
 *      
 * @version 1.0 12 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Cyclone2 {
    public static void main(String[] args){
        int input = 0;
        int count = 0;
        int pos = 0;
        int neg = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter any number to continue. " +
                            "Enter 0 to stop.");
        while (true){
            input = s.nextInt();
            if (input == 0){
                break;
            }
            if (input > 0){
                pos++;
            }else{
                neg++;
            }
            count++;       
        }

        if (count > 1){
            System.out.printf("\n\nYou entered %d numbers.\n", count);
            System.out.printf("%d positive\n%d negative\n", pos, neg);
        }
        else if (count == 1){
            if (neg == 1){
                System.out.println("\nYou entered a negative number.");
            }else{
                System.out.println("\nYou entered a positive number.");
            }
        }else{
            System.out.println("\nYou didn't enter any number!");
        }
    }
}