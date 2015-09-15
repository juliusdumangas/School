/*
 * @(#)NameGame2.java        1.0 11/09/15
 */

import java.util.Scanner;

/*
 *      This program will ask for the user's name.
 *      Then displays a triangle using the characters
 *      in the user's name.
 *      
 * @version 1.0 11 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class NameGame2 {
    public static void main(String[] args){
        String name = ""; //user's name
        int n; // length of name
        Scanner s = new Scanner(System.in);

        System.out.print("\nWhat is your name: ");
        name = s.nextLine();
        n = name.length();

        for (int i = 1; i <= n; i++ ){
            for (int k = i; k < n ; k++ ){
                System.out.print(" ");
            }            
            for (int j = i; j > 0; j-- ){
                System.out.print(name.charAt(n-j));
            }
            System.out.println();
        }
    }
}