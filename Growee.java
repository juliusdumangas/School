/*
 * @(#)Growee.java        1.0 16/09/15
 */

import java.util.Scanner;

/*
 *      This program will prompt the user to enter how many
 *      numbers will be process. Ask the user to enter the
 *      the numbers and afterwards display the number with
 *      the highest value.
 *      
 * @version 1.0 16 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Growee {
    public static void main(String[] args){
        int rep;
        int input;
        int max = 0;
        Scanner s = new Scanner(System.in);

        while (true){
            System.out.print("\nHow many numbers to process: ");
            rep = s.nextInt();
            if (rep <= 0){
                System.out.print("\nERROR: Enter a positive number.");
            }else{
                break;
            }
        }
        System.out.printf("\nPlease enter %d number(s): ", rep);
        
        for (int i = 1; i <= rep; i++){
            input = s.nextInt();
            max = Math.max(max, input);
        }
        System.out.println(max);
    }
}