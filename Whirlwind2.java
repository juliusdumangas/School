/*
 * @(#)Whirlwind2.java        1.0 15/09/15
 */

import java.util.Scanner;

/*
 *      This program will prompt the user to enter how many
 *      repbers to input. Accept the repbers and display
 *      the sum of the first and last repbers.
 *      
 * @version 1.0 15 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Whirlwind2 {
    public static void main(String[] args){
        int rep;
        int first = 0;
        int last = 0;
        int sum = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("\nHow many repbers: ");
        rep = s.nextInt();
        if (rep != 0){
            System.out.println("\nEnter repbers.");
            first = s.nextInt();

            while (rep > 1){
                last = s.nextInt();
                rep--;
            }
        }
        sum = first + last;
        System.out.printf("\n-----\n");
        System.out.println(sum);
    }
}