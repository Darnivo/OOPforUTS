import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Hangman {
    final String WORDLIST_FILENAME = "words.txt";

    public Hangman() {
        ArrayList<String> wordList = loadWords();
        String secretWord = chooseWord(wordList).toLowerCase();
        startGame(secretWord);
    }

    /**
     * Returns a list of valid words. Words are strings of lowercase letters.
     * Depending on the size of the word list, this function may
     * take a while to finish.
     */
    ArrayList<String> loadWords() {
        ArrayList<String> wordList = new ArrayList<>(55909);
        System.out.println("Loading word list from file...");
        try {
            Scanner input = new Scanner(new File(WORDLIST_FILENAME));
            while (input.hasNext()) {
                wordList.add(input.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        System.out.println(wordList.size() + " words loaded.");

        return wordList;
    }

    /**
     * wordlist (list): list of words (strings)
     * Returns a word from wordlist at random
     */
    String chooseWord(ArrayList<String> wordList) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(wordList.size());
        return wordList.get(randomIndex);
    }

    /**
     * secretWord: string, the word the user is guessing
     * lettersGuessed: list, what letters have been guessed so far
     * returns: boolean, True if all the letters of secretWord are in lettersGuessed;
     * False otherwise
     */
    boolean isWordGuessed(String secretWord, ArrayList<Character> lettersGuessed) {
        for (char c : secretWord.toCharArray()) {
            if (!lettersGuessed.contains(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * secretWord: string, the word the user is guessing
     * lettersGuessed: list, what letters have been guessed so far
     * returns: string, comprised of letters and underscores that represents
     * what letters in secretWord have been guessed so far.
     */
    String getGuessedWord(String secretWord, ArrayList<Character> lettersGuessed) {
        StringBuilder guessedWord = new StringBuilder();
        for (char c : secretWord.toCharArray()) {
            if (lettersGuessed.contains(c)) {
                guessedWord.append(c);
            } else {
                guessedWord.append("_");
            }
        }
        return guessedWord.toString();
    }

    /**
     * lettersGuessed: list, what letters have been guessed so far
     * returns: string, comprised of letters that represents what letters have not
     * yet been guessed.
     */
    String getAvailableLetters(ArrayList<Character> lettersGuessed) {
        StringBuilder availableLetters = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!lettersGuessed.contains(c)) {
                availableLetters.append(c);
            }
        }
        return availableLetters.toString();
    }

    /**
     * secretWord: string, the secret word to guess.
     *
     * Starts up an interactive game of Hangman.
     *
     * At the start of the game, let the user know how many
     * letters the secretWord contains.
     *
     * Ask the user to supply one guess (i.e. letter) per round.
     *
     * The user should receive feedback immediately after each guess
     * about whether their guess appears in the computers word.
     *
     * After each round, you should also display to the user the
     * partially guessed word so far, as well as letters that the
     * user has not yet guessed.
     *
     * Follows the other limitations detailed in the problem write-up.
     */
    void startGame(String secretWord) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> lettersGuessed = new ArrayList<>();
        int guessesLeft = 8;

        System.out.println("Welcome to the game, Hangman!");
        System.out.println("I am thinking of a word that is " + secretWord.length() + " letters long.");
        System.out.println(getGuessedWord(secretWord, lettersGuessed));

        while (guessesLeft > 0 && !isWordGuessed(secretWord, lettersGuessed)) {
            System.out.println("\nYou have " + guessesLeft + " guesses left.");
            System.out.println("Available letters: " + getAvailableLetters(lettersGuessed));
            System.out.print("Please guess a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            if (lettersGuessed.contains(guess)) {
                System.out.println("Oops! You've already guessed that letter: " + getGuessedWord(secretWord, lettersGuessed));
            } else {
                lettersGuessed.add(guess);
                if (secretWord.contains(String.valueOf(guess))) {
                    System.out.println("Good guess: " + getGuessedWord(secretWord, lettersGuessed));
                } else {
                    System.out.println("Oops! That letter is not in my word: " + getGuessedWord(secretWord, lettersGuessed));
                    guessesLeft--;
                }
            }
        }

        if (isWordGuessed(secretWord, lettersGuessed)) {
            System.out.println("\nCongratulations, you won!");
        } else {
            System.out.println("\nSorry, you ran out of guesses. The word was " + secretWord + ".");
        }
    }

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
    }
}
