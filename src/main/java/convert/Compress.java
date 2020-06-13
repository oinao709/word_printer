package convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compress {
    private final List<String> list;

    public Compress(List<String> list) {
        this.list = list;
    }

    public List<String> getCompressList() {
        List<String> compressList = new ArrayList<>();
        for (int m = 0; m < list.size(); m++) {
            String word = list.get(m);
            List<String> strList = new ArrayList<>(Arrays.asList(word.split("")));
            String outputWord = "";
            int l = 0;
            for (l = 0; l < strList.size()-1; l++) {
                if (!strList.get(l).equals(strList.get(l+1))) {
                    outputWord = outputWord + strList.get(l);
                }
            }
            outputWord = outputWord + strList.get(l);
            compressList.add(outputWord);
        }
        return compressList;
    }
}
