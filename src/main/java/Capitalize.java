import java.util.ArrayList;
import java.util.List;

public class Capitalize {
    private final List<String> list;

    public Capitalize(List<String> list) {
        this.list = list;
    }

    public List<String> getCapitalizeList() {
        List<String> outputList = new ArrayList<>();
        for (String word : list) {
            String outputWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            outputList.add(outputWord);
        }
        return outputList;
    }
}
