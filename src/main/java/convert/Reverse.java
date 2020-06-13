package convert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
    private final List<String> list;

    public Reverse(List<String> list) {
        this.list = list;
    }

    public List<String> getReverseList() {
        List<String> reverseList = new ArrayList<>(list);
        Collections.reverse(reverseList);
        return reverseList;
    }
}
