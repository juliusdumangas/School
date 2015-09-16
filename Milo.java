/*
 * @(#)Milo.java        1.0 16/09/15
 */

import java.util.Scanner;

/*
 *      This program will prompt the user to enter
 *      two numbers, then display the whole numbers
 *      from the first number to the second number.
 *      
 * @version 1.0 16 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Milo {
    public static void main (String[] args){
        int first = 0;
        int last = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter two numbers: ");
        for (int i = 1; i <= 2; i++){
            if (i == 1){
                first = s.nextInt();
            }else{
                last = s.nextInt();
            }
        }
        if (last > first){
            for (int j = first; j <= last; j++){
                System.out.printf("%d ", j);
            }
        }else{
            for (int j = first; j >= last; j--){
                System.out.printf("%d ", j);
            }
        }
        System.out.println();
    }
}