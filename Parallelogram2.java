/*
 * @(#)Parallelogram2.java        1.0 11/09/15
 */

import java.util.Scanner;

/*
 *      This program will ask for the height and width
 *      of a rectangle and it will the display the
 *      rectangle using "*" and "+".
 *      
 * @version 1.0 11 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Parallelogram2 {
    public static void main(String[] args) {
        int w; //width
        int h; //height
        Scanner s = new Scanner(System.in);

        System.out.print("\nEnter width: ");
        w = s.nextInt();

        System.out.print("Enter height: ");
        h = s.nextInt();

        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                if (i % 2 == 0){
                    System.out.print("+");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
