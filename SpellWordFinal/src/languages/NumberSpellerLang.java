package languages;

import java.util.Map;
public interface NumberSpellerLang {
    String[] getScale();
    String[] getSmall();
    String[] getTens();
    String[] getExt();
    
    
    Map<String, String> getSpecificConversions();
    Map<String, String> getSpecificConversionsMode();
}
