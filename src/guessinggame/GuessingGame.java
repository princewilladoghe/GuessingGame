package guessinggame;
// a game that allows the user to randomly guess a number that ahs been generated
import javax.swing.*;
public class GuessingGame {
    private static void determineGuess(boolean b) {
        int computerNumber = (int) (Math.random() * 100 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be" + computerNumber);
        int count = 1;
        while (userAnswer != computerNumber) {
            String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100",
                    "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null,
                    "" + determineGuess(userAnswer, computerNumber, count));
            count++;

            determineGuess(true);
        }

    }
    private static String determineGuess(int userAnswer, int computerNumber, int count) {
        if (userAnswer <= 0 || userAnswer > 100) {
            return "your guess is invalid";


        } else if (userAnswer == computerNumber) {
            return "Correct!\nTotal guesses:" + count;

        } else if (userAnswer > computerNumber) {

            return "your guess is too high, try again.\nTry Number:" + count;


        } else if (userAnswer < computerNumber) {
            return "your number is too low,try again.\nTry Number:" + count;


        } else {
            return "your guess is incorrect\ntry Number:" + count;
        }


    }

    public static void main(String[] args) {
        determineGuess(true);


    }
}