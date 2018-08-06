package submodule.lexica;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author fhanssen
 *
 */
public enum Translator {
    CELL_LYSATE("CELL_LYSATE", "Cell Lysate"),
    SMALLMOLECULES("SMALLMOLECULES", "Small Molecules"),
    MA("MA", "Microarray"),
    MS("MS", "Mass Spectrometry"),
    Q_MICROARRAY_RUN("Q_MICROARRAY_RUN", "Microarray"),
    Q_MS_RUN("Q_MS_RUN", "Mass Spectrometry"),
    Q_NGS_SINGLE_SAMPLE_RUN("Q_NGS_SINGLE_SAMPLE_RUN", "NGS"),
    Q_NGS("NGS", "NGS"),
    PX("PX", "Proteomics"),
    LX("LX", "Ligandomics");

    private final String original;
    private final String translation;

    private static final List<String> enumList = Arrays.asList(Stream.of(Translator.values()).map(Translator::name).toArray(String[]::new));


    Translator(String original, String translation){
        this.original = original;
        this.translation = translation;
    }

    @Override
    public String toString(){
        return this.original;
    }

    public String getTranslation(){
        return this.translation;
    }

    public static List<String> getList(){
        return enumList;
    }

    public String getOriginal() {
        return original;
    }

    public static String getOriginal(String translation){
        for(Translator s : Translator.values()){
            if(s.getTranslation().equals(translation)){
                return s.getOriginal();
            }
        }
        return "";
    }

    public static String getTranslation(String original){
        for(Translator s : Translator.values()){
            if(s.getOriginal().equals(original)){
                return s.getTranslation();
            }
        }
        return "";
    }
}
