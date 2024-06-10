import java.util.Scanner;
import languages.English;
import languages.German;
import languages.Indonesian;
import languages.Dutch;
import languages.NumberSpellerLang;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();
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
}
