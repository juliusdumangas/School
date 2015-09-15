/*
 * @(#)NameGame3.java        1.0 11/09/15
 */

import java.util.Scanner;

/*
 *      This program will accept 5 names from user
 *      and prints the longest name.
 *      
 * @version 1.0 11 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class NameGame3 {
    public static void main(String[] args){
        String name = "";
        int n; // length of name
        String longName = ""; //longest name
        Scanner s = new Scanner(System.in);

        System.out.println("\nEnter 5 names:");

        for (int i = 5; i > 0; i--){
            System.out.print(">");
            name = s.nextLine();
            n = name.length();

            if (n > longName.length()){
                longName = name;
            }    
        }
        System.out.printf("\n\nThe longest name is %s\n", longName);
    }
}