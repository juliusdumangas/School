/*
 * @(#)Password2.java        1.0 12/09/15
 */

import java.util.Scanner;

/*
 *      This program will give the user 3 tries to
 *      enter the password "souPexeMce". It wil
 *      display "GOODBYE" if the user is not
 *      successful, otherwise display "WELCOME".
 *      
 * @version 1.0 12 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Password2 {
    public static void main(String[] args){
        String input = ""; //input password
        String password = "souPexeMce";
        int cnt = 3;
        Scanner s = new Scanner(System.in);

        while (cnt != 0){
            System.out.print("PASSWORD: ");
            input = s.nextLine();

            if (input.compareTo(password) == 0){
                System.out.println("\nWELCOME");
                break;
            }
            cnt--;
        }

        if (cnt == 0){
            System.out.println("\nGOODBYE");
        }
    }
}