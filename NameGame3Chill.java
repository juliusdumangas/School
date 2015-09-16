/*
 * @(#)NameGame3Chill.java        1.0 16/09/15
 */

import java.util.Scanner;

/*
 *      This program will accept the name of a person.
 *      Display the name of the person with first character
 *      once, the second character twice, the third
 *      character thrice, and so on.
 *      
 * @version 1.0 16 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class NameGame3Chill {
    public static void main(String[] args){
        String name = "";
        int n; //length of name
        Scanner s = new Scanner(System.in);

        System.out.print("\nWhat is your name: ");
        name = s.nextLine();
        n = name.length();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(name.charAt(i-1));
            }
        }
        System.out.println();
    }
}