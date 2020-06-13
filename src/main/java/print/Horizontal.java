package print;

import java.util.List;

public class Horizontal {
    private final List<String> list;

    public Horizontal(List<String> list) {
        this.list = list;
    }

    public String getHorizontal() {
        return String.join(" ", list);
    }

    public void outHorizontal() {
        System.out.println(getHorizontal());
    }
}
