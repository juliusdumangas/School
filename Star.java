/*
 * @(#)Star.java        1.0 16/09/15
 */

import java.util.Scanner;

/*
 *      This program will prompt the user to enter the
 *      height of the letter x. Display the letter x
 *      with the required height.
 *      
 * @version 1.0 16 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class Star {
    public static void main(String[] args){
        int height;
        Scanner s = new Scanner(System.in);

        while (true){
            System.out.print("\nEnter height from 3 to 15: ");
            height = s.nextInt();
            if (height < 3 || height > 15 || (height % 2 == 0)){
                System.out.print("\nERROR: Must be an odd number and from 3 to 15.");
            }else{
                break;
            }
        }
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= height; j++){
                if (i % 2 == 0){
                    
                }
            }
            System.out.println();
        }
    }
}