/*
 * @(#)NameGame4.java        1.0 16/09/15
 */

import java.util.Scanner;

/*
 *      This program will accept the name of
 *      a person. Display the name of the person
 *      repeating it according to the number
 *      of character in his/her name.
 *      
 * @version 1.0 16 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class NameGame4 {
    public static void main(String[] args){
        String name = "";
        int n; //length of name
        Scanner s = new Scanner(System.in);

        System.out.print("\nWhat is your name: ");
        name = s.nextLine();
        n = name.length();

        for (int i = n; i > 0; i--){
            System.out.println(name);
        }
    }
}