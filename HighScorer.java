/*
 * @(#)HighScorer.java        1.0 19/09/15
 */

import java.util.Scanner;

/*
 *      This program will accept the name and score of
 *      5 students, display the name of the student
 *      with the highest score assuming that the 
 *      scores are unique.
 *      
 * @version 1.0 16 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class HighScorer {
    public static void main(String[] args){
        String name = "";
        int score = 0;
        int ls = 0; //last score
        String hs = ""; //high scorer
        Scanner s = new Scanner(System.in);

        for (int i = 5; i >= 1; i--){
            System.out.print("\nEnter name: ");
            name = s.nextLine();
            System.out.print("Enter score: ");
            score = s.nextInt();

            if (score > ls){
                hs = name;
                ls = score;
            }
            name = s.nextLine();
        }
        System.out.printf("\nCongratulations %s", hs);
    }
}