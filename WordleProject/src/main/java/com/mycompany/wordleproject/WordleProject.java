/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.wordleproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sam13
 */
public class WordleProject {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //I had tried to read the list from a text file, but couldn't get the random part working properly. Kept the text file so you can know the wordbank easier.
        System.out.println("##    #  ####  ###  ####  #    ####\n # # #  #  #  # #  #   # #    ###\n # #   ####  #  # ####  #### ####");
        System.out.println("Welcome to not-Wordle! Correct terms are 5 letter & computer/tech related.\nInstructions: _ means incorrect, * means it's there but in the wrong spot. \n            You have six guesses, good luck!");       
        String[] wordsList = {"bytes","macro","mouse","linux","drive","intel","apple","email","virus","files", "board", "basic", "radio", "coder", "cache", "cloud", "debug", "modem", "shell", "array", "pixel"};
        int[] guessScores = {15,10,8,7,6,5};
        String guess =("");
        boolean gameInPlay = true;
        boolean correct = false;
        int guessCount = 0;
        int userScore = 0;  
        
        while (gameInPlay = true) {
            //Selects a random word for each new game
            int wordIndex = new Random().nextInt(wordsList.length);
            String correctWord = wordsList[wordIndex].toUpperCase();
            
            while (!correct){                                
                System.out.println("Enter guess: ");
                guess = keyboard.next();
                guess = guess.toUpperCase();

                String[] wordDisplay = {"_", "_", "_", "_", "_",};
                //input validation
                if (guess.length() != 5 || !guess.matches("[a-zA-Z]+")) {
                    System.out.println("Please enter a 5 letter term");
                    guess = ("     ");
                }
                if (guess.length() == 5 && guess.matches("[a-zA-Z]+")) {
                    guessCount = guessCount + 1;
                    System.out.println("Guess #: " + guessCount);
                }    

                for (int i = 0; i < correctWord.length(); i++)
                {
                    String tempGuess = guess.substring(i, i+1);
                    //"Yellow Letter" code
                    while(correctWord.contains(tempGuess)){
                       if(!wordDisplay[i].equals("_"))
                         break;
                       wordDisplay[i] = "*";
                    }
                    //"Green Letter" code
                    if (correctWord.substring(i, i+1).equals(guess.substring(i, i+1))) {
                        wordDisplay[i] = correctWord.substring(i, i+1);
                    }
                    //"Grey letters" are handled by the default "_" in the wordDisplay array
                }
                //Prints out correct letters or *s in guessed word
                for(String wordCharacter: wordDisplay){
                    System.out.print(wordCharacter);     
                }
                System.out.println();
                //win condition & scoring
                if (guess.equals(correctWord)){
                   System.out.println("You won in " + guessCount + " guesses! +" + guessScores[guessCount-1] + " points!");
                   userScore += guessScores[guessCount-1];
                   System.out.println("Your score is: " + userScore);
                   correct = true;                   
                   break;
                }
                //loss condtion & scoring
                if (guessCount == 6){
                    System.out.println("You lost, try again! The correct word was " + correctWord + ". " + "-3 points.");
                    userScore -= 3;
                    System.out.println("Your score is: " + userScore);
                    gameInPlay = false;
                    break;
                }
            }
            System.out.println("If you'd like to play again, enter Y. Or N if not.");
            String input = keyboard.next();
            //Continue playing or not
            if (input.equalsIgnoreCase("Y")){                
                gameInPlay = true;
                correct = false;
                guessCount = 0;
            } else if(input.equalsIgnoreCase("N")){
                System.out.println("We're sad to see you go :(");
                break;       
            }
            else {
                System.out.println("Please enter Y or N");
            }
        }
    }
}

        