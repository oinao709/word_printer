package print;

import java.util.List;

public class Vertical {
    private final List<String> list;

    public Vertical(List<String> list) {
        this.list = list;
    }

    public void outVertical() {
        list.forEach(System.out::println);
    }
}
