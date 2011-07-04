package smells.longMethod;

import java.util.Scanner;

public class Hangman {
    String secret = "banana";
    String guessCharacters = "";

    public static void main(String[] args) {
        new Hangman();
    }

    public Hangman() {
        // Can guess only 7 times
        for(int i=0; i<7;) {
            System.out.println("Number of chances left: "+ (7-i));
            // Show the current guess secret
            String s = "";
            for(int j=0;j<secret.length();j++)  {
                char ch = secret.charAt(j);
                if(guessCharacters.indexOf(ch) < 0) { // has the character been guessed
                    ch = '-'; // if not, hide it with a dash
                }
                s = s + ch;
            }
            System.out.println("Secret: " + s);
            System.out.print("Guess Letter: ");
            Scanner in = new Scanner(System.in);
            char input = in.nextLine().charAt(0);
            if(guessCharacters.indexOf(input) >= 0) {
                System.out.println("Your have already guessed "+ input);
                continue;
            }
            int n = numberOfCharactersFound();
            guessCharacters = guessCharacters + input;
            int m = numberOfCharactersFound();
            if (m > n)
            {
                System.out.println("Success, you have found letter " + input);
                System.out.println("Letters found: " + m);
                continue;
            }
            if (m == secret.length())
            {
                System.out.println("You won!");
                return;
            }

            i++;
        }


    }

    private int numberOfCharactersFound() {
        int n = 0;
        for (int i = 0; i < secret.length(); i++)
        {
            char ch = secret.charAt(i);
            if (guessCharacters.indexOf(ch) >= 0)
                n++;
        }
        return n;
    }

}
