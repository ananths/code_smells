package refactored.longMethod;

public class Hangman {
    String secret = "banana";
    String guessCharacters = "";
    private final int MAX_NUMBER_OF_GUESSES = 7;

    public boolean guess(char ch) {
        int n = numberOfCharactersFound();
        guessCharacters = guessCharacters + ch;
        int m = numberOfCharactersFound();
        return m > n;
    }

    public boolean hasReachedMaximumGuesses() {
        return guessCharacters.length() >= 7;
    }

    public boolean isWordGuessed() {
        return numberOfCharactersFound() == secret.length();
    }

    public String wordWithGuesses() {
        String s = "";
        for (int j = 0; j < secret.length(); j++) {
            char ch = secret.charAt(j);
            if (guessCharacters.indexOf(ch) < 0) { // has the character been guessed
                ch = '-'; // if not, hide it with a dash
            }
            s = s + ch;
        }
        return s;
    }

    public boolean isAlreadyGuessed(char ch) {
        return guessCharacters.indexOf(ch) >= 0;
    }

    public int numberOfCharactersFound() {
        int n = 0;
        for (int i = 0; i < secret.length(); i++) {
            char ch = secret.charAt(i);
            if (guessCharacters.indexOf(ch) >= 0)
                n++;
        }
        return n;
    }

    public int numberOfGuesses() {
        return guessCharacters.length();
    }

}
