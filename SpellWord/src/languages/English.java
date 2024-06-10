package languages;
import java.util.Map;
public class English implements NumberSpellerLang {
    private final String[] scale = {"", "thousand", "million", "billion", "trillion", "quadrillion", 
                                    "quintillion", "sextillion", "septillion", "octillion", 
                                    "nonillion", "decillion", "undecillion", "duodecillion", 
                                    "tredecillion", "quattuordecillion", "quindecillion", 
                                    "sedecillion", "septendecillion", "octodecillion", 
                                    "novendecillion", "vigintillion", "unvigintillion"};

    private final String[] small = {"zero", "one", "two", "three", "four", "five", "six", "seven", 
                                    "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", 
                                    "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", 
                                   "seventy",                                   "eighty", "ninety"};

    private final String[] ext = {"and", "hundred","TenFirst"};

    private final Map<String, String> specificConversions = Map.of(
//            "foo", "bar"
    );
    
    @Override
    public Map<String, String> getSpecificConversions() {
        return specificConversions;
    }
    
    
    @Override
    public String[] getScale() {
        return scale;
    }

    @Override
    public String[] getSmall() {
        return small;
    }

    @Override
    public String[] getTens() {
        return tens;
    }

    @Override
    public String[] getExt() {
        return ext;
    }
    

    
}

