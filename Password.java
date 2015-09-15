/*
 * @(#)Password.java        1.0 11/09/15
 */

import java.util.Scanner;

/*
 *      This program will ask for a password
 *      but will only terminate when the user
 *      enters the password "souPexeMce".
 *      
 * @version 1.0 11 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Password {
    public static void main(String[] args){
        String input = ""; //input password
        String password = "souPexeMce"; 
        Scanner s = new Scanner(System.in);

        while (input.compareTo(password) != 0 ){
            System.out.print("PASSWORD: ");
            input = s.nextLine();
        }
        System.out.println("\nBYE.");
    }
}