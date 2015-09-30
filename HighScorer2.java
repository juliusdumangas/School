/*
 * @(#)HighScorer2.java        1.0 30/09/15
 */

import java.util.Scanner;

/*
 *      This program will accept the name and score of
 *      5 students, display the name of the student
 *      with the highest score.
 *      
 * @version 1.0 30 Sep 2015  
 * @author Julius Adriell Dumangas
 * 
 */

public class HighScorer2 {
    public static void main(String[] args){
        String name = "";
        int a = 0; //array counter
        int score = 0;
        int ls = 0; //last score
        String[] hs = new String[5]; //high scorer(s)
        Scanner s = new Scanner(System.in);

        for (int i = 5; i >= 1; i--){
            System.out.print("\nEnter name: ");
            name = s.nextLine();
            System.out.print("Enter score: ");
            score = s.nextInt();

            if (score > ls){
                hs[a] = name;
                ls = score;
            }else if (score == ls){
                a++;
                hs[a] = name;
            }
            name = s.nextLine();
        }
        for (int j = 0; j <= a; j++){
            System.out.printf("\nCongratulations %s", hs[j]);
        }
    }
}