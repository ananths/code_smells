package refactored.longMethod;

import java.util.Scanner;

public class HangmanApp {
    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        // Can guess only 7 times
        while(!hangman.hasReachedMaximumGuesses()) {
            System.out.println("Number of chances left: "+ (7-hangman.numberOfGuesses()));
            // Show the current guess secret
            String s = hangman.wordWithGuesses();
            System.out.println("Secret: " + s);
            System.out.print("Guess Letter: ");
            Scanner in = new Scanner(System.in);
            char input = in.nextLine().charAt(0);
            if(hangman.isAlreadyGuessed(input)) {
                System.out.println("Your have already guessed "+ input);
                continue;
            }
            if (hangman.guess(input))
            {
                System.out.println("Success, you have found letter " + input);
                System.out.println("Letters found: " + hangman.numberOfCharactersFound());
            }
            if (hangman.isWordGuessed())
            {
                System.out.println("You won!");
                return;
            }
        }
    }
}
