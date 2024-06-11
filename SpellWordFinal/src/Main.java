import java.util.Scanner;
import languages.English;
import languages.German;
import languages.Indonesian;
import languages.Dutch;
import languages.NumberSpellerLang;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter a number: ");
            input = scanner.nextLine();

            // Input validation
            if (isValidInput(input)) {
                break;  // Exit the loop if input is valid
            } else {
                System.out.println("Invalid input. Please enter a positive number, length between 1-66.");
            }
        }

        scanner.close();

        NumberSpeller converter = new NumberSpeller();

        converter.addLanguage(new English());
        converter.addLanguage(new German());
        converter.addLanguage(new Indonesian());
        converter.addLanguage(new Dutch());

        for (NumberSpellerLang lang : converter.getLanguages()) {
            System.out.print(lang.getClass().getSimpleName() + ": ");
            converter.convertNumberToWords(input, lang);
            System.out.println();
        }
    }

    // Input validation method
    private static boolean isValidInput(String input) {
        // Check if input is not null and not empty
        if (input == null || input.isEmpty()) {
            return false;
        }
        
     // Check if input is not null and not empty
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Check if input contains only digits
        if (!input.matches("\\d+")) {
            return false;
        }

        // Check if input length is between 1 and 66 digits
        int length = input.length();
        if (length < 1 || length > 66) {
            return false;
        }
        
        // Check if input contains a negative sign at the beginning
        if (input.startsWith("-")) {
            return false;
        }

        return true;
    }
}
