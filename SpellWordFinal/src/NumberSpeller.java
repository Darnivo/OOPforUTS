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

    // Check for specific conversions for the entire input
    if (lang.getSpecificConversions().containsKey(input)) {
        result.append(lang.getSpecificConversions().get(input)).append(" ");
        System.out.print(result.toString().trim());
        return;
    }

    // Divide input into segments
    int inputLength = input.length();
    int inputRemainder = inputLength % 3;
    int inputSegments = inputLength / 3;

    // Handle remainder segment if present
    if (inputRemainder != 0) {
        String numSeg = input.substring(0, inputRemainder);
        StringBuilder partResult = new StringBuilder();
        if (lang.getSpecificConversions().containsKey(numSeg)) {
            partResult.append(lang.getSpecificConversions().get(numSeg)).append(" ");
        } else {
            printRes(Integer.parseInt(numSeg), inputSegments, inputSegments, lang, partResult);
        }
        result.append(partResult).append(" ");
    }

    // Handle segments
    if (inputSegments > 0) {
        for (int i = 0; i < inputSegments; i++) {
            int startIndex = inputRemainder + (3 * i);
            int endIndex = startIndex + 3;
            String numSeg = input.substring(startIndex, endIndex);
            StringBuilder partResult = new StringBuilder();
            if (lang.getSpecificConversions().containsKey(numSeg)) {
                partResult.append(lang.getSpecificConversions().get(numSeg)).append(" ");
            } else {
                printRes(Integer.parseInt(numSeg), inputSegments - i - 1, inputSegments, lang, partResult);
            }
            result.append(partResult).append(" ");
        }
    }
    String finalResult = result.toString().replaceAll("  ", " ");
    System.out.print(finalResult.trim());
//    System.out.print(result.toString().trim());
}

    private void printRes(int num, int place, int inputSegments, NumberSpellerLang lang, StringBuilder partResult) {
    if (num == 0 && place < inputSegments) {
        return;
    }

    boolean moreFlag = false;
    if (num > 99) {
        String hundreds = lang.getSmall()[num / 100] + " " + lang.getExt()[1];
        if (num % 100 != 0) {
            hundreds += " " + lang.getExt()[0] + "";
        }
        moreFlag = true;
        partResult.append(applySpecificConversions(hundreds, lang)).append(" ");
    }
    num = num % 100;

    if (num == 0 && place < inputSegments) {
        // Append scale word for all segments except the last one
        partResult.append(lang.getScale()[place]).append(" ");
        return;
    }

    if (num == 0 && !moreFlag) {
        partResult.append(lang.getSmall()[0]);
    } else if (num < 20) {
        partResult.append(lang.getSmall()[num]);
    } else {
        if ("TenAfter".equals(lang.getExt()[2]) && num % 10 != 0) {
            partResult.append(lang.getSmall()[num % 10]).append(lang.getExt()[0]).append(lang.getTens()[num / 10]);
        } else {
            if (num % 10 == 0 && num != 0) {
                partResult.append(lang.getTens()[num / 10]);
            } else if (num != 0) {
                partResult.append(lang.getTens()[num / 10]).append("-").append(lang.getSmall()[num % 10]);
            }
        }
    }

    // Append scale word for all segments except the last one
    if (place != 0) {
        partResult.append(" ").append(lang.getScale()[place]);
    }

    // Apply specific conversions to the current partResult
    String partResultString = partResult.toString().trim();
    partResult.setLength(0); // Clear the partResult
    partResult.append(applySpecificConversions(partResultString, lang));
}

    private String applySpecificConversions(String input, NumberSpellerLang lang) {
//    	System.out.println("----"+input+"----");
        for (Map.Entry<String, String> entry : lang.getSpecificConversions().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String mode = lang.getSpecificConversionsMode().get(key);
            if ("exact".equals(mode)) {
                if (input.equals(key)) {
                    input = value;
                    break; // Stop processing further conversions if an exact match is found
                }
            } else if ("contains".equals(mode)) {
                input = input.replace(key, value);
            }
        }
        return input;
    }



}
