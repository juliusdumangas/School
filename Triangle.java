/*
 * @(#)Triangle.java        1.0 26/09/15
 */

import java.util.Scanner;

/*
 *      This program will accept the height
 *      of an isosceles triangle. Display
 *      the triangle using "*".
 *      
 * @version 1.0 26 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Triangle {
    public static void main(String[] args){
        int height;
        Scanner s = new Scanner(System.in);

        System.out.print("What is the height: ");
        height = s.nextInt();

        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = height-1; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}