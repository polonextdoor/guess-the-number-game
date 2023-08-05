/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumberguessgame;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author lv
 */
public class RandomNumberGuessGame 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Variables
     int randomNumber;                  // Holds the randomly generated number
     String userInput;                  // Holds the users input
     int userGuess;                     // Holds the users guess
     boolean userGuessCorrect = false;  // States if the user guessed correctly 
     int numberOfGuesses = 0;           // Holds the amount of guesses made
        
        // Create random object
     Random randomNumbers = new Random();
     
        // Assign random integer to variable with parameters of 1-100
     randomNumber = randomNumbers.nextInt(100) + 1;
     
        // A while loop to have it keep asking for guesses until user is correct
        while (!userGuessCorrect)
        {
         numberOfGuesses = numberOfGuesses + 1; 
         userInput = JOptionPane.showInputDialog("Guess the number that is "
                 + "between 1 and 100.");
         userGuess = Integer.parseInt(userInput);
         
        // If Statement for when guess is either too high, too low, or correct
        if (userGuess > randomNumber)
        {
           JOptionPane.showMessageDialog(null, "Too high, try again.");
        }
        else if (userGuess < randomNumber)
        {
           JOptionPane.showMessageDialog(null, "Too low, try again.");   
        }
        else
        {
         JOptionPane.showMessageDialog(null, "Congrats!\n"
                 + "You guessed correct.\n"
                 + "It took you " + numberOfGuesses + " tries.");
         userGuessCorrect = true;
        }
        }
    System.exit(0);
    }
}
