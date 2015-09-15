/*
 * @(#)Cyclone4.java        1.0 12/09/15
 */

import java.util.Scanner;

/*
 *      This program will accept a series of numbers and will
 *      exit only if the user enters 0 then display how many
 *      numbers were entered before the user enters 0.
 *      Display also how many are positive even, positive odd,
 *      negative even, and negative odd.
 *      
 * @version 1.0 12 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Cyclone4 {
    public static void main(String[] args){
        int input = 0;
        int count = 0;
        int negEven = 0;
        int posEven = 0;
        int negOdd = 0;
        int posOdd = 0;
        String sign = "";
        Scanner s = new Scanner(System.in);

        System.out.println("Enter any number to continue. " +
                            "Enter 0 to stop.");
        while (true){
            input = s.nextInt();
            if (input == 0){
                break;
            }
            if ((input % 2) == 0){
                if (input < 0){
                    sign = "negative even";
                    negEven++;
                }else{
                    sign = "positive even";
                    posEven++;
                }
            }else{
                if (input < 0){
                    sign = "negative odd";
                    negOdd++;
                }else{
                    sign = "positive odd";
                    posOdd++;
                }
            }
            count++;       
        }

        if (count > 1){
            System.out.printf("\n\nYou entered %d numbers.\n", count);
            System.out.printf("%d negative even\n%d positive even\n" +
                "%d negative odd\n%d positive odd\n", negEven, posEven, negOdd, posOdd);
        }
        else if (count == 1){
                System.out.printf("\nYou entered a %s number.\n", sign);
        }else{
            System.out.println("\nYou didn't enter any number!");
        }
    }
}