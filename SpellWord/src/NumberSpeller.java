import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import languages.NumberSpellerLang;

public class NumberSpeller {
    private final List<NumberSpellerLang> languages = new ArrayList<>();

    public void addLanguage(NumberSpellerLang lang) {
        languages.add(lang);
    }

    public List<NumberSpellerLang> getLanguages() {
        return languages;
    }

    public void convertNumberToWords(String input, NumberSpellerLang lang) {
        StringBuilder result = new StringBuilder();

        // Divide input into segments
        int inputLength = input.length();
        int inputRemainder = inputLength % 3;
        int inputSegments = inputLength / 3;

        // Handle remainder segment if present
        if (inputRemainder != 0) {
            String numSeg = input.substring(0, inputRemainder);
            printRes(numSeg, inputSegments, inputSegments, lang, result);
            if (inputLength > 3) {
                result.append(" ");
            }
        }

        // Handle segments
        if (inputSegments > 0) {
            for (int i = 0; i < inputSegments; i++) {
                int startIndex = inputRemainder + (3 * i);
                int endIndex = startIndex + 3;
                String numSeg = input.substring(startIndex, endIndex);
                printRes(numSeg, inputSegments - i - 1, inputSegments, lang, result);
                if (i != (inputSegments - 1)) {
                    result.append(" ");
                }
            }
        }

        // Replace specific conversions
        String finalResult = replaceSpecificConversions(result.toString().trim(), lang.getSpecificConversions());
        System.out.print(finalResult);
    }

    private void printRes(String numSeg, int place, int inputSegments, NumberSpellerLang lang, StringBuilder result) {
        int num = Integer.parseInt(numSeg);

        if (num == 0 && place < inputSegments) {
            return;
        }

        boolean moreFlag = false;
        if (num > 99) {
            result.append(lang.getSmall()[num / 100]).append(" ").append(lang.getExt()[1]);
            if (num % 100 != 0) {
                result.append(" ").append(lang.getExt()[0]).append(" ");
            }
            moreFlag = true;
        }
        num = num % 100;

        if (num == 0 && place < inputSegments) {
            return;
        }

        if (num == 0 && !moreFlag) {
            result.append(lang.getSmall()[0]);
        } else if (num < 20) {
            result.append(lang.getSmall()[num]);
        } else {
            boolean tenFirst = "TenFirst".equals(lang.getExt()[2]);
            if (!tenFirst && num % 10 != 0) {
                result.append(lang.getSmall()[num % 10]).append(lang.getExt()[0]).append(lang.getTens()[num / 10]);
            } else {
                if (num % 10 == 0 && num != 0) {
                    result.append(lang.getTens()[num / 10]);
                } else if (num != 0) {
                    result.append(lang.getTens()[num / 10]).append("-").append(lang.getSmall()[num % 10]);
                }
            }
        }

        if (place != 0) {
            result.append(" ").append(lang.getScale()[place]);
        }
    }

    private String replaceSpecificConversions(String result, Map<String, String> specificConversions) {
        for (Map.Entry<String, String> entry : specificConversions.entrySet()) {
            result = result.replace(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
