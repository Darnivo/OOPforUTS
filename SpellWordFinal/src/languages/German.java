package languages;

import java.util.Map;

public class German implements NumberSpellerLang {
    private final String[] scale = {"", "tausend", "Million", "Milliarde", "Billion", "Billiarde", 
                                    "Trillion", "Quadrillion", "Quintillion", "Sextillion", 
                                    "Septillion", "Oktillion", "Nonillion", "Dezillion", 
                                    "Undezillion", "Duodezillion", "Tredezillion", "Quattuordezillion", 
                                    "Quindezillion", "Sedeczillion", "Septendezillion", "Oktodezillion", 
                                    "Novemdezillion", "Vigintillion", "Unvigintillion"};

    private final String[] small = {"null", "ein", "zwei", "drei", "vier", "fünf", "sechs", "sieben", 
                                    "acht", "neun", "zehn", "elf", "zwölf", "dreizehn", "vierzehn", 
                                    "fünfzehn", "sechzehn", "siebzehn", "achtzehn", "neunzehn"};

    private final String[] tens = {"", "", "zwanzig", "dreißig", "vierzig", "fünfzig", "sechzig", 
                                   "siebzig", "achtzig", "neunzig"};

    private final String[] ext = {"und", "hundert","TenAfter"};

    private final Map<String, String> specificConversions = Map.of(
//  	111, "one thousand"
    );
    
    private final Map<String, String> specificConversionsMode = Map.of(
//  	"foo","contains"
    );
    
    @Override
    public Map<String, String> getSpecificConversions() {
        return specificConversions;
    }
    
    @Override
    public Map<String, String> getSpecificConversionsMode() {
        return specificConversionsMode;
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
