/*
 * @(#)Alaska.java        1.0 16/09/15
 */

import java.util.Scanner;

/*
 *      Given sequence:
 *      1 3 6 8 11 13 16 18 21 23 26 28 31 33 36 38...
 *
 *      This program will prompt the user to enter
 *      how many numbers will be displayed from the
 *      sequence. Display the sequence with the
 *      required number of elements.
 *      
 * @version 1.0 16 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Alaska {
    public static void main(String[] args){
        int input;
        int n = 1; //numbers to display
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter how many numbers to display: ");
        input = s.nextInt();
        System.out.printf("%d ", n);

        for (int i = 1; i < input; i++){
            if (i % 2 == 0){
                n += 3;
                System.out.printf("%d ", n);
            }else{
                n += 2;
                System.out.printf("%d ", n);
            }
        }
        System.out.println();
    }
}