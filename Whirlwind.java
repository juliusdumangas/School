/*
 * @(#)Whirlwind.java        1.0 15/09/15
 */

import java.util.Scanner;

/*
 *      This program will prompt the user to enter
 *      how many repbers to input. Accept the
 *      repbers and display the sum of the repbers.
 *      
 * @version 1.0 15 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Whirlwind {
    public static void main(String[] args){
        int rep;
        int input;
        int sum = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("\nHow many repbers: ");
        rep = s.nextInt();
        System.out.println("\nEnter repbers.");

        while (rep != 0){
            input = s.nextInt();
            sum += input;
            rep--;
        }
        System.out.printf("\n-----\n");
        System.out.println(sum);
    }
}