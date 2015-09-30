/*
 * @(#)Cherifer.java        1.0 16/09/15
 */

import java.util.Scanner;

/*
 *      This program will prompt the user to enter how many
 *      numbers will be process. Ask the user to enter the
 *      the numbers and display "Growing Up." if the numbers
 *      are inputted in ascending order, otherwise display
 *      "Not Growing Up."
 *      
 * @version 1.0 16 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Cherifer {
    public static void main(String[] args){
        int rep;
        int input;
        int last = 0    ;
        boolean not = false;
        Scanner s = new Scanner(System.in);

        while (true){
            System.out.print("\nHow many numbers to process: ");
            rep = s.nextInt();
            if (rep <= 1){
                System.out.print("\nERROR: Enter a number greater than 1.");
            }else{
                break;
            }
        }
        System.out.printf("\nPlease enter %d numbers: ", rep);
        
        for (int i = 1; i <= rep; i++){
            input = s.nextInt();

            if (last > input){
                not = true;
            }
            last = input;
        }
        if (not){
            System.out.print("Not ");
        }
        System.out.print("Growing Up.");
    }
}