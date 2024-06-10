package languages;
import java.util.Map;
public class Indonesian implements NumberSpellerLang {
    private final String[] scale = {"", "ribu", "juta", "miliar", "triliun", "kuadriliun", 
                                    "kuantiliun", "sekstiliun", "septiliun", "oktiliun", 
                                    "noniliun", "desiliun", "undesiliun", "duodesiliun", 
                                    "tredesiliun", "kuattuordesiliun", "kuindesiliun", 
                                    "seksdesiliun", "septendesiliun", "oktodesiliun", 
                                    "novemdesiliun", "vijintiliun", "unvijintiliun"};

    private final String[] small = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", 
                                    "delapan", "sembilan", "sepuluh", "sebelas", "dua belas", 
                                    "tiga belas", "empat belas", "lima belas", "enam belas", 
                                    "tujuh belas", "delapan belas", "sembilan belas"};

    private final String[] tens = {"", "", "dua puluh", "tiga puluh", "empat puluh", "lima puluh", 
                                   "enam puluh", "tujuh puluh", "delapan puluh", "sembilan puluh"};

    private final String[] ext = {"dan", "ratus","TenFirst"};

    private final Map<String, String> specificConversions = Map.of(
            "satu ratus", "seratus",
            "satu ribu","seribu",
            "satu juta","sejuta"
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
