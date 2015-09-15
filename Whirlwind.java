/*
 * @(#)Whirlwind.java        1.0 15/09/15
 */

import java.util.Scanner;

/*
 *      This program will prompt the user to enter
 *      how many numbers to input. Accept the
 *      numbers and display the sum of the numbers.
 *      
 * @version 1.0 15 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Whirlwind {
    public static void main(String[] args){
        int num;
        int input;
        int sum = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("\nHow many numbers: ");
        num = s.nextInt();
        System.out.println("\nEnter numbers.");

        while (num != 0){
            input = s.nextInt();
            sum += input;
            num--;
        }
        System.out.printf("\n-----\n");
        System.out.println(sum);
    }
}