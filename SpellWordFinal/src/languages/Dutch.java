package languages;

import java.util.Map;

public class Dutch implements NumberSpellerLang {
    private final String[] scale = {"", "duizend", "miljoen", "miljard", "biljoen", "biljard", 
                                    "triljoen", "triljard", "quadriljoen", "quadriljard", 
                                    "quintiljoen", "quintiljard", "sextiljoen", "sextiljard", 
                                    "septiljoen", "septiljard", "octiljoen", "octiljard", 
                                    "noniljoen", "noniljard", "deciljoen", "deciljard", 
                                    "undeciljoen", "undeciljard", "duodeciljoen", "duodeciljard"};

    private final String[] small = {"nul", "een", "twee", "drie", "vier", "vijf", "zes", "zeven", 
                                    "acht", "negen", "tien", "elf", "twaalf", "dertien", "veertien", 
                                    "vijftien", "zestien", "zeventien", "achttien", "negentien"};

    private final String[] tens = {"", "", "twintig", "dertig", "veertig", "vijftig", "zestig", 
                                   "zeventig", "tachtig", "negentig"};

    private final String[] ext = {"en", "honderd","TenAfter"};

    private final Map<String, String> specificConversions = Map.of(
//            1000, "duizend",
//            100, "honderd"
    );

    private final Map<String, String> specificConversionsMode = Map.of(
//          "foo","contains"
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
