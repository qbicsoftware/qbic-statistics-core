package submodule.lexica;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author fhanssen
 *
 */
public enum Other {
    Multi_omics("Multi-omics");

    private final String original;

    private static final List<String> enumList = Arrays.asList(Stream.of(Other.values()).map(Other::name).toArray(String[]::new));


    Other(String original){
        this.original = original;
    }

    @Override
    public String toString(){
        return this.original;
    }

    public static List<String> getList(){
        return enumList;
    }

}
