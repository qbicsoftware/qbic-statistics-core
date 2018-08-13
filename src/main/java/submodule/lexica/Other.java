package submodule.lexica;

import java.util.ArrayList;
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

    private static final List<String> enumList;

    static {
        List<String> list = new ArrayList<>();
        for (Other other : Other.values()) {
            String name = other.toString();
            list.add(name);
        }
        enumList = Arrays.asList(list.toArray(new String[0]));
    }


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
